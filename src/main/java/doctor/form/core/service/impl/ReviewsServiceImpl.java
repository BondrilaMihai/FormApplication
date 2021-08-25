package doctor.form.core.service.impl;

import doctor.form.core.mapper.ReviewMapper;
import doctor.form.core.model.ReviewsDto;
import doctor.form.core.repository.MoviesRepository;
import doctor.form.core.repository.ReviewsRepository;
import doctor.form.core.repository.UserRepository;
import doctor.form.core.repository.entity.Movies;
import doctor.form.core.repository.entity.Reviews;
import doctor.form.core.repository.entity.User;
import doctor.form.core.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewsServiceImpl implements ReviewsService {

    @Autowired
    ReviewsRepository reviewsRepository;

    @Autowired
    ReviewMapper reviewMapper;

    @Autowired
    MoviesRepository moviesRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<ReviewsDto> getReviews(Pageable pageable, String movieId) {
        List<Reviews> reviews = reviewsRepository.findAllByMovieReview_Id(movieId, pageable).getContent();
        List<ReviewsDto> reviewsDtos = new ArrayList<>();

        for(Reviews review : reviews) {
            ReviewsDto reviewsDto = reviewMapper.toDto(review);
            User user = review.getUser();

            reviewsDto.setMovieId(movieId);
            reviewsDto.setUserId(user.getId());
            reviewsDto.setUserFirstName(user.getFirstName());
            reviewsDto.setUserLastName(user.getLastName());
            reviewsDtos.add(reviewsDto);
        }
        return reviewsDtos;
    }

    @Override
    public ReviewsDto addReview(ReviewsDto reviewsDto) {
        Reviews reviews = reviewMapper.toEntity(reviewsDto);

        setMovieToReview(reviews, reviewsDto.getMovieId());
        setUserToReview(reviews, reviewsDto.getUserId());
        return reviewMapper.toDto(reviewsRepository.save(reviews));
    }

    private void setMovieToReview(Reviews reviews, String movieId) {
        Optional<Movies> movie = moviesRepository.findById(movieId);
        movie.ifPresent(reviews::setMovieReview);
    }

    private void setUserToReview(Reviews reviews, String userId) {
        Optional<User> user = userRepository.findById(userId);
        user.ifPresent(reviews::setUser);
    }
}

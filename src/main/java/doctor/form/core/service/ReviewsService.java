package doctor.form.core.service;

import doctor.form.core.model.ReviewsDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ReviewsService {
    List<ReviewsDto> getReviews(Pageable pageable, String movieId);

    ReviewsDto addReview(ReviewsDto reviewsDto);
}

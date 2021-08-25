package doctor.form.core.service.impl;

import doctor.form.core.mapper.MoviesMapper;
import doctor.form.core.model.MoviesDto;
import doctor.form.core.repository.MoviesRepository;
import doctor.form.core.repository.entity.Movies;
import doctor.form.core.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    MoviesRepository moviesRepository;

    @Autowired
    MoviesMapper moviesMapper;

    @Override
    public List<MoviesDto> getMovies(Pageable pageable, String movieTitle) {
        if (movieTitle != null && !movieTitle.equals("")) {
            Page<Movies> movies = moviesRepository.findAllByNameContainingIgnoreCase(movieTitle, pageable);
            return moviesMapper.toDtos(movies.getContent());
        } else {
            Page<Movies> movies = moviesRepository.findAll(pageable);
            return moviesMapper.toDtos(movies.getContent());
        }
    }

    @Override
    public List<MoviesDto> getAllMoviesName() {
        List<Movies> moviesList = moviesRepository.findAll();
        return moviesList.stream().map(this::movieToDtoWithoutForeignEntity).collect(Collectors.toList());
    }

    private MoviesDto movieToDtoWithoutForeignEntity(Movies movie) {
        MoviesDto moviesDto = new MoviesDto();

        moviesDto.setId(movie.getId());
        moviesDto.setName(movie.getName());
        return moviesDto;
    }
}

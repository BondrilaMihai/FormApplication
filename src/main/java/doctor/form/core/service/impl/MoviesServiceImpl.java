package doctor.form.core.service.impl;

import doctor.form.core.mapper.MoviesMapper;
import doctor.form.core.model.MoviesDto;
import doctor.form.core.repository.MoviesRepository;
import doctor.form.core.repository.entity.Movies;
import doctor.form.core.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<MoviesDto> getAllMovies() {
        List<Movies> moviesList = moviesRepository.findAll();
//        moviesList.stream().map()
        return null;
    }

    @Override
    public List<MoviesDto> getAllMoviesName() {
        List<Movies> moviesList = moviesRepository.findAll();
        return moviesList.stream().map(this::movieToDtoWithoutForeignEntity).collect(Collectors.toList());
    }

    MoviesDto movieToDtoWithoutForeignEntity(Movies movie) {
        MoviesDto moviesDto = new MoviesDto();

        moviesDto.setId(movie.getId());
        moviesDto.setName(movie.getName());
        return moviesDto;
    }
}

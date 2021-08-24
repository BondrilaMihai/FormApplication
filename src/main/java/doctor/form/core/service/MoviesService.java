package doctor.form.core.service;

import doctor.form.core.model.MoviesDto;

import java.util.List;

public interface MoviesService {

    List<MoviesDto>  getAllMovies();

    List<MoviesDto>  getAllMoviesName();
}

package doctor.form.core.service;

import doctor.form.core.model.MoviesDto;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MoviesService {

    List<MoviesDto>  getAllMoviesName();

    List<MoviesDto> getMovies(Pageable pageable, String movieTitle);
}

package doctor.form.core.mapper;

import doctor.form.core.model.MoviesDto;
import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.Movies;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MoviesMapper {

    List<Movies> toEntities(List<MoviesDto> moviesDtoList);

    List<MoviesDto> toDtos(List<Movies> moviesList);

    Movies toEntity(MoviesDto moviesDto);

    MoviesDto toDto(Movies movies);
}

package doctor.form.core.mapper;

import doctor.form.core.model.ReservedMovieDto;
import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.ReservedMovie;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservedMovieMapper {

    List<ReservedMovie> toEntities(List<ReservedMovieDto> reservedMovieDtoList);

    List<ReservedMovieDto> toDtos(List<ReservedMovie> reservedMovieList);

    ReservedMovie toEntity(ReservedMovieDto reservedMovieDto);

    ReservedMovieDto toDto(ReservedMovie reservedMovie);
}

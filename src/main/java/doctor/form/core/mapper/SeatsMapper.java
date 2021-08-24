package doctor.form.core.mapper;

import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeatsMapper {

    List<Seats> toEntities(List<SeatsDto> seatsDtoList);

    List<SeatsDto> toDtos(List<Seats> seatsList);

    Seats toEntity(SeatsDto seatsDto);

    SeatsDto toDto(Seats seats);
}

package doctor.form.core.mapper;

import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SeatsMapper {

    List<Seats> toEntities(List<SeatsDto> doctorDto);

    List<SeatsDto> toDtos(List<Seats> doctor);

    @Mapping(source = "status", target = "seatStatus")
    @Mapping(source = "type", target = "seatType")
    Seats toEntity(SeatsDto doctorDto);

    @Mapping(source = "seatStatus", target = "status")
    @Mapping(source = "seatType", target = "type")
    SeatsDto toDto(Seats doctor);
}

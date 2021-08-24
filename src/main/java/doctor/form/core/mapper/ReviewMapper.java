package doctor.form.core.mapper;

import doctor.form.core.model.ReviewsDto;
import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.Reviews;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    List<Reviews> toEntities(List<ReviewsDto> reviewsDtoList);

    List<ReviewsDto> toDtos(List<Reviews> reviewsList);

    Reviews toEntity(ReviewsDto reviewsDto);

    ReviewsDto toDto(Reviews reviews);
}

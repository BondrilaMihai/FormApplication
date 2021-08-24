package doctor.form.core.mapper;

import doctor.form.core.model.NotificationsDto;
import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.Notifications;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface NotificationsMapper {

    List<Notifications> toEntities(List<NotificationsDto> notificationsDtoList);

    List<NotificationsDto> toDtos(List<Notifications> notificationsList);

    Notifications toEntity(NotificationsDto notificationsDto);

    NotificationsDto toDto(Notifications notifications);
}

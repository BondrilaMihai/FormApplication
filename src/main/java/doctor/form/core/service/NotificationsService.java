package doctor.form.core.service;

import doctor.form.core.controller.response.NotificationPaginationModel;
import doctor.form.core.model.NotificationsDto;
import org.springframework.data.domain.Pageable;


public interface NotificationsService {

    NotificationPaginationModel getNotifications(Pageable pageable);

    void openNotification(String notificationId);

    NotificationPaginationModel getUnopenedNotifications(Pageable pageable);
}

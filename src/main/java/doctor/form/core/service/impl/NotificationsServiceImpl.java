package doctor.form.core.service.impl;

import doctor.form.core.controller.response.NotificationPaginationModel;
import doctor.form.core.mapper.NotificationsMapper;
import doctor.form.core.repository.NotificationsRepository;
import doctor.form.core.repository.entity.Notifications;
import doctor.form.core.service.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class NotificationsServiceImpl implements NotificationsService {

    @Autowired
    NotificationsMapper notificationsMapper;

    @Autowired
    NotificationsRepository notificationsRepository;

    @Override
    public NotificationPaginationModel getNotifications(Pageable pageable) {
        Page<Notifications> notifications = notificationsRepository.findAll(pageable);
        return getNotificationPaginationModel(notifications);
    }

    @Override
    public void openNotification(String notificationId) {
        notificationsRepository.openNotification(notificationId);
    }

    @Override
    public NotificationPaginationModel getUnopenedNotifications(Pageable pageable) {
        Page<Notifications> notifications = notificationsRepository.findAllByIsOpenAndCreateDateNotNull(false, pageable);
        return getNotificationPaginationModel(notifications);
    }

    private NotificationPaginationModel getNotificationPaginationModel(Page<Notifications> notifications) {
        NotificationPaginationModel notificationPaginationModel = new NotificationPaginationModel();
        notificationPaginationModel.setTotalElements((int)notifications.getTotalElements());
        notificationPaginationModel.setNotifications(notifications.hasContent()
                ? notificationsMapper.toDtos(notifications.getContent())
                : new ArrayList<>());

        return notificationPaginationModel;
    }
}

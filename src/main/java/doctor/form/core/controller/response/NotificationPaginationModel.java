package doctor.form.core.controller.response;

import doctor.form.core.model.NotificationsDto;

import java.util.List;

public class NotificationPaginationModel {

    private Integer totalElements;
    private List<NotificationsDto> notifications;

    public NotificationPaginationModel() {
    }

    public NotificationPaginationModel(Integer totalElements, List<NotificationsDto> notifications) {
        this.totalElements = totalElements;
        this.notifications = notifications;
    }

    public Integer getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    public List<NotificationsDto> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationsDto> notifications) {
        this.notifications = notifications;
    }
}

package doctor.form.core.controller;

import doctor.form.core.controller.response.NotificationPaginationModel;
import doctor.form.core.model.MoviesDto;
import doctor.form.core.model.NotificationsDto;
import doctor.form.core.service.MoviesService;
import doctor.form.core.service.NotificationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/notifications")
public class NotificationsController {

    @Autowired
    private NotificationsService notificationsService;

    @GetMapping("/get-notifications")
    public ResponseEntity<NotificationPaginationModel> getNotifications(@RequestParam Integer page, @RequestParam Integer size) {
        Pageable pageable = PageRequest.of(page, size, Sort.by("createDate").descending());
        return new ResponseEntity<NotificationPaginationModel>(notificationsService.getNotifications(pageable), HttpStatus.OK);
    }

    @GetMapping("/open-notification/{notificationId}")
    public ResponseEntity<Void> openNotification(@PathVariable String notificationId) {
        notificationsService.openNotification(notificationId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

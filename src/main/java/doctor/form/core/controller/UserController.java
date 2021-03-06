package doctor.form.core.controller;

import doctor.form.core.model.UserDto;
import doctor.form.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserInformation(@PathVariable String userId) {
        UserDto userResponse = userService.getUserInformation(userId);
        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }
}

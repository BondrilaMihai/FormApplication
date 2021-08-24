package doctor.form.core.service;

import doctor.form.core.model.UserDto;

import java.util.UUID;

public interface UserService {

    UserDto getUserInformation(UUID userId);
}

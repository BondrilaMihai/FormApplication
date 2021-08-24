package doctor.form.core.service.impl;

import doctor.form.core.mapper.UserMapper;
import doctor.form.core.model.UserDto;
import doctor.form.core.repository.UserRepository;
import doctor.form.core.repository.entity.User;
import doctor.form.core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserMapper userMapper;

    @Override
    public UserDto getUserInformation(UUID userId) {
        Optional<User> user = userRepository.findById(userId);
        return user.map(value -> userMapper.toDto(value)).orElse(null);
    }
}

package doctor.form.core.mapper;

import doctor.form.core.model.UserDto;
import doctor.form.core.repository.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    List<User> toEntities(List<UserDto> userDtoList);

    List<UserDto> toDtos(List<User> userList);

    User toEntity(UserDto userDto);

    UserDto toDto(User user);
}

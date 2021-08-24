package doctor.form.core.mapper;

import doctor.form.core.model.CustomerDto;
import doctor.form.core.model.SeatsDto;
import doctor.form.core.repository.entity.Customer;
import doctor.form.core.repository.entity.Seats;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    List<Customer> toEntities(List<CustomerDto> customerDtoList);

    List<CustomerDto> toDtos(List<Customer> customerList);

    Customer toEntity(CustomerDto customerDto);

    CustomerDto toDto(Customer customer);
}

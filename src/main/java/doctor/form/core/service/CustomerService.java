package doctor.form.core.service;

import doctor.form.core.model.CustomerDto;

public interface CustomerService {
    CustomerDto registerCustomer(CustomerDto customerDto);

    CustomerDto loginAsCustomer(CustomerDto customerDto) throws Exception;

    CustomerDto getLoggedCustomer();
}

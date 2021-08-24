package doctor.form.core.service.impl;

import doctor.form.core.config.ConfigClass;
import doctor.form.core.errors.UserException;
import doctor.form.core.jwt.JwtTokenUtil;
import doctor.form.core.mapper.CustomerMapper;
import doctor.form.core.model.CustomerDto;
import doctor.form.core.model.UserDto;
import doctor.form.core.repository.CustomerRepository;
import doctor.form.core.repository.UserRepository;
import doctor.form.core.repository.entity.Customer;
import doctor.form.core.repository.entity.User;
import doctor.form.core.security.SecurityUserService;
import doctor.form.core.security.SecurityUtils;
import doctor.form.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerMapper customerMapper;

    @Autowired
    UserRepository userRepository;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    SecurityUserService securityUserService;

    @Autowired
    ConfigClass configClass;

    public CustomerDto registerCustomer(CustomerDto customerDto) {

        Optional<Customer> byEmail = customerRepository.findByEmail(customerDto.getEmail());
        if (!byEmail.isPresent()) {
            customerDto.setPassword(configClass.passwordEncoder().encode(customerDto.getPassword()));
            customerDto.setAuthority("CUSTOMER");
            CustomerDto registerCustomer = customerMapper.toDto(customerRepository.save(customerMapper.toEntity(customerDto)));
            registerCustomer.setAddress(customerDto.getAddress());
            saveUserProfile(registerCustomer);
            return registerCustomer;
        } else {
            throw new UserException(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "Clientul exista deja!");
        }
    }

    private void saveUserProfile(CustomerDto customerDto) {
        if (customerDto.getId() != null && !customerDto.getId().equals("")) {
            User user = new User();

            user.setId(customerDto.getId().toString());
            user.setLastName(customerDto.getLastName());
            user.setFirstName(customerDto.getFirstName());
            user.setEmail(customerDto.getEmail());
            user.setAddress(customerDto.getAddress());
            user.setPhoneNumber(customerDto.getPhoneNumber());
            user.setPoints(0);
            userRepository.save(user);
        }
    }

    public CustomerDto loginAsCustomer(CustomerDto customerDto) throws Exception {
        Optional<Customer> customerByEmail = customerRepository.findByEmail(customerDto.getEmail());
        if (!customerByEmail.isPresent()) {
            throw new UserException(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "Clientul nu exista!");
        } else {
            authenticate(customerDto.getEmail(), customerDto.getPassword());
            UserDetails user = securityUserService.loadUserByUsername(customerDto.getEmail());
            String token = jwtTokenUtil.generateToken(user);

            SecurityUtils.setJwtToken(token);

            CustomerDto existingCustomer = customerMapper.toDto(customerByEmail.get());
            existingCustomer.setToken(token);

            authenticate(customerDto.getEmail(), customerDto.getPassword());
            return existingCustomer;
        }
    }

    private void authenticate(String email, String password) throws Exception {
        Objects.requireNonNull(email);
        Objects.requireNonNull(password);

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new UserException(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST, "Username sau parola gresite!");
        }
    }

    public CustomerDto getLoggedCustomer() {
        String userId = SecurityUtils.getUserId();

        Optional<Customer> byId = customerRepository.findById(userId);
        if (!byId.isPresent()) {
            return null;
        } else {
            String jwtToken = SecurityUtils.getJwtToken();
            CustomerDto customerDTO = customerMapper.toDto(byId.get());
            customerDTO.setToken(jwtToken);
            return customerDTO;
        }
    }


}

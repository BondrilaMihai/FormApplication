package doctor.form.core.security;

import doctor.form.core.errors.UserException;
import doctor.form.core.model.CustomUserDetails;
import doctor.form.core.repository.CustomerRepository;
import doctor.form.core.repository.entity.Customer;
import org.springframework.stereotype.Service;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collections;
import java.util.Optional;


@Service
public class SecurityUserService implements UserDetailsService {
    private final CustomerRepository customerRepository;

    public SecurityUserService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomUserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<Customer> byEmail = customerRepository.findByEmail(email);
        if (!byEmail.isPresent()) {
            throw new UserException(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND, "Utilizatorul nu a fost gasit");
        }

        Customer customer = byEmail.get();
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority(customer.getAuthority());
        return new CustomUserDetails(customer.getEmail(), customer.getPassword(), Collections.singleton(authority), customer.getId().toString(), customer);
    }
}

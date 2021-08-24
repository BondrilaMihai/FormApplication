package doctor.form.core.model;

import doctor.form.core.repository.entity.Customer;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;
import java.util.UUID;

public class CustomUserDetails extends User {

    private String id;
    private Customer currentCustomer;

    public CustomUserDetails(String username, String password, Collection<? extends GrantedAuthority> authorities, String id, Customer currentCustomer) {
        super(username, password, authorities);
        this.id = id;
        this.currentCustomer = currentCustomer;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Customer getCurrentCustomer() {
        return currentCustomer;
    }

    public void setCurrentCustomer(Customer currentCustomer) {
        this.currentCustomer = currentCustomer;
    }


}

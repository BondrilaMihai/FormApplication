package doctor.form.core.security;

import doctor.form.core.model.CustomUserDetails;
import doctor.form.core.model.CustomerDto;
import doctor.form.core.repository.entity.Customer;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SecurityUtils {
    private static String jwtToken;

    public static String getUserId() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        CustomerDto customUserDetails = (CustomerDto) authentication.getPrincipal();

        return customUserDetails.getId();
    }

    public static Customer getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        CustomUserDetails customUserDetails = (CustomUserDetails) authentication.getPrincipal();

        return customUserDetails.getCurrentCustomer();
    }

    public static void setJwtToken(String jwtToken) {
        SecurityUtils.jwtToken = jwtToken;
    }

    public static String getJwtToken() {
        return SecurityUtils.jwtToken;
    }
}

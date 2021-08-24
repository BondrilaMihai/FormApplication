package doctor.form.core.controller;

import doctor.form.core.model.CustomerDto;
import doctor.form.core.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/register")
    public ResponseEntity<CustomerDto> registerNewCustomer(@RequestBody CustomerDto registerBody) {
        CustomerDto registeredCustomer = customerService.registerCustomer(registerBody);

        return new ResponseEntity<>(registeredCustomer, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<CustomerDto> loginAsCustomer(@RequestBody CustomerDto loginBody) throws Exception {
        CustomerDto loggedCustomer = customerService.loginAsCustomer(loginBody);

        return new ResponseEntity<>(loggedCustomer, HttpStatus.ACCEPTED);
    }

    @GetMapping("")
    public ResponseEntity<CustomerDto> getLoggedCustomer() {
        CustomerDto loggedCustomer = customerService.getLoggedCustomer();

        return new ResponseEntity<>(loggedCustomer, HttpStatus.ACCEPTED);
    }
}

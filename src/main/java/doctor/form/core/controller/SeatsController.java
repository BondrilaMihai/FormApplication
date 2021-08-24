package doctor.form.core.controller;

import doctor.form.core.model.SeatsDto;
import doctor.form.core.service.SeatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reserved")
public class SeatsController {

    @Autowired
    private SeatsService seatsService;

    @GetMapping("/get-seats")
    public List<SeatsDto> getSeats() {
        return seatsService.getSeats();
    }

}


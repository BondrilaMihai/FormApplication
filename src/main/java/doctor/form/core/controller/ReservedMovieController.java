package doctor.form.core.controller;

import doctor.form.core.controller.request.ReserveSeatRequest;
import doctor.form.core.model.ReservedMovieDto;
import doctor.form.core.repository.entity.ReservedMovie;
import doctor.form.core.service.ReservedMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/movieReserved")
public class ReservedMovieController {

    @Autowired
    private ReservedMovieService reservedMovieService;

    @GetMapping("/{movieId}")
    public ResponseEntity<List<ReservedMovieDto>> getAllReservedMovies(@PathVariable String movieId) {
        return new ResponseEntity<>(reservedMovieService.getAllReservedMovies(movieId), HttpStatus.OK);
    }

    @PutMapping("/reserve-seat")
    public ReservedMovieDto reserveSeat(@RequestBody ReserveSeatRequest reserveRequest) {
        return reservedMovieService.reserveSeat(reserveRequest);
    }


}

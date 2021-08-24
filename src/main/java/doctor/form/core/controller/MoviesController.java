package doctor.form.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

    @PostMapping("/get-movies")
    public ResponseEntity<List<MoviesDto>> getMovies(@RequestBody MovieRequest movieRequest) {
        return new ResponseEntity<>(moviesService.getMovies(movieRequest), HttpStatus.OK);
    }

    @GetMapping("/get-all-movies")
    public ResponseEntity<List<MoviesDto>> getAllMovies() {
        return new ResponseEntity<>(moviesService.getAllMovies(), HttpStatus.OK);
    }
}

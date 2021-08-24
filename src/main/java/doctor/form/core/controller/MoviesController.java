package doctor.form.core.controller;

import doctor.form.core.model.MoviesDto;
import doctor.form.core.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesService moviesService;

//    @PostMapping("/get-movies")
//    public ResponseEntity<List<MoviesDto>> getMovies(@RequestBody MovieRequest movieRequest) {
//        return new ResponseEntity<>(moviesService.getMovies(movieRequest), HttpStatus.OK);
//    }

    @GetMapping("/get-all-movies")
    public ResponseEntity<List<MoviesDto>> getAllMovies() {
        return new ResponseEntity<>(moviesService.getAllMovies(), HttpStatus.OK);
    }

    @GetMapping("/get-movies-name")
    public ResponseEntity<List<MoviesDto>> getAllMoviesName() {
        return new ResponseEntity<>(moviesService.getAllMoviesName(), HttpStatus.OK);
    }
}

package doctor.form.core.controller;

import doctor.form.core.controller.request.MovieRequest;
import doctor.form.core.model.MoviesDto;
import doctor.form.core.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @PostMapping("/get-movies")
    public ResponseEntity<List<MoviesDto>> getMovies(@RequestBody MovieRequest requestBody) {
        Pageable pageable;
        if (requestBody.getSortBy() != null && !requestBody.getSortBy().equals("")) {
            pageable = PageRequest.of(requestBody.getPage(), requestBody.getPageSize(), Sort.by(requestBody.getSortBy()).descending());
        } else {
            pageable = PageRequest.of(requestBody.getPage(), requestBody.getPageSize());
        }
        return new ResponseEntity<>(moviesService.getMovies(pageable, requestBody.getMovieTitle()), HttpStatus.OK);
    }

    @GetMapping("/get-movies-name")
    public ResponseEntity<List<MoviesDto>> getAllMoviesName() {
        return new ResponseEntity<>(moviesService.getAllMoviesName(), HttpStatus.OK);
    }
}

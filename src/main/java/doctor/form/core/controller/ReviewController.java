package doctor.form.core.controller;

import doctor.form.core.controller.request.ReviewRequest;
import doctor.form.core.model.ReviewsDto;
import doctor.form.core.service.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/reviews")
public class ReviewController {

    @Autowired
    ReviewsService reviewsService;

    @PostMapping("/get-reviews")
    public ResponseEntity<List<ReviewsDto>> getReviews(@RequestBody ReviewRequest requestBody) {
        Pageable pageable = PageRequest.of(requestBody.getPage(), requestBody.getPageSize());
        return new ResponseEntity<>(reviewsService.getReviews(pageable, requestBody.getMovieId()), HttpStatus.OK);
    }

    @PostMapping("/add-review")
    public ResponseEntity<ReviewsDto> addReview(@RequestBody ReviewsDto requestBody) {
        return new ResponseEntity<>(reviewsService.addReview(requestBody), HttpStatus.OK);
    }
}

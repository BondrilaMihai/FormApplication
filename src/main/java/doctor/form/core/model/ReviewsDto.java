package doctor.form.core.model;

import doctor.form.core.repository.entity.Movies;
import doctor.form.core.repository.entity.User;

import java.util.UUID;

public class ReviewsDto {

    private String id;
    private String message;
    private Integer note;
    private UserDto user;
    private MoviesDto movieReview;

    public ReviewsDto() {
    }

    public ReviewsDto(String id, String message, Integer note, UserDto user, MoviesDto movieReview) {
        this.id = id;
        this.message = message;
        this.note = note;
        this.user = user;
        this.movieReview = movieReview;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public MoviesDto getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(MoviesDto movieReview) {
        this.movieReview = movieReview;
    }
}

package doctor.form.core.model;

import java.util.List;

public class MoviesDto {

    private String id;
    private String name;
    private Integer note;
    private List<ReservedMovieDto> reservedMovies;
    private List<ReviewsDto> reviews;

    public MoviesDto() {
    }

    public MoviesDto(String id, String name, Integer note, List<ReservedMovieDto> reservedMovies, List<ReviewsDto> reviews) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.reservedMovies = reservedMovies;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public List<ReservedMovieDto> getReservedMovies() {
        return reservedMovies;
    }

    public void setReservedMovies(List<ReservedMovieDto> reservedMovies) {
        this.reservedMovies = reservedMovies;
    }

    public List<ReviewsDto> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewsDto> reviews) {
        this.reviews = reviews;
    }
}

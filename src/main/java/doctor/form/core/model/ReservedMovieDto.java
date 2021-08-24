package doctor.form.core.model;

import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.repository.entity.Movies;
import doctor.form.core.repository.entity.Seats;

import java.util.UUID;

public class ReservedMovieDto {

    private String id;
    private SeatStatusEnum seatStatus;
    private SeatsDto seat;
    private MoviesDto movie;

    public ReservedMovieDto() {
    }

    public ReservedMovieDto(String id, SeatStatusEnum seatStatus, SeatsDto seat, MoviesDto movie) {
        this.id = id;
        this.seatStatus = seatStatus;
        this.seat = seat;
        this.movie = movie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SeatStatusEnum getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatusEnum seatStatus) {
        this.seatStatus = seatStatus;
    }

    public SeatsDto getSeat() {
        return seat;
    }

    public void setSeat(SeatsDto seat) {
        this.seat = seat;
    }

    public MoviesDto getMovie() {
        return movie;
    }

    public void setMovie(MoviesDto movie) {
        this.movie = movie;
    }
}

package doctor.form.core.model;

import doctor.form.core.model.enums.SeatStatusEnum;


public class ReservedMovieDto {

    private String id;
    private SeatStatusEnum seatStatus;
    private String movieId;
    private String seatId;

    public ReservedMovieDto() {
    }

    public ReservedMovieDto(String id, SeatStatusEnum seatStatus, String movieId, String seatId) {
        this.id = id;
        this.seatStatus = seatStatus;
        this.movieId = movieId;
        this.seatId = seatId;
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

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }
}

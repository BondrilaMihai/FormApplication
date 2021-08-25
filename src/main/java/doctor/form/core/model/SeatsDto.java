package doctor.form.core.model;

import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.model.enums.SeatTypeEnum;

public class SeatsDto {

    private String id;
    private String seatNumber;
    private SeatStatusEnum seatStatus;
    private SeatTypeEnum seatType;
    private ReservedMovieDto reservedMovie;

    public SeatsDto() {
    }

    public SeatsDto(String id, String seatNumber, SeatStatusEnum seatStatus, SeatTypeEnum seatType, ReservedMovieDto reservedMovie) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.reservedMovie = reservedMovie;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatStatusEnum getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatusEnum seatStatus) {
        this.seatStatus = seatStatus;
    }

    public SeatTypeEnum getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatTypeEnum seatType) {
        this.seatType = seatType;
    }

    public ReservedMovieDto getReservedMovie() {
        return reservedMovie;
    }

    public void setReservedMovie(ReservedMovieDto reservedMovie) {
        this.reservedMovie = reservedMovie;
    }
}

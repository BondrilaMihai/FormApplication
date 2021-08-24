package doctor.form.core.model;

import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.model.enums.SeatTypeEnum;
import doctor.form.core.repository.entity.ReservedMovie;

import javax.persistence.*;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class SeatsDto {

    private String id;
    private String seatNumber;
    private SeatStatusEnum seatStatus;
    private SeatTypeEnum seatType;
    private List<ReservedMovieDto> reservedMovies;

    public SeatsDto() {
    }

    public SeatsDto(String id, String seatNumber, SeatStatusEnum seatStatus, SeatTypeEnum seatType, List<ReservedMovieDto> reservedMovies) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.reservedMovies = reservedMovies;
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

    public List<ReservedMovieDto> getReservedMovies() {
        return reservedMovies;
    }

    public void setReservedMovies(List<ReservedMovieDto> reservedMovies) {
        this.reservedMovies = reservedMovies;
    }
}

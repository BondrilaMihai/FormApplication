package doctor.form.core.repository.entity;

import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.model.enums.SeatTypeEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "SEAT")
public class Seats implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;

    @Column(name = "SEAT_NUMBER")
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private SeatStatusEnum seatStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_TYPE")
    private SeatTypeEnum seatType;

    @OneToMany(mappedBy="seat")
    private Set<ReservedMovie> reservedMovies;

    public Seats() {
    }

    public Seats(String id, String seatNumber, SeatStatusEnum seatStatus, SeatTypeEnum seatType, Set<ReservedMovie> reservedMovies) {
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

    public Set<ReservedMovie> getReservedMovies() {
        return reservedMovies;
    }

    public void setReservedMovies(Set<ReservedMovie> reservedMovies) {
        this.reservedMovies = reservedMovies;
    }
}

package doctor.form.core.repository.entity;

import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.model.enums.SeatTypeEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "SEATS")
public class Seats {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private UUID id;

    @Column(name = "SEAT_NUMBER")
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_STATUS")
    private SeatStatusEnum seatStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_TYPE")
    private SeatTypeEnum seatType;

    public Seats() {
    }

    public Seats(String seatNumber, SeatStatusEnum seatStatus, SeatTypeEnum seatType) {
        this.seatNumber = seatNumber;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
}

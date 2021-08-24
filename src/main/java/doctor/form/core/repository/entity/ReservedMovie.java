package doctor.form.core.repository.entity;

import doctor.form.core.model.enums.SeatStatusEnum;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "RESERVE_MOVIE")
public class ReservedMovie implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_STATUS")
    private SeatStatusEnum seatStatus;

    @ManyToOne
    @JoinColumn(name="SEAT_ID", nullable=false)
    private Seats seat;

    @ManyToOne
    @JoinColumn(name="MOVIES_ID", nullable=false)
    private Movies movie;

    public ReservedMovie() {
    }

    public ReservedMovie(String id, SeatStatusEnum seatStatus, Seats seat, Movies movie) {
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

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }
}

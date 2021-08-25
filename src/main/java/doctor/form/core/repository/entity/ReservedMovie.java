package doctor.form.core.repository.entity;

import doctor.form.core.model.enums.SeatStatusEnum;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "RESERVE_MOVIE")
public class ReservedMovie implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID")
    @Generated(GenerationTime.ALWAYS)
    private String id;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEAT_STATUS")
    private SeatStatusEnum seatStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MOVIES_ID", nullable=false)
    private Movies movie;

    @Column(name = "SEAT_ID")
    private String seatId;

    public ReservedMovie() {
    }

    public ReservedMovie(String id, SeatStatusEnum seatStatus, Movies movie, String seatId) {
        this.id = id;
        this.seatStatus = seatStatus;
        this.movie = movie;
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

    public Movies getMovie() {
        return movie;
    }

    public void setMovie(Movies movie) {
        this.movie = movie;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }
}

package doctor.form.core.repository.entity;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "REVIEWS")
public class Reviews implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "ID")
    @Generated(GenerationTime.ALWAYS)
    private String id;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "NOTE")
    private Integer note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_DETAILS_ID", nullable=false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="MOVIES_ID", nullable=false)
    private Movies movieReview;

    public Reviews() {
    }

    public Reviews(String id, String message, Integer note, User user, Movies movieReview) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Movies getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(Movies movieReview) {
        this.movieReview = movieReview;
    }
}

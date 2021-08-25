package doctor.form.core.repository.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "NOTIFICATIONS")
public class Notifications implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;

    @Column(name = "MESSAGE")
    private String message;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @Column(name = "IS_OPEN")
    private Boolean isOpen;

    @Column(name = "CREATE_DATE")
    private LocalDateTime createDate;

    public Notifications() {
    }

    public Notifications(String id, String message, String movieName, Boolean isOpen, LocalDateTime createDate) {
        this.id = id;
        this.message = message;
        this.movieName = movieName;
        this.isOpen = isOpen;
        this.createDate = createDate;
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

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}

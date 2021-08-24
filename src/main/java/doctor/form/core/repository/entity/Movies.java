package doctor.form.core.repository.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "MOVIES")
public class Movies implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "NOTE")
    private Integer note;

    @OneToMany(mappedBy="movie")
    private Set<ReservedMovie> reservedMovies;

    @OneToMany(mappedBy="movieReview")
    private Set<Reviews> reviews;

    public Movies() {
    }

    public Movies(String id, String name, Integer note, Set<ReservedMovie> reservedMovies, Set<Reviews> reviews) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.reservedMovies = reservedMovies;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    public Set<ReservedMovie> getReservedMovies() {
        return reservedMovies;
    }

    public void setReservedMovies(Set<ReservedMovie> reservedMovies) {
        this.reservedMovies = reservedMovies;
    }

    public Set<Reviews> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Reviews> reviews) {
        this.reviews = reviews;
    }
}

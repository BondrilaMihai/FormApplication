package doctor.form.core.repository.entity;

import javax.persistence.*;
import java.io.Serializable;

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

    public Movies() {
    }

    public Movies(String id, String name, Integer note) {
        this.id = id;
        this.name = name;
        this.note = note;
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

}

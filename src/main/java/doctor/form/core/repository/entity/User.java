package doctor.form.core.repository.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private UUID id;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "CNP")
    private String CNP;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "POINTS")
    private Integer points;

    public User() {
    }

    public User(String lastName, String firstName, String CNP, String address, String emailAddress, Integer points) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.CNP = CNP;
        this.address = address;
        this.emailAddress = emailAddress;
        this.points = points;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCNP() {
        return CNP;
    }

    public void setCNP(String CNP) {
        this.CNP = CNP;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}

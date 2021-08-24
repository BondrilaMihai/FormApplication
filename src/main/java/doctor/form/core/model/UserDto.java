package doctor.form.core.model;

import java.util.UUID;

public class UserDto {

    private UUID id;
    private String lastName;
    private String firstName;
    private String CNP;
    private String address;
    private String emailAddress;
    private Integer points;

    public UserDto() {
    }

    public UserDto(UUID id, String lastName, String firstName, String CNP, String address, String emailAddress, Integer points) {
        this.id = id;
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

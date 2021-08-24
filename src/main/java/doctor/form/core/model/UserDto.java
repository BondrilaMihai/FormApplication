package doctor.form.core.model;

import doctor.form.core.repository.entity.Reviews;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class UserDto {

    private String id;
    private String lastName;
    private String firstName;
    private String address;
    private String email;
    private String phoneNumber;
    private Integer points;
    private List<ReviewsDto> reviews;

    public UserDto() {
    }

    public UserDto(String id, String lastName, String firstName, String address, String email, String phoneNumber, Integer points, List<ReviewsDto> reviews) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.points = points;
        this.reviews = reviews;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public List<ReviewsDto> getReviews() {
        return reviews;
    }

    public void setReviews(List<ReviewsDto> reviews) {
        this.reviews = reviews;
    }
}

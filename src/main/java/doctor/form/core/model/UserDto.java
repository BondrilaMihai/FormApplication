package doctor.form.core.model;

import java.util.List;

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

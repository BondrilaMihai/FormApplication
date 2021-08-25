package doctor.form.core.model;


public class ReviewsDto {

    private String message;
    private Integer note;
    private String userId;
    private String movieId;
    private String userLastName;
    private String userFirstName;

    public ReviewsDto() {
    }

    public ReviewsDto(String message, Integer note, String userId, String movieId, String userLastName, String userFirstName) {
        this.message = message;
        this.note = note;
        this.userId = userId;
        this.movieId = movieId;
        this.userLastName = userLastName;
        this.userFirstName = userFirstName;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
}

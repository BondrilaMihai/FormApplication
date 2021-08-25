package doctor.form.core.model;


public class NotificationsDto {

    private String id;
    private String message;
    private String movieName;
    private Boolean isOpen;

    public NotificationsDto() {
    }

    public NotificationsDto(String id, String message, String movieName, Boolean isOpen) {
        this.id = id;
        this.message = message;
        this.movieName = movieName;
        this.isOpen = isOpen;
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
}

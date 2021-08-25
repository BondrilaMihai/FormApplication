package doctor.form.core.controller.request;

public class ReserveSeatRequest {

    private String seatId;
    private String movieId;

    public ReserveSeatRequest() {
    }

    public ReserveSeatRequest(String seatId, String movieId) {
        this.seatId = seatId;
        this.movieId = movieId;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}

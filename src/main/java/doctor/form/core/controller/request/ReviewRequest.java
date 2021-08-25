package doctor.form.core.controller.request;

public class ReviewRequest {

    private Integer page;
    private Integer pageSize;
    private String movieId;

    public ReviewRequest() {
    }

    public ReviewRequest(Integer page, Integer pageSize, String movieId) {
        this.page = page;
        this.pageSize = pageSize;
        this.movieId = movieId;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}

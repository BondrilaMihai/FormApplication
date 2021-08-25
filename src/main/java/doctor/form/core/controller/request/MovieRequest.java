package doctor.form.core.controller.request;

public class MovieRequest {
    private Integer page;
    private Integer pageSize;
    private String sortBy;
    private String movieTitle;

    public MovieRequest() {
    }

    public MovieRequest(Integer page, Integer pageSize, String sortBy, String movieTitle) {
        this.page = page;
        this.pageSize = pageSize;
        this.sortBy = sortBy;
        this.movieTitle = movieTitle;
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

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
}

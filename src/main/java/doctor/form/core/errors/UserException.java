package doctor.form.core.errors;

import org.springframework.http.HttpStatus;

public class UserException extends RuntimeException {
    private Integer status;
    private HttpStatus httpStatus;
    private String errorMessage;

    public UserException() {
    }

    public UserException(Integer status, HttpStatus httpStatus, String errorMessage) {
        this.status = status;
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}

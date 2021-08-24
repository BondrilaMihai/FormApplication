package doctor.form.core.model;

import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.model.enums.SeatTypeEnum;

import java.util.UUID;

public class SeatsDto {

    private UUID id;
    private String seatNumber;
    private SeatStatusEnum status;
    private SeatTypeEnum type;

    public SeatsDto() {
    }

    public SeatsDto(UUID id, String seatNumber, SeatStatusEnum status, SeatTypeEnum type) {
        this.id = id;
        this.seatNumber = seatNumber;
        this.status = status;
        this.type = type;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public SeatStatusEnum getStatus() {
        return status;
    }

    public void setStatus(SeatStatusEnum status) {
        this.status = status;
    }

    public SeatTypeEnum getType() {
        return type;
    }

    public void setType(SeatTypeEnum type) {
        this.type = type;
    }
}

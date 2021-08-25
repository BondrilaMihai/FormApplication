package doctor.form.core.service;

import doctor.form.core.controller.request.ReserveSeatRequest;
import doctor.form.core.model.ReservedMovieDto;

import java.util.List;

public interface ReservedMovieService {
    List<ReservedMovieDto> getAllReservedMovies(String movieId);

    ReservedMovieDto reserveSeat(ReserveSeatRequest reserveRequest);
}

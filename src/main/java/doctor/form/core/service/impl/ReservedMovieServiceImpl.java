package doctor.form.core.service.impl;

import doctor.form.core.controller.request.ReserveSeatRequest;
import doctor.form.core.mapper.ReservedMovieMapper;
import doctor.form.core.model.ReservedMovieDto;
import doctor.form.core.model.enums.SeatStatusEnum;
import doctor.form.core.repository.MoviesRepository;
import doctor.form.core.repository.ReservedMovieRepository;
import doctor.form.core.repository.entity.ReservedMovie;
import doctor.form.core.service.ReservedMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservedMovieServiceImpl implements ReservedMovieService {

    @Autowired
    ReservedMovieRepository reservedMovieRepository;

    @Autowired
    ReservedMovieMapper reservedMovieMapper;

    @Autowired
    MoviesRepository moviesRepository;

    @Override
    public List<ReservedMovieDto> getAllReservedMovies(String movieId) {
        List<ReservedMovieDto> reservedMovieDtos = reservedMovieMapper.toDtos(
                reservedMovieRepository.findAllByMovie_Id(movieId));
        for (ReservedMovieDto reservedMovieDto : reservedMovieDtos) {
            reservedMovieDto.setMovieId(movieId);
        }
        return reservedMovieDtos;
    }

    @Override
    public ReservedMovieDto reserveSeat(ReserveSeatRequest reserveRequest) {
        Optional<ReservedMovie> existingReservedMovie =
                reservedMovieRepository.findAllBySeatIdAndMovie_Id(reserveRequest.getSeatId(), reserveRequest.getMovieId());

        ReservedMovie reservedMovie = new ReservedMovie();

        existingReservedMovie.ifPresent(movie -> reservedMovie.setId(movie.getId()));
        reservedMovie.setMovie(moviesRepository.findById(reserveRequest.getMovieId()).orElse(null));
        reservedMovie.setSeatId(reserveRequest.getSeatId());
        reservedMovie.setSeatStatus(SeatStatusEnum.RESERVED);

        if (!existingReservedMovie.isPresent() || existingReservedMovie.get().getSeatStatus() == SeatStatusEnum.FREE) {
            return reservedMovieMapper.toDto(reservedMovieRepository.save(reservedMovie));
        } else {
            return reservedMovieMapper.toDto(reservedMovie);
        }
    }
}

package doctor.form.core.repository;

import doctor.form.core.repository.entity.ReservedMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository
public interface ReservedMovieRepository extends JpaRepository<ReservedMovie, String> {
    List<ReservedMovie> findAllByMovie_Id(String movieId);

    @Transactional
    @Modifying
    @Query(value = "UPDATE ReservedMovie r SET r.seatStatus = 1 WHERE r.movie.id = :movieId and r.seatId = :seatId")
    int reserveSeat(@Param("movieId") String movieId, @Param("seatId") String seatId);

    Optional<ReservedMovie> findAllBySeatIdAndMovie_Id(String seatId, String movieId);
}

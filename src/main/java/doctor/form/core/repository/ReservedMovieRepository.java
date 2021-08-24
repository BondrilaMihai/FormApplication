package doctor.form.core.repository;

import doctor.form.core.repository.entity.ReservedMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReservedMovieRepository extends JpaRepository<ReservedMovie, String> {
}

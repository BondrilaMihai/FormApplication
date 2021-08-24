package doctor.form.core.repository;

import doctor.form.core.repository.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MoviesRepository extends JpaRepository<Movies, String> {
}

package doctor.form.core.repository;

import doctor.form.core.repository.entity.Movies;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MoviesRepository extends JpaRepository<Movies, String> {

    Page<Movies> findAllByNameContainingIgnoreCase(String name, Pageable pageable);

}

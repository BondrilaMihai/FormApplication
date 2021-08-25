package doctor.form.core.repository;

import doctor.form.core.repository.entity.Reviews;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, String> {

    Page<Reviews> findAllByMovieReview_Id(String movieId, Pageable pageable);
}

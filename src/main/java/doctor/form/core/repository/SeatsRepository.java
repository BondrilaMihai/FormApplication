package doctor.form.core.repository;

import doctor.form.core.repository.entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SeatsRepository extends JpaRepository<Seats, UUID> {
}

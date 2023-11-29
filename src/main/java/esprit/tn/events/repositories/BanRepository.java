package esprit.tn.events.repositories;

import esprit.tn.events.entities.Ban;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BanRepository extends JpaRepository<Ban,Long> {
}

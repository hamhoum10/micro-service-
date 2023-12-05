package esprit.tn.events.repositories;

import esprit.tn.events.entities.Ban;
import esprit.tn.events.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface BanRepository extends JpaRepository<Ban,Long> {

    public List<Ban> findByBanExpDateBefore(LocalDate localDate);
    public List<Ban> findBanByBannedUserAndAndBanExpDateAfter(User user, LocalDate localDate);
}

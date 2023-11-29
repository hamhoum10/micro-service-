package esprit.tn.events.repositories;

import esprit.tn.events.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserReposiotry extends JpaRepository<User,Long> {
}

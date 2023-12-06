package esprit.tn.events.repositories;

import esprit.tn.events.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    List<User> findByFirstNameContainingAndLastNameContaining(String firstName, String lastName);
}

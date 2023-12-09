package tn.esprit.MicroChat.repositories;

import tn.esprit.MicroChat.entites.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Notification findByTitle(String name);
}

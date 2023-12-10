package tn.esprit.MicroChat.services;

import tn.esprit.MicroChat.entites.Notification;
import tn.esprit.MicroChat.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceimp implements INotification{
    @Autowired
    private NotificationRepository nr ;


    @Override
    public List<Notification> getNotifications() {
        return nr.findAll();
    }

    @Override
    public Notification getNotificationById(Long id) {
        return nr.findById(id).orElse(null);
    }

    @Override
    public Notification addNotification(Notification n) {
        return nr.save(n);
    }

    @Override
    public Notification updateNotification(Notification n) {
        return nr.save(n);
    }

    @Override
    public void deleteNotification(Long id) {
        nr.deleteById(id);

    }
    @Override
    public Notification getvByName(String name) {
        return nr.findByTitle(name);
    }
}

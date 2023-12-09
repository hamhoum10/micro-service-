package tn.esprit.MicroChat.services;

import tn.esprit.MicroChat.entites.Notification;

import java.util.List;

public interface INotification {
    public List<Notification> getNotifications();

    public Notification getNotificationById(Long id);

    public Notification addNotification(Notification n);

    public Notification updateNotification(Notification n);

    public void deleteNotification(Long id);

    public Notification getvByName(String name);
}

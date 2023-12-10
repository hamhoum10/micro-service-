package tn.esprit.MicroChat.controllers;

import tn.esprit.MicroChat.entites.Notification;
import tn.esprit.MicroChat.services.NotificationServiceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class NotificationController {
   @Autowired
   private NotificationServiceimp ns ;

   @GetMapping("/hello")
   public String helloWorld(){
       return "Notification API Work!";
   }

    @PostMapping("/add")
    public ResponseEntity<Notification> addNotification(@RequestBody Notification n) {
        try {
            Notification newn = ns.addNotification(n);
            return new ResponseEntity<>(newn, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/update")
    public ResponseEntity<Notification> updateNotification(@RequestBody Notification n) {
        try {
            Notification newn = ns.updateNotification(n);
            return new ResponseEntity<>(newn, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/delete/{id}")
    public void deleteN(@PathVariable long id) {
        ns.deleteNotification(id);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Notification> getNotificationById(@PathVariable("id") Long id) {
        try {
            Notification club = ns.getNotificationById(id);
            if (club == null) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(club, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/getall")
    public List<Notification> getNotifications() {
        return ns.getNotifications();

    }
}

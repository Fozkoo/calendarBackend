package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Models.Notification;
import com.example.calendarbackend.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/notification")
public class NotificationController {

    @Autowired
    private NotificationRepository notificationRepository;

    @CrossOrigin
    @GetMapping("/getAllNotificationRepository")
    public ResponseEntity <?>GetAllNotificationRepository() {
        return ResponseEntity.ok(notificationRepository.findAll());
    }


    @CrossOrigin
    @PostMapping("/createNotification")  //CREAR NOTIFICACIONES
    public ResponseEntity<?> AddNotification(@RequestBody Notification notification) {
        notificationRepository.save(notification);
        return ResponseEntity.ok(notification);
    }
}

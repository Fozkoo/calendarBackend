package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

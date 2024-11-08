package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.AttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/attachment")
public class AttachmentController {
    @Autowired
    private AttachmentRepository attachmentRepository;


    @CrossOrigin
    @GetMapping("/getAllAttachment")
    public ResponseEntity<?> getAllAttachment() {
        return ResponseEntity.ok(attachmentRepository.findAll());

    }
}

package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/number")
public class NumberController {
    @Autowired
    private NumberRepository numberRepository;
    @CrossOrigin
    @GetMapping("/getAllNumber")
    public ResponseEntity<?> getAllNumber() {
        return ResponseEntity.ok(numberRepository.findAll());
    }
}

package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/month")
public class MonthController {
    @Autowired
    private MonthRepository monthRepository;
    @CrossOrigin
    @GetMapping("/getAllMonth")
    public ResponseEntity<?> getAllMonth() {

       return ResponseEntity.ok(monthRepository.findAll());
    }
}

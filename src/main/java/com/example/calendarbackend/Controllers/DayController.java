package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/day")
public class DayController {
    @Autowired
    private DayRepository dayRepository;

    @CrossOrigin
    @GetMapping("/getAllDay")
    public ResponseEntity<?> getAllDay() {
         return ResponseEntity.ok(dayRepository.findAll());
    }
}

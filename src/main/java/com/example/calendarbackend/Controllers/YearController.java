package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/year")
public class YearController {
    //IMPORTANTE
    @Autowired
    private YearRepository yearRepository;

    @CrossOrigin
    @GetMapping("/getAllYear")
    public ResponseEntity<?> getYear() {
        return ResponseEntity.ok(yearRepository.findAll());
    }
}

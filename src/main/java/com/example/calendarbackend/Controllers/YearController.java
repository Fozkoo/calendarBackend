package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/year")
public class YearController {
    //IMPORTANTE
    @Autowired
    private YearRepository yearRepository;

    @CrossOrigin
    @GetMapping("/getYearById/{id}")
    public ResponseEntity<?> getYearById(@PathVariable  int id ) {
        return ResponseEntity.ok(yearRepository.findById(id));
    }

    @CrossOrigin
    @GetMapping("/getAllYear")
    public ResponseEntity<?> getAllYear() {
        return ResponseEntity.ok(yearRepository.findAll());
    }

}

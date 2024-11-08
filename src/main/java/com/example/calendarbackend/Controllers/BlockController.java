package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/block")
public class BlockController {
    @Autowired
    private BlockRepository blockRepository;
    @CrossOrigin
    @GetMapping("/getAllBlockController")
    public ResponseEntity<?>getAllBlockController(){
        return ResponseEntity.ok(blockRepository.findAll());
    }


}

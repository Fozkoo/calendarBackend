package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.DTO.BlockDTO;
import com.example.calendarbackend.Models.Block;
import com.example.calendarbackend.Repository.BlockRepository;

import com.example.calendarbackend.Services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/block")
public class BlockController {
    @Autowired
    private BlockRepository blockRepository;

    @Autowired
    private BlockService blockService;

    /*Este endpoint me trae todos los bloques solo filtrando por el id del anio */
    @CrossOrigin
    @GetMapping("/getAllBlocksWithInfo")
    public ResponseEntity<?> getAllBlocksWithInfo(){
        List<BlockDTO> blocks = blockService.getAllBlocks();
        return ResponseEntity.ok(blocks);
    }


    /*Este endpoint me trae todos los bloques pasandole por parametro el id del mes*/

    @CrossOrigin
    @GetMapping("/getAllBlocksByMonthId/{idMonth}")
    public ResponseEntity<?> getAllBlocksByMonthId(@PathVariable int idMonth){
        List<BlockDTO> blocks = blockService.getAllBlocksByMonthId(idMonth);
        return ResponseEntity.ok(blocks);
    }




}

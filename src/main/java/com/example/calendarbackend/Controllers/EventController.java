package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Models.Event;
import com.example.calendarbackend.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/events")

public class EventController {
    @Autowired
    private EventRepository eventRepository;
    @GetMapping("/getAllEvents")        //TRAE TODOS LOS EVENTOS
    public ResponseEntity<?> getAllEventRepository() {
        return ResponseEntity.ok(eventRepository.findAll());
    }

    @CrossOrigin
    @PostMapping("/createEvent")     //CREA UN EVENTO
    public ResponseEntity<?> createEvent(@RequestBody Event event) {
        eventRepository.save(event);
        return ResponseEntity.ok(event);
    }


/*IMPORTANTE!!! ACOMODAR EL TEMA DE LOS BLOQUES PORQUE AL QUERER BORRAR TIRA ERROR PORQUE EL ID DEL EVENTO ESTA ASOCIADO A UN BLOQUE Y NO DEJA BORRAR ESTA MIERDA*/

    @CrossOrigin
    @DeleteMapping("/deleteEventById/{idevent}")      //ELIMINA EL EVENTO CON EL ID idevent
    public ResponseEntity<?> deleteEvent(@PathVariable int idevent) {
        try {
            eventRepository.deleteById(idevent);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error " + e.getMessage());
        }
    }


    @CrossOrigin
    @GetMapping("/getEventById/{idevent}")  //OBTENER EVENTO POR ID
    public ResponseEntity<?> getEventById(@PathVariable int idevent){
        return ResponseEntity.ok(eventRepository.findById(idevent));
    }
}

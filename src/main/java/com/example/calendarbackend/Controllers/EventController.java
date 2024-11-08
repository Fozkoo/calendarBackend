package com.example.calendarbackend.Controllers;

import com.example.calendarbackend.Models.Event;
import com.example.calendarbackend.Repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin //(origins = "http://localhost:8080")
@RestController
@RequestMapping("/events")                      //ENDPOINT RAIZ

public class EventController {
    @Autowired
    private EventRepository eventRepository;
    @GetMapping("/getAllEventRepository")
    public ResponseEntity<?> getAllEventRepository() {
        return ResponseEntity.ok(eventRepository.findAll());
    }

    /*@Autowired
 //   private EventService eventService;

    @CrossOrigin
    @GetMapping("/")                                //OBTIENE TODOS LOS EVENTOS
    public ResponseEntity<?> getAllEvents() {}*/

    @CrossOrigin
    @GetMapping("/{idevent}")                       //OBTIENE EL EVENTO CON EL ID idevent
    public ResponseEntity<?> getEventById(){
        return null;
    }

    @CrossOrigin
    @PostMapping("/")                               //CREA UN EVENTO
    public ResponseEntity<?> createEvent(@RequestBody Event event) {
        return null;
    }


    @CrossOrigin
    @DeleteMapping("/{idevent}")                    //ELIMINA EL EVENTO CON EL ID idevent
    public ResponseEntity<?> deleteEvent(){
        return null;
    }

}

package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "notification")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // o GenerationType.AUTO
    @Column(name = "idnotification", nullable = false)
    private Integer id;

    @Column(name = "type", nullable = false, length = 45)
    private String type;

}
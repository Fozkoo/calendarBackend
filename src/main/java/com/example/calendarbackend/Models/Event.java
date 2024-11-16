package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idevent", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = 45)
    private String title;

    @Column(name = "time")
    private LocalTime time;

    @Column(name = "userid", nullable = false, length = 45)
    private String userId;

    @Column(name = "sendmail", nullable = false, length = 45)
    private String sendMail;

}
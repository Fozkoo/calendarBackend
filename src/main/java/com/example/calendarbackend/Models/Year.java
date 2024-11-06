package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "year")
public class Year {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idyear", nullable = false)
    private Integer id;

    @Column(name = "anio", nullable = false)
    private Integer anio;
}
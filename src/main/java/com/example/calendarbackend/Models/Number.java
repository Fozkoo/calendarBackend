package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "number")
public class Number {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idnumber", nullable = false)
    private Integer id;

    @Column(name = "numero", nullable = false)
    private Integer numero;

}
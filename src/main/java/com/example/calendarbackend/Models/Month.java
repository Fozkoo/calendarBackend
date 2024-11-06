package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "month")
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmonth", nullable = false)
    private Integer id;

    @Column(name = "mes", nullable = false, length = 45)
    private String mes;


}
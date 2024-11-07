package com.example.calendarbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendarbackend.Models.Number;

public interface NumberRepository extends JpaRepository<Number, Integer> {
}

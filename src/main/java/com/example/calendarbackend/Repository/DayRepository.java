package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository <Day, Integer> {
}

package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Day;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayRepository extends JpaRepository <Day, Integer> {
}

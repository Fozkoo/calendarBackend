package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Month;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthRepository extends JpaRepository<Month, Integer> {
}

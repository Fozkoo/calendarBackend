package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Year;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YearRepository extends JpaRepository<Year, Integer> {
}

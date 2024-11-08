package com.example.calendarbackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.calendarbackend.Models.Number;
import org.springframework.stereotype.Repository;

@Repository
public interface NumberRepository extends JpaRepository<Number, Integer> {
}

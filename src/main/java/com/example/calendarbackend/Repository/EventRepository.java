package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Integer> {
}

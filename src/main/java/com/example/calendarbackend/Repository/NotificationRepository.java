package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}

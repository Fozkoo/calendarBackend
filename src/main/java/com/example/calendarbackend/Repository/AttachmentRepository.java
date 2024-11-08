package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachmentRepository extends JpaRepository <Attachment,Integer > {
}

package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockRepository  extends JpaRepository<Block,Integer> {
}

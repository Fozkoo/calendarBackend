package com.example.calendarbackend.Services;

import com.example.calendarbackend.DTO.BlockDTO;
import com.example.calendarbackend.Repository.BlockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlockService {

    @Autowired
    private BlockRepository blockRepository;

    public List<BlockDTO> getAllBlocks() {
        List<Object[]> blocks = blockRepository.findEventsByYear();

        // Convertir los resultados en una lista de BlockEventDto
        return blocks.stream()
                .map(block -> new BlockDTO(
                        (String) block[0], // month_name
                        (String) block[1], // day_value
                        (Integer) block[2], // number_value
                        (Integer) block[3], // year_value
                        (String) block[4], // event_title
                        (Time) block[5], // event_datetime
                        (String) block[6]  // attachment_url
                ))
                .collect(Collectors.toList());
    }

    public List<BlockDTO> getAllBlocksByMonthId(Integer idmonth) {
        List<Object[]> blocks = blockRepository.getAllBlocksByMonthId(idmonth);

        // Convertir los resultados en una lista de BlockEventDto
        return blocks.stream()
                .map(block -> new BlockDTO(
                        (String) block[0], // month_name
                        (String) block[1], // day_value
                        (Integer) block[2], // number_value
                        (Integer) block[3], // year_value
                        (String) block[4], // event_title
                        (Time) block[5], // event_datetime
                        (String) block[6]  // attachment_url
                ))
                .collect(Collectors.toList());
    }


}

package com.example.calendarbackend.Services;

import com.example.calendarbackend.DTO.BlockDTO;
import com.example.calendarbackend.DTO.EventDTO;
import com.example.calendarbackend.Repository.BlockRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlockService {

    @Autowired
    private BlockRepository blockRepository; // Make sure this is injected

    public List<BlockDTO> getBlocks(int idMonth, int idYear) {
        // Fetch blocks from the database using the month and year
        List<Object[]> queryResults = blockRepository.findBlocksByMonthAndYear(idMonth, idYear);

        // Map the results to BlockDTOs
        return mapToBlockDTO(queryResults);
    }

    public List<BlockDTO> mapToBlockDTO(List<Object[]> queryResults) {
        List<BlockDTO> blocks = new ArrayList<>();

        for (Object[] row : queryResults) {
            BlockDTO block = new BlockDTO(
                    (Integer) row[0],             // blockId
                    (String) row[1],              // monthName
                    (String) row[2],              // dayValue
                    (Integer) row[3],             // numberValue
                    (Integer) row[4],             // yearValue
                    parseEventsFromJson((String) row[5]) // events
            );
            blocks.add(block);
        }

        return blocks;
    }

    private List<EventDTO> parseEventsFromJson(String json) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(json, new TypeReference<List<EventDTO>>() {});
        } catch (Exception e) {
            System.err.println("Error parsing JSON: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}

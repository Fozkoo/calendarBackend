package com.example.calendarbackend.DTO;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlockDTO {

    private Integer blockId;
    private String monthName;
    private String dayValue;
    private Integer numberValue;
    private Integer yearValue;
    private List<EventDTO> events;

    public BlockDTO (Integer blockId, String monthName, String dayValue, Integer numberValue, Integer yearValue, List<EventDTO> events) {
        this.monthName = monthName;
        this.dayValue = dayValue;
        this.numberValue = numberValue;
        this.yearValue = yearValue;
        this.events = events;
    }


    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public Integer getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(Integer numberValue) {
        this.numberValue = numberValue;
    }

    public Integer getYearValue() {
        return yearValue;
    }

    public void setYearValue(Integer yearValue) {
        this.yearValue = yearValue;
    }

    public List<EventDTO> getEvent() {
        return events;
    }

    public void setEvent(List<EventDTO> event) {
        this.events = event;
    }


}

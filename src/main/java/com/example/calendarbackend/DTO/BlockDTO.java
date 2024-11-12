package com.example.calendarbackend.DTO;


import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Getter
@Setter
public class BlockDTO {

    private String monthName;
    private String dayValue;
    private Integer numberValue;
    private Integer yearValue;
    private String eventTitle;
    private Time eventDatetime;
    private String attachmentUrl;

    public BlockDTO (String monthName, String dayValue, Integer numberValue, Integer yearValue,
                         String eventTitle, Time eventDatetime, String attachmentUrl) {
        this.monthName = monthName;
        this.dayValue = dayValue;
        this.numberValue = numberValue;
        this.yearValue = yearValue;
        this.eventTitle = eventTitle;
        this.eventDatetime = eventDatetime;
        this.attachmentUrl = attachmentUrl;
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

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public Time getEventDatetime() {
        return eventDatetime;
    }

    public void setEventDatetime(Time eventDatetime) {
        this.eventDatetime = eventDatetime;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
}

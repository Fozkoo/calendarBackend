package com.example.calendarbackend.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class EventDTO {

    private Integer idUserEvent;
    private String eventTitle;
    private String eventDataTime;
    private List<NotificationDTO> notifications;
    private String attachmentUrl;

    public Integer getIdUserEvent() {
        return idUserEvent;
    }

    public void setIdUserEvent(Integer idUserEvent) {
        this.idUserEvent = idUserEvent;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDataTime() {
        return eventDataTime;
    }

    public void setEventDataTime(String eventDataTime) {
        this.eventDataTime = eventDataTime;
    }

    public List<NotificationDTO> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<NotificationDTO> notifications) {
        this.notifications = notifications;
    }

    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }
}

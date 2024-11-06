package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "event_has_notification")
public class EventHasNotification {
    @EmbeddedId
    private EventHasNotificationId id;

    @MapsId("eventIdevent")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "event_idevent", nullable = false)
    private Event eventIdevent;

    public EventHasNotificationId getId() {
        return id;
    }

    public void setId(EventHasNotificationId id) {
        this.id = id;
    }

    public Event getEventIdevent() {
        return eventIdevent;
    }

    public void setEventIdevent(Event eventIdevent) {
        this.eventIdevent = eventIdevent;
    }

}
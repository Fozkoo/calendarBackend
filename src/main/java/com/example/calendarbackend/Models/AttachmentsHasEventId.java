package com.example.calendarbackend.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class AttachmentsHasEventId implements java.io.Serializable {
    private static final long serialVersionUID = 7860395211952871745L;
    @Column(name = "attachments_idattachments", nullable = false)
    private Integer attachmentsIdattachments;

    @Column(name = "event_idevent", nullable = false)
    private Integer eventIdevent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AttachmentsHasEventId entity = (AttachmentsHasEventId) o;
        return Objects.equals(this.attachmentsIdattachments, entity.attachmentsIdattachments) &&
                Objects.equals(this.eventIdevent, entity.eventIdevent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentsIdattachments, eventIdevent);
    }



}
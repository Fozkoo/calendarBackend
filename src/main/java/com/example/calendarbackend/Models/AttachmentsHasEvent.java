package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "attachments_has_event")
public class AttachmentsHasEvent {
    @EmbeddedId
    private AttachmentsHasEventId id;

    @MapsId("attachmentsIdattachments")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "attachments_idattachments", nullable = false)
    private Attachment attachmentsIdattachments;


    public Attachment getAttachmentsIdattachments() {
        return attachmentsIdattachments;
    }

    public void setAttachmentsIdattachments(Attachment attachmentsIdattachments) {
        this.attachmentsIdattachments = attachmentsIdattachments;
    }

    public AttachmentsHasEventId getId() {
        return id;
    }

    public void setId(AttachmentsHasEventId id) {
        this.id = id;
    }

}
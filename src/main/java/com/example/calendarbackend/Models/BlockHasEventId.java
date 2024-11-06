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
public class BlockHasEventId implements java.io.Serializable {
    private static final long serialVersionUID = 5297413101937196653L;
    @Column(name = "block_idblock", nullable = false)
    private Integer blockIdblock;

    @Column(name = "event_idevent", nullable = false)
    private Integer eventIdevent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BlockHasEventId entity = (BlockHasEventId) o;
        return Objects.equals(this.blockIdblock, entity.blockIdblock) &&
                Objects.equals(this.eventIdevent, entity.eventIdevent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockIdblock, eventIdevent);
    }

}
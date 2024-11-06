package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "block_has_event")
public class BlockHasEvent {
    @EmbeddedId
    private BlockHasEventId id;

    @MapsId("blockIdblock")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "block_idblock", nullable = false)
    private Block blockIdblock;

    public BlockHasEventId getId() {
        return id;
    }

    public void setId(BlockHasEventId id) {
        this.id = id;
    }

    public Block getBlockIdblock() {
        return blockIdblock;
    }

    public void setBlockIdblock(Block blockIdblock) {
        this.blockIdblock = blockIdblock;
    }

}
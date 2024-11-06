package com.example.calendarbackend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "interface")
public class Interface {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idinterface", nullable = false)
    private Integer id;

    @Getter
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "block_idblock", nullable = false)
    private Block blockIdblock;

    @Column(name = "iduser", nullable = false, length = 45)
    private String iduser;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Block getBlockIdblock() {
        return blockIdblock;
    }

    public void setBlockIdblock(Block blockIdblock) {
        this.blockIdblock = blockIdblock;
    }

    public String getIduser() {
        return iduser;
    }

    public void setIduser(String iduser) {
        this.iduser = iduser;
    }

}
package com.example.rail_e_ticket_api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Station {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    
}

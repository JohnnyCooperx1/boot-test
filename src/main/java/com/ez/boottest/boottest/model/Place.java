package com.ez.boottest.boottest.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "place")
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
    @Column(name = "place_id", nullable = false)
    private Long id;

    @Column(name = "place_name")
    private String name;

    @Column(name = "date_create")
    private Timestamp dateCreate;

    public Timestamp getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Timestamp dateCreate) {
        this.dateCreate = dateCreate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

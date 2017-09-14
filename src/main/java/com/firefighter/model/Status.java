package com.firefighter.model;

import javax.persistence.*;

/**
 * Created by Andrew on 8/24/2017.
 */

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "status {id: " + id +
                " name: " + name +
                "}";
    }

}

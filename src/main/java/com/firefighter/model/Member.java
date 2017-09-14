package com.firefighter.model;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by Andrew on 6/7/2017.
 */
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name ="first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private Date dob;

    @OneToOne
    @JoinColumn(name = "rank_id")
    private Rank rank;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "member {ID: " + id + "" +
                " First Name: " + firstName +
                " Last Name: " + lastName +
                " DOB: " + dob.toString() +
                " Rank: " + rank.toString() +
                " Status: " + status.toString() +
                "}";
    }
}

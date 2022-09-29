package com.example.thymleafeexample.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "attandence")
public class Attandance {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private long id;
    @Column(name = "f_name")
    private String fname;
    @Column(name = "l_name")
    private String lname;
    @Column(name = "attandence")
    private String attandence;


}

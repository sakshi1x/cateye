package com.example.cateye.entity.user_management;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "patient")

public class Patient {
    @Id
    @SequenceGenerator(name = "patient_seq_gen", sequenceName = "patient_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "patient_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "fname", nullable = false)
    private  String fname;
    @Column(name = "lname", nullable = false)
    private  String lname;

    @Column(nullable = false)
    private String email;



    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "dob", nullable = false)
    private  String dob;
    @Column(name = "treatment", nullable = true)
    private  String treatment;

    @Column(name = "doc", nullable = false)
    private  String doc;



}

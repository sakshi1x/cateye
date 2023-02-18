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
@Table(name = "doctor")

public class Doctor {
    @Id
    @SequenceGenerator(name = "doctor_seq_gen", sequenceName = "doctor_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "doctor_seq_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(name = "fullname", nullable = false)
    private  String fullname;

    @Column(nullable = false)
    private String qualification;



    @Column(name = "feild")
    private String feild;

    @Column(name = "time", nullable = false)
    private  String time;



}


package com.otsdemo.onlineToletSystemDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tenant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contactNumber;
    private String email;//@diu.edu.bd
    //private Long flatid;
    private LocalDate moveInDate;

    @ManyToOne
    @JoinColumn(name = "flat_id")
    private Flat flat;


}

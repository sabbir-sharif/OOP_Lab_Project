package com.otsdemo.onlineToletSystemDemo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HouseOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String password;

    @OneToMany(mappedBy = "houseOwner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Flat> flat;
}

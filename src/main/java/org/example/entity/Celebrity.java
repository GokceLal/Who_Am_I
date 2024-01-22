package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_celebrity")
@Entity
public class Celebrity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "birthdate")
    String birthdate;

    @Column(name = "country")
    String country;

    @Column(name = "description")
    String description;

    @Column(name = "image")
    String image;

    @OneToOne(fetch = FetchType.EAGER)
    InterestingFacts interestingFacts;

    @ManyToOne
    Game game;


}
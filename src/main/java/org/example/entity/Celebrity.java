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

    String birthdate;
    String country;
    String description;
    String image;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "celebrity")
    InterestingFacts interestingFacts;

 //   @ManyToOne
 //   Game game;


}

package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_game")
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game", fetch = FetchType.EAGER)
    List<Contestant> contestant = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "game", fetch = FetchType.EAGER)
    List<Celebrity> celebrities;


}

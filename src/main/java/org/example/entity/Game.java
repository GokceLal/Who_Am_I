package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

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

    @OneToMany
    @JoinColumn(name = "contestant_id")
    List<Contestant> contestant;

    @OneToMany
    List<Celebrity> celebrities;


}

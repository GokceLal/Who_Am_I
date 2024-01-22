package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbl_contestant")
@Entity
public class Contestant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "namesurname")
    String namesurname;

    @Column(name = "password")
    String password;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "game_id")
    Game game;



}

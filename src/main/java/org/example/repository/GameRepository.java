package org.example.repository;

import org.example.entity.Game;

public class GameRepository extends RepositoryManager<Game,Long> {
    public GameRepository() {
        super(new Game());
    }
}

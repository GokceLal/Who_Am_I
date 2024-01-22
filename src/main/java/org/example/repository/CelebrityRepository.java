package org.example.repository;

import org.example.entity.Celebrity;

public class CelebrityRepository extends RepositoryManager<Celebrity,Long> {
    public CelebrityRepository() {
        super(new Celebrity());
    }
}

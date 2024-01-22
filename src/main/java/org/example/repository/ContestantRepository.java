package org.example.repository;

import org.example.entity.Contestant;

public class ContestantRepository extends RepositoryManager<Contestant,Long> {
    public ContestantRepository() {
        super(new Contestant());
    }
}

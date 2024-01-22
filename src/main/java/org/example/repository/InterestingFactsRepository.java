package org.example.repository;

import org.example.entity.InterestingFacts;

public class InterestingFactsRepository extends RepositoryManager<InterestingFacts,Long> {
    public InterestingFactsRepository() {
        super(new InterestingFacts());
    }
}

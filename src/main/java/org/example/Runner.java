package org.example;

import org.example.entity.Celebrity;
import org.example.entity.Contestant;
import org.example.entity.Game;
import org.example.entity.InterestingFacts;
import org.example.repository.GameRepository;
import org.example.repository.InterestingFactsRepository;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Contestant contestant = Contestant.builder()
                .namesurname("Alan Wake")
                .password("john1234")
                .build();

        InterestingFacts interestingFacts = InterestingFacts.builder()
                .summary("Batman")
                .build();

        InterestingFacts interestingFactsVT = new InterestingFactsRepository().save(interestingFacts);

        Celebrity celebrity = Celebrity.builder()
                .name("Bruce")
                .surname("Wayne")
                .birthdate("01.01.1990")
                .country("USA")
                .interestingFacts(interestingFactsVT)
                .description("Zengin iş adamı")
                .image("https://i.pinimg.com/originals/0f/8a/9a/0f8a9a5e2b5b6b6b6b6b6b6b6b6b6b6b.jpg")
                .build();

        interestingFactsVT.setCelebrity(celebrity);
        Game game = Game.builder().contestant(List.of(contestant)).celebrities(List.of(celebrity)).build();
        celebrity.setGame(game);
        contestant.setGame(game);

        new GameRepository().save(game);

    }
}
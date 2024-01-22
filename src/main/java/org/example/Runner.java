package org.example;

import org.example.entity.Celebrity;
import org.example.entity.Contestant;
import org.example.entity.Game;
import org.example.entity.InterestingFacts;
import org.example.repository.CelebrityRepository;
import org.example.repository.ContestantRepository;
import org.example.repository.GameRepository;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Game game = Game.builder()

                .build();


        Contestant contestant =  Contestant.builder()
                .namesurname("John Doe")
                .password("john1234")
                .game(game)
                .build();



        game.setContestant(List.of(contestant));

        Celebrity celebrity = Celebrity.builder()
                .name("John")
                .surname("Doe")
                .birthdate("1980-01-01")
                .country("USA")
                .image("https://example.com/image.jpg")
                .description("Some description about the celebrity.")
                .game(game)
                .build();

        game.setCelebrities(List.of(celebrity));

        InterestingFacts interestingFacts = InterestingFacts.builder()
                .celebrity(celebrity)
                .summary("Some interesting facts about the celebrity.")
                .build();

        celebrity.setInterestingFacts(List.of(interestingFacts));
        interestingFacts.setCelebrity(celebrity);
        contestant.setGame(game);

        new CelebrityRepository().save(celebrity);

    }
}
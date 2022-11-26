import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ShuffleGame game = new ShuffleGame();
        game.displayMsg();

        do {

            System.out.println("Are you ready to play? y/n");
            game.ready = game.sc.nextLine();
            game.check_YN_Answer(game.ready);

            if (game.ready.equalsIgnoreCase("y")) {
                game.pickNumber();
            }else {
                break;
            }

            System.out.println("Do you want to try again ? y/n");
            game.answer = game.sc.nextLine();
            game.check_YN_Answer(game.answer);



        }while (game.answer.equalsIgnoreCase("y"));

        System.out.println("See you next time");

    }
}
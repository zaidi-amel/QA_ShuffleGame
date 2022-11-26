import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleGame {
    Scanner sc = new Scanner(System.in);
    String ready;
    String pick;
    String answer;
    Integer[] array = {1, 1, 0};
    List<Integer> ShuffledArray;

    public void displayMsg(){
        System.out.println("------------- Welcome to shuffle game --------------");
        System.out.println("Guess where the 0 is?");
    }

    public List shuffleArray(Integer[] array){
        List<Integer> intList = Arrays.asList(array);
        Collections.shuffle(intList);
        return intList;
    }

    public void check_YN_Answer(String answer){
        while (!(answer.equalsIgnoreCase("n")) && !(answer.equalsIgnoreCase("y"))) {
            System.out.println("invalid entry, please enter y or n");
            answer = sc.nextLine();
        }

    }


    public void pickNumber(){
        System.out.println("Pick 1, 2 or 3!");
        pick = sc.nextLine();
        while (!(pick.equalsIgnoreCase("1")) && !(pick.equalsIgnoreCase("2")) && !(pick.equalsIgnoreCase("3"))) {
            System.out.println("invalid entry, please enter 1, 2 or 3");
            pick = sc.nextLine();
        }
        ShuffledArray = shuffleArray(array);
        System.out.println("Shuffeled Array === "+ShuffledArray);
        if (Integer.parseInt(pick) == ShuffledArray.indexOf(0) + 1) {
            System.out.println("Good Guess!");
        } else {
            System.out.println("Sorry !! Wrong Guess");
        }

    }

    }





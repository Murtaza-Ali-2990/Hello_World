import java.util.Random;
import java.util.Scanner;

public class Assignment_2_c {
    public static void main(String[] args) {
        System.out.println("Let's play a game : GUESS THE NUMBER");
        Scanner scan = new Scanner(System.in);
        char flag;

        do {
            Random random = new Random();
            int randomInt = random.nextInt(1000);
            System.out.println("Guess the number");
            int number = -1;

            while(number != randomInt) {
                number = scan.nextInt();
                if(number > randomInt)
                    System.out.println("Too High, Try Again");
                else if(number < randomInt)
                    System.out.println("Too low, Try Again");
                else
                    System.out.println("Congratulations, you got the correct number!");
            }
            System.out.println("\nDo you want to play again ? (Y/N)");
            flag = scan.next().charAt(0);
        }while(flag == 'Y' || flag == 'y');
    }
}

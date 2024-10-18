import java.util.Scanner;

public class Prog18 {
    public static void main(String[] args) {
        int num = 13;
        int i = 1;
        System.err.println(
                "There is a random number in the hidden box.\nGuess the number , there are three attempts given to guess the number from 1 to 25");
        int guess;

        do {
            System.out.println("Guess the number, this is your attempt number " + i + ":");
            Scanner sc = new Scanner(System.in);
            guess = sc.nextInt();
            if (guess < 1 || guess > 25) {
                System.out.println("Enter number between 1 to 25");
            } else {
                i++;
                if (guess != num)
                    System.out.println("Shit...! your guess is wrong");
            }
        } while (guess != num && i <= 3);
        if (guess == num) {
            System.out.println("Hurrah..! Your guess number " +(i-1)+" is correct the hidden random number is " + num);
        } else
            System.out.println("Alas..! No  more attempts");
    }

}

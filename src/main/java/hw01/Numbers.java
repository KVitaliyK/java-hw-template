package hw01;

import java.util.Random;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int randomInt = random.nextInt(101);
        int[] attempts = new int[100];
        int attempt = 0;

        System.out.println("Please, enter your name:");
        String name = sc.nextLine();

        System.out.println("Let the game begin!");


        while (true) {
            System.out.println("Please, enter your number:");
            int playerNumber;

            if (sc.hasNextInt()) {
                playerNumber = sc.nextInt();
            } else {
                System.out.println("Please enter a valid number.");
                sc.next();
                continue;
            }


            if (attempt < attempts.length) {
                attempts[attempt] = playerNumber;
                attempt++;
            }

            if (playerNumber < randomInt) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (playerNumber > randomInt) {
                System.out.println("Your number is too big. Please, try again.");
            } else {
                System.out.println("Congratulations, " + name + "!");

                // додатково можемо показати всі попередні спроби:
                System.out.print("Your numbers: ");
                for (int i = 0; i < attempt; i++) {
                    System.out.print(attempts[i] + " ");
                }
                System.out.println();
                break;
            }
        }
    }
}

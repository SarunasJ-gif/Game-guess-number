package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Integer> allNumbers = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name + " Enter your number: ");
        int n = 0;

        while (true) {
            int randomNumber = random.nextInt(5) + 1;
            int number = scanner.nextInt();
            n++;
            allNumbers.add(number);
            if (number < 1 || number > 5) {
                System.out.println("Please, enter number between 1 and 5");
                System.out.println("Enter number one more time");
            }
            if (n == 3) {
                System.out.println("You tried three times, you lost the game");
                System.out.println("Your guess were: ");
                for (int i = 0; i < allNumbers.size(); i++) {
                    System.out.print(allNumbers.get(i) + " ");
                }
                break;
            }
            if (number == randomNumber) {
                System.out.println("-------------------------");
                System.out.println("You are the winner! Your number was: " + number);
                System.out.println("-------------------------");
                break;
            } else {
                System.out.println("Nice try, the number was: " + randomNumber);
                System.out.println("Enter number one more time: ");
            }
        }
    }
}

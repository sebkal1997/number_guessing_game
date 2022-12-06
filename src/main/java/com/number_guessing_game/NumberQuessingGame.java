package com.number_guessing_game;

import java.util.Scanner;

public class NumberQuessingGame {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("How many trials do you want to have? ");
    int trials = scanner.nextInt();
    System.out.println("Set the range of value which you will guess.");
    System.out.println("Minimum range: ");
    int minRange = scanner.nextInt();
    System.out.println("Maximum range: ");
    int maxRange = scanner.nextInt();

    int random = minRange + (int)(maxRange * Math.random());

    System.out.println("A number you need to guess is between " + minRange + " to " + maxRange + " and you have " + trials + " trials.");
    int i;
    int guess;
    for (i = 0; i < trials; i++) {
      System.out.println("Quess a number:");
      guess = scanner.nextInt();

      if (guess == random) {
        System.out.println("Great! You guess a number in " + (i + 1) + " trials and you had " + trials);
        break;
      } else if (guess < random) {
        System.out.println("The number is greater than " + guess);
        System.out.println("You have " + (trials - i - 1) + " trials left.");
      } else if (guess > random) {
        System.out.println("The number is less than " + guess);
        System.out.println("You have " + (trials - i - 1) + " trials left.");
      }
    }
    if (i == trials) {
      System.out.println("You used all your " + trials + " trials.");
      System.out.println("The number was " + random);
    }
  }
}

///Угадай число
package com.company;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String playAgain = "";
                do {

                        int theNumber = (int)(Math.random() * 10 + 1);
                        int numberOfTries = 0;
                        int guess = 0;
                        while (guess != theNumber) { //начинаем цикл
                                System.out.println("Загадайте число между 1 и 10:");
                                guess = scan.nextInt();
                                numberOfTries = numberOfTries + 1;
                                if (guess < theNumber)
                                        System.out.println(guess + " это меньше числа, попробуйте еще раз.");
                                else if (guess > theNumber)
                                        System.out.println(guess + " это больше числа, попробуйте еще раз.");
                                else {
                                        System.out.println(guess + " Правильно! Вы выиграли");
                                        System.out.println("Вы выиграли за " + numberOfTries + " попытки. Отлично!");
                                }
                        } // Конец цикла
                        System.out.println("Сыграем еще? (y/n)?");
                        playAgain = scan.next();
                } while (playAgain.equalsIgnoreCase("y"));
                System.out.println("Спасибо за игру. Пока!");
                scan.close();
        }
}
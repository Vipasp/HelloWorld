//Программа расчета суммы трех чисел
package com.company;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                int sum = scan();
                System.out.println("Сумма: " + sum);
                        }



        public static int scan(){
                int sum=0;
                for(int i = 1; i < 4; i++){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число " + i);
                int num= scanner.nextInt();
                sum=sum+num;
                }
                return sum;

        }


}
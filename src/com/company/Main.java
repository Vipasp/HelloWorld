package com.company;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
                int sum = scan(); //вызываем метод ввода с клавиатуры
                System.out.println("Сумма: " + sum);
                        }



        public static int scan(){
                Scanner scanner = new Scanner(System.in); //пока без циклов и проверок на на правильность ввода))
                System.out.println("Введите первое число"); //приглашаем ввести
                int num1 = scanner.nextInt(); //считываем первое число
                System.out.println("Введите второе число");
                int num2 = scanner.nextInt();
                System.out.println("Введите третье число");
                int num3 = scanner.nextInt();
               return (summaChisel(num1,num2,num3)); //выносим сложение в отдельный метод

        }
        public static int summaChisel(int num1,int num2, int num3){
                return (num1+num2+num3); //возвращаем сумму
        }

}
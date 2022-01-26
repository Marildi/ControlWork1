package Hillel.HW;//1. Even Number (Написать программу, которая определяет, является ли число четным или нет.
//Проверять только целые числа. Добавить обработку ошибок с писанием.)

import java.util.Scanner;

public class EvenNumber {
    public EvenNumber() {
        int num;
        System.out.println("Input number: ");

        Scanner input = new Scanner(System.in);
        num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");
    }
}

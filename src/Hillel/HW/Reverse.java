//3. Reverse (Напишите программу для переворачивания строки, изменив расположение символов в строке наперед без использования
//встроенных в Стринг функций)
package Hillel.HW;

import java.util.Scanner;

public class Reverse {
    public Reverse() {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        reverseNumber(num);
    }

    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }
}

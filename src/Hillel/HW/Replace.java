//5. Replace (Написать программу, которая заменяет в исходной строке все буквы а на @. Буквы о на ноль.
//Выводит новую строку на экран. Добавить обработку длинны строки, максимальная длинна 30 символов.
//Строка может состоять из нескольких слов и любых символов
package Hillel.HW;

import java.util.Scanner;

public class Replace {
    public Replace() {

        System.out.print("Enter the text for replace: ");

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String result =  text
                .replaceAll("a", "@")
                .replaceAll("o", "0");

        System.out.println("Result: " + result);
    }
}

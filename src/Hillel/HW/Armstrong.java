//2. Armstrong (Написать программу для проверки является ли введенное число - числом Армстронга. Число Армстронга это число
//значение которого равно сумме цифр, из которых оно состоит, возведенных в степень, равную кол-ву цифр в этом числе.
//Как пример - число 371:
//371 = 3 * 3 * 3 +7*7*7+1*1*1 = 27 + 343 + 1 = 371
//Если у вас число четырехзначное...

package Hillel.HW;

import java.util.Scanner;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }
        temp = n;
        while (temp > 0) {
            last = temp % 10;
            sum += (Math.pow(last, digits));
            temp = temp / 10;
        }
        if (n == sum)
            return true;
        else return false;
    }

    public Armstrong() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        num = sc.nextInt();
        System.out.println("Armstrong Number up to " + num + " are: ");
        for (int i = 0; i <= num; i++)
            if (isArmstrong(i))
                System.out.print(i + ", ");
    }
}

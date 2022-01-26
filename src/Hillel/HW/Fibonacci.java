//4. Fibonacci (Рассчитать первых 20 чисел Фиббоначи вывести их на экран)
package Hillel.HW;

class Fibonacci {
    public Fibonacci() {
        long n1 = 0, n2 = 1, n3 = 0 , i = 0, count = 50;

        for (i = 1; i <= count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.println(i + ". " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}

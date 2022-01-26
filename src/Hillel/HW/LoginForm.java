package Hillel.HW;

import java.util.Scanner;

//Создать программу, которая логинит пользователя. На стартовом єкране запрашиваете логин и пароль.
//Если логин удачный, переходим на след. экран. Если нет, выводим ошибку.
//Пара логин-пароль хранится в переменных. После удачного логина выводим меню с 5 вариантами задач.
//Добавить обработку ошибок. Разложить задачи на методы (плюсом будет разложение на классы).
//Все запушить в гит отдельным проэктом или папкой и скинуть мерж реквестом.
//Через сканнер


public class LoginForm {
    public static void main(String[] args) {
        new LoginForm();
    }

    public LoginForm() {
        // system credentials
        String[] credentials = new String[] {
                "maryna",
                "123",
        };

        while(true) {
            String[] values = askTypeCredentials();
            if (values[0].equals(credentials[0]) && values[1].equals(credentials[1])) {
                break;
            }

            System.out.println("Login or password incorrect.");
        }

        System.out.println("Logged in.\n");

        int number = askTypeVariantNumber();

        switch(number) {
            case 1:
                new EvenNumber();
                break;
            case 2:
                new Armstrong();
                break;
            case 3:
                new Reverse();
                break;
            case 4:
                new Fibonacci();
                break;
            case 5:
                new Replace();
                break;
        }

        System.out.println("bye!");
    }

    public String[] askTypeCredentials() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you login: ");
        String name = scanner.nextLine();
        System.out.println("Please enter you password: ");
        String password = scanner.nextLine();

        return new String[] {
                name,
                password,
        };
    }

    public int askTypeVariantNumber() {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Here are 5 exercises:");
            System.out.println("1. Even Number");
            System.out.println("2. Armstrong");
            System.out.println("3. Reverse");
            System.out.println("4. Fibonacci");
            System.out.println("5. Replace");

            int number = scanner.nextInt();
            if (number >= 1 && number <= 5) {
                return number;
            }
        }
    }
}





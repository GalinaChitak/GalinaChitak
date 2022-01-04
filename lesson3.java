package com.galinachitak.Lesson3;

import java.util.Scanner;



public class lesson3 {
    public static final double CODE_SUCCESS = 200;
    public static final double CODE_SUCCESS1 = 201;
    public static final double CODE_SUCCESS2 = 202;
    public static final double CODE_SUCCESS4 = 204;
    public static final double CODE_REDIRECTION = 301;
    public static final double CODE_REDIRECTION1 = 302;
    public static final double CODE_CLIENT = 400;
    public static final double CODE_CLIENT1 = 401;
    public static final double CODE_CLIENT2 = 404;
    public static final double CODE_SERVER = 500;
    public static final double CODE_SERVER1 = 502;
    public static final double CODE_SERVER2 = 503;
    public static final double CODE_SERVER3 = 504;


    public static void main(String[] args) {

        /* Пользователь вводит 2 катета прямоугольного треугольника. Найти гипотенузу.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите катет а");
        double a = scanner.nextDouble();
        System.out.println("Катет a = " + a);
        System.out.println("Введите катет b");
        double b = scanner.nextDouble();
        System.out.println("Катет b = " + b);
        double c = Math.hypot(a, b);
        System.out.println("Гипотенуза = " + c);
        System.out.println(c);

        triangle();
        number();
        numberCode();
        numberCode1();
        twoSystems();
        equation();

    }


    /* 2) Вычислить площадь треугольника по 3 сторонам или написать что такой треугольник не существует.
     */


    private static void triangle() {
        Scanner scanner = new Scanner(System.in);
        double a, b, c;
        System.out.println("Укажите сторону a:");
        a = scanner.nextDouble();
        System.out.println("Укажите сторону b:");
        b = scanner.nextDouble();
        System.out.println("Укажите сторону c:");
        c = scanner.nextDouble();
        double s = (a + b + c) / 2.0;

        double result = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Площадь треугольника" + " " + result + " ");
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");

        }
    }


    private static void number() {
        /*Попросить пользователя ввести 2 числа.
        Используя тернарный оператор вывести меньшее из них. */

        Scanner s = new Scanner(System.in);

        System.out.println("Введите число a:");
        int var1 = Integer.parseInt(s.nextLine());
        System.out.println("Введите число в:");
        int var2 = Integer.parseInt(s.nextLine());

        System.out.printf("Наименьшим является - %d", Math.min(var1, var2));

    }

    /* 4) Решить эту задачу 2мя способами: через switch-case и if-else
        Пользователь вводит целое число - код ошибки.
        В зависмости от числа вывести:
        Если 200, 201, 202 или 204 - Success
        Если 301 или 302 - Redirection
        Если 400, 401 или 404 - Client Error
        Если 500, 502, 503 или 504 - Server Error
        Иначе Unknown Error
     */


    private static void numberCode() {
        System.out.println("  ");
        System.out.println("Введите код ошибки: ");
        Scanner scanner = new Scanner(System.in);
        int numberCode = scanner.nextInt();

        switch (numberCode) {
            case 200, 201, 202, 204 -> System.out.println("Success ");
            case 301, 302 -> System.out.println("Redirection");
            case 400, 401, 404 -> System.out.println("Client Error");
            case 500, 502, 503, 504 -> System.out.println("Server Error");
            default -> System.out.println("Unknown Error");
        }
    }

    private static void numberCode1() {
        System.out.print("Введите номер ошибки: ");
        Scanner scanner = new Scanner(System.in);
        int numberCode1 = scanner.nextInt();
        if (numberCode1 == CODE_SUCCESS && numberCode1 == CODE_SUCCESS1 && numberCode1 == CODE_SUCCESS2
                && numberCode1 == CODE_SUCCESS4) {
            System.out.println("Success");
        } else if (numberCode1 == CODE_REDIRECTION && numberCode1 == CODE_REDIRECTION1) {
            System.out.println("REDIRECTION");
        } else if (numberCode1 == CODE_CLIENT && numberCode1 == CODE_CLIENT1 && numberCode1 == CODE_CLIENT2) {
            System.out.println("CLIENT ERROR");
        } else if (numberCode1 == CODE_SERVER && numberCode1 == CODE_SERVER1 && numberCode1 == CODE_SERVER2
                && numberCode1 == CODE_SERVER3) {
            System.out.println("SERVER ERROR");
        } else {
            System.out.println("Unknown Error");
        }

        // 5*) Пользователь вводит число. Вывести это число в 2-ичной и 16-ричной системе.
    }

    private static void twoSystems() {

        System.out.println("  ");
        System.out.println("Введите число для вичесления в 2-ичной и 16-ричной системе : ");
        Scanner scanner = new Scanner(System.in);
        Integer number = scanner.nextInt();
        System.out.println("в 2-ичной ");
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);
        System.out.println(" в 16-ричной");
        String convert1 = Integer.toHexString(number).toUpperCase();
        System.out.println(convert1);
    }

    private static void equation() {
        // 6*) Написать программу которая решает квадратное уравнение вида a*x*x + b*x + c = 0, где заданы a,b,c.
        Scanner s = new Scanner(System.in);

        System.out.println("Введите значения уравнения (a*x*x + b*x + c = 0).");
        System.out.println("a");
        double a = Double.parseDouble(s.nextLine());
        System.out.println("b");
        double b = Double.parseDouble(s.nextLine());
        System.out.println("c");
        double c = Double.parseDouble(s.nextLine());

        // нужно найти дискриминант(discr)
        double discr = Math.pow(b, 2) - 4 * a * c;

        // дискриминант равен 0 (1 корень)
        if (discr == 0) {
            System.out.printf("x1 = x2 = %.2f", -b / 2);
        } else {
            // дискриминант больше 0 (2 корня)
            if (discr > 0) {
                System.out.printf("x1 = %.2f \nx2 = %.2f",
                        (-b + Math.sqrt(discr)) / 2, (-b - Math.sqrt(discr)) / 2);
            } else {
                // дискриминант меньше 0 ( нет корня)
                System.out.printf("корней нет — ничего считать не надо");
            }

        }

    }
}

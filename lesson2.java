package com.galinachitak;

import java.util.Scanner;


@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Введите год рождения:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = 2021;
        int result = b - a;
        System.out.println("Result: " + result);

        System.out.println("Введите свой вес");
        int c = scanner.nextInt();
        int n = 6;
        int resultTwo = c / n;
        System.out.println("ResultTwo: " + resultTwo);

        System.out.println("Население земли 7_500_000_000 человек.");
        System.out.println("Количество людей через 3 года.");
        long d = 7_500_000_000L;
        long h = d * 10 / 100;
        long h1 = d + h;
        long h2 = h1 + h;
        long h3 = h2 + h;
        System.out.println("Результат" + h3);

        System.out.println("Введите целое число а:");
        int a1 = scanner.nextInt();
        System.out.println("Введите целое число в:");
        int a2 = scanner.nextInt();
        System.out.println("Введите целое число с:");
        double a3 = scanner.nextInt();
        double a4 = (a1 + a2 + a3) / 3;
        System.out.println("среднее арифметическое" + a4);

        System.out.println("Введите число а1:");
        int b1 = scanner.nextInt();
        System.out.println("Введите число а2:");
        int b2 = scanner.nextInt();
        System.out.println("Введите число а3:");
        int b3 = scanner.nextInt();
        int b4 = Math.max(b1, b2);
        System.out.println("Максимальное число:");
        System.out.println(Math.max(b3, b4));
        int b5 = Math.min(b1, b2);
        System.out.println("Минимальное число:");
        System.out.println(Math.min(b3, b5));

        System.out.println("Введите номер месяца:");
        int month = scanner.nextInt();
        int c1 = 1;
        int c2 = 2;
        int c3 = 12;
        int c4 = 3;
        int c5 = 4;
        int c6 = 5;
        int c7 = 6;
        int c8 = 7;
        int c9 = 8;
        int c10 = 9;
        int c11 = 10;
        int c12 = 11;
        System.out.println("Время года");

        System.out.println(month < 3 || month == 12 ? "зима" :
                month < 6 ? "весна" :
                        month < 9 ? "лето" : "осень");

    }
}

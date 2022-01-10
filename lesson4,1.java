package com.galinachitak.lesson4;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;


public class lesson4 {
    public static void main(String[] args) {

        /*1) Попросить пользователя ввести ФИО (3 разные переменные).
        Записать в строку String можно при помощи scanner.next() или scanner.nextLine().
        Используя один оператор print() вывести ФИО в 3 строки ("\n"): */

        Scanner scanner = new Scanner(in);

        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine();
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите отчество:");
        String lastname = scanner.nextLine();

        System.out.printf("ФИО: \n %s \n %s \n %s \n", surname, name, lastname);

        numbers();
        randomNumber();
        decreasingNumbers();
        splitNumbers();
        changeNumbers();
        randomNumbers();

    }

    private static void numbers() {
        /*2) Вывести числа от 1100 до 1200 кратные 17 */
        System.out.println("Вывести числа от 1100 до 1200 кратные 17");
        for (int i = 1100; i <= 1200; i++) {
            if (i % 17 == 0) {
                System.out.println(i + " ");
            }
        }
    }

    private static void randomNumber() {
        System.out.println("3) Вывести целое случайное число от 80 до 100 включительно.");
        Random random = new Random();
        int i = random.nextInt(21) + 80;
        System.out.println(i);


    }

    private static void decreasingNumbers() {
        /* 4*) При помощи цикла заполнить массив из 10 элементов значениями от 10 по убыванию. т.е
        он должен выглядеть так: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
         */
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = 10 - i;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void splitNumbers() {
        /*Попросить пользователя ввести 3х значное число. Преобразовать его в массив разрядов.*/
        System.out.println("Введите число");
        Scanner scanner = new Scanner(in);
        int a = scanner.nextInt();
        char[] c = ("" + a).toCharArray();
        int[] digits = new int[c.length];
        {
            for (int i = 0; i < digits.length; i++) {
                digits[i] = c[i] - '0';
            }
        }

        System.out.println((Arrays.toString(digits)));
    }

    private static void changeNumbers() {
        /*  6*) Есть 2 переменные int a = 5, int b = 10. Поменять значения переменных местами
          без использования дополнительных переменных.*/
        int a = 5;
        int b = 10;
        System.out.printf("a = %d\nb = %d\n\n", a, b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("a = %d\nb = %d\n", a, b);
    }

    private static void randomNumbers() {
        /*7*) Задать массив из 10 случайных чисел, и вывести минимальный элемент массива.*/


        Random random = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));


        int min = arr[0];
        for (int j : arr) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println("Минимальный елемент массива: " + min);
    }
}

package com.galinachitak;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class aaaaaaaaaaaaaaaaaaaaa {
    public static void main(String[] args) {
        /*) Простая игра и цикл while:Компьютер задумывает случайное число от 1 до 1000 и просит
         вас ввести число. После этого он говорит вы
         угадали или число больше/меньше. Продолжается до тех пор пока пользователь не угадает число.*/

        Scanner scan = new Scanner(System.in);
        int b = 1 + (int) (Math.random() * 1000);
        int a = 0;
        while (a != b) {
            System.out.println("Угадайте число от 1 до 1000");
            a = scan.nextInt();
            if (a < b) {
                System.out.println("Ваше число меньше");
            } else if (b < a) {
                System.out.println("Ваше число больше");
            } else {
                System.out.println("Поздравляю вы прошли игру :-)");
            }
        }
        average1();
        sorting();
        totalApproaches();


    }

    private static void average1() {
        /*3) Написать метод который возвращает среднее арифметическое массива который передан как параметр.*/

        Random random = new Random();
        int[] myArray = new int[10];

        setArray(random, myArray);

        System.out.println(Arrays.toString(myArray));
        System.out.println("Среднее арифметическое: " + average(myArray));

    }

    private static double average(int[] myArray) {
        double sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        return sum / myArray.length;
    }

    private static void setArray(Random random, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
    }
    /*4*) Написать метод который сортирует массив случаных числе
    сортировкой вставками. Массив передается в метод как параметр.
     */

    public static void sorting() {
        int[] how = new int[10];
        for (int i = 0; i < how.length; i++) {
            how[i] = (int) Math.round(Math.random() * 100);
            System.out.print(how[i] + " ");
        }
        {
            System.out.println(" ");
            int j, temp;
            for (int i = 0; i < how.length; i++) {
                temp = how[i];
                for (j = i - 1; j >= 0 && how[j] > temp; j--) {
                    how[j + 1] = how[j];
                }
                how[j + 1] = temp;
            }
            System.out.println(" ");

            for (int i = 0; i < how.length; i++) {
                System.out.print(how[i] + " ");
            }
        }
    }

    /*1) Человек подтягивается, делая подходы лесенкой начиная с 1 раза: 1 раз, 2 раза, 3 раза, итд.
    Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры
   1.1*) Каждое подтягивание занимает 5 секунд, первый перерыв между подходами 60 секунд.
 Каждый следующий перерыв на 20% больше предыдущего, вывести общее время в формате mm:ss (например 15:45)
 */


    private static int totalApproaches() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ");

        System.out.println("Введите количество подходов:");
        int quantity = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int time1 = 0;
        double time2 = 0;

        for (int i = 1; i <= quantity; i++) {
            sum += i;
            if (i != quantity) {
                time1 += 5 * i + 60;
                time2 += 5 * i + 60 * Math.pow(1.2, i);
            }
        }
        System.out.printf("Количество %d подтягиваний\n", sum);
        System.out.printf("Общее время - %d:%d",
                (int) (time2 / 60),
                (int) time2 % 60);
        return quantity;
    }
}


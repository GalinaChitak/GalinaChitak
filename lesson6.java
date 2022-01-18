package com.galinachitak;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson6 {
    public static final Random RANDOM = new Random();
    public static final int COUNT = 100000000;



    public static void main(String[] args) {
      /*1) Подсчитать вероятность при помощи Random и большого количество повторений:
- сумма значиний при броске 2 кубиков равна 9 или больше
- на всех 3 кубиках значения разные
- на 3 монетках выпала одна сторона*/
      
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            if (cubes() == cubes()) {
                count++;
            }
        }
        double probability = count / (double) COUNT * 100;
        System.out.println("Вероятность: " + probability);

        cubesDifferent();
        cubesIdentical();
        people();
        range();
    }

    public static int cubes() {
        return RANDOM.nextInt(6) + 1;
    }

    public static void cubesDifferent() {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = cubes();
            int dice2 = cubes();
            int dice3 = cubes();
            if (dice1 != dice2 && dice2 != dice3 && dice3 != dice1) {
                count++;
            }
        }

        double probability = count / (double) COUNT * 100;
        System.out.println("Вероятность на 3 кубиках значения разные: " + probability);
    }

    public static void cubesIdentical() {
        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            int coin1 = coin();
            int coin2 = coin();
            int coin3 = coin();
            if (coin1 == coin2 && coin2 == coin3 && coin3 == coin1) {
                count++;
            }
        }

        double probability = count / (double) COUNT * 100;
        System.out.println("Вероятность на 3 монетах выпала одна сторона :" + probability);

    }

    public static int coin() {
        return RANDOM.nextInt(2) + 1;

    }
  /*2) 3*) Пользователь вводит количество людей в группе, например 30. Вывести вероятность того
 что как минимум у 2 из них день рождение в один день.
 Как решать эту задачу? Например создать 100_000 групп случайных людей и подсчитать в каком проценте случев есть совпадение.
 День рождение можно задать просто числом от 1 до 365, .т.е. группа из 30 человек это массив на 30 чисел от 1 до 365. */

    public static void people() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество людей  в групе:");
        int[] arrDay = new int[Integer.parseInt(scanner.nextLine())];

        int count = 0;
        for (int i = 0; i < COUNT; i++) {
            setDay(arrDay);
            if (coincidence(arrDay)) {
                count++;
            }
        }

        double probability = count / (double) COUNT * 100;
        System.out.println("Результат: " + probability);

    }

    private static boolean coincidence(int[] arrDay) {
        for (int j = 0; j < arrDay.length; j++) {
            for (int k = j + 1; k < arrDay.length; k++) {
                if (arrDay[j] == arrDay[k]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void setDay(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = RANDOM.nextInt(365) + 1;
        }
    }
  /*2) В метод передаются размер массива и числа a, b;
  Метод должен вернуть массив заданного размера который содержит случайные значения в диапазоне a..b.
  Например, размер = 5, a=-3, b=3
  Результат: [2, -3, 0, 3, 1] */

    public static void range() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер масива: ");
        int arrayGeneral = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введите начало массива: ");
        int arrayFirst = scanner.nextInt();
        System.out.print("Введите конец массива: ");
        int arrayLast = scanner.nextInt();
        System.out.print("Итоговый массив: ");
        System.out.println(Arrays.toString(rangeArray(arrayGeneral,arrayFirst, arrayLast)));

    }

    private static int[] rangeArray(int arrayGeneral, int arrayStart, int arrayFinish) {
        int[] userArray = new int[arrayGeneral];
        for (int i = 0; i < userArray.length; i++) {
            if (arrayStart < 0) {
                userArray[i] = RANDOM.nextInt(-arrayStart + arrayFinish + 1) - arrayFinish;
            } else {
                userArray[i] = RANDOM.nextInt(arrayFinish - arrayStart + 1) + arrayStart;
            }
        }
        return userArray;
    }
    }

package com.galinachitak;


import java.util.Arrays;

public class lessonN {

    public static void main(String[] args) {
        System.out.println("Max:" + Arrays.toString(myMethod2(12, 45, -15, 48)));
        System.out.println("Max:" + Arrays.toString(myMethod2(25, 45, 66, 78, 55)));

        Palindrom();
    }

    private static int[] myMethod2(int... values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if (max < value) {
                max = value;
            }


        }
        return new int[]{max};
    }

    public static void Palindrom() {

        String s = "А роза упала на лапу Азора".trim();
        isPalindrome(s);
        reverseString1(s);

    }

    public static String reverseString(String s) {
        String r = " ";
        for (int i = s.length() - 1; i >= 0; --i)
            r += s.charAt(i);
        return r;
    }

    public static String reverseString1(String s) {
        System.out.println(reverseString(s).equalsIgnoreCase(s));
        return s;
    }
    public static Boolean isPalindrome(String s) {
        if(s.equals(reverseString(s))){
            System.out.println("Полиндром");
        }else{
            System.out.println("Не полиндром");
        }
        return s.equals(reverseString(s));

    }

}





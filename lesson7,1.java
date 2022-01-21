package com.galinachitak;


import java.util.Arrays;




public class lesson7 {




    public static void main(String[] args) {
        /*1) Привести по примеру кода для каждого из перечисленных методов String:
        charAt, contains, endsWith, startsWith, equals, equalsIgnoreCase,
        format, indexOf, isEmpty, length, replace,  substring, toLowerCase, toUpperCase, trim, split*/
        contains();
        charAt();
        endsWith();
        startsWith();
        equals();
        equalsIgnoreCase();
        format();
        indexOf();
        myName(name);
        length();
        replace();
        substring();
        toLowerCase();
        toUpperCase();
        trim();
        split();

    }

    private static void split() {
        String fullName = "Chitak Galina Vladimirovna";
        String [] arr = fullName.split("\\s+");
        System.out.println(Arrays.toString(arr));

    }

    private static void trim() {
        String text = " galina ".trim();
        if (text.equals("galina"));{
            System.out.println(" This is galina");
        }



    }

    private static void toUpperCase() {
        String text = "My name is Galina i want to eat.".toUpperCase();
        if (text.contains("galina"));
        System.out.println(text);

    }

    private static void toLowerCase() {
        String text = "My name is Galina i want to eat.";
        char[] charArray = text.toCharArray();
        for (char ch : charArray) {
        }
        System.out.println(Arrays.toString(charArray) + " ");

    }

    private static void substring() {
        String text ="My name is Galina i want to eat.";
        String text2 = text.substring(11,17);
        System.out.println("substring   " + text2 );

    }

    private static void replace() {
        String text ="My name is Galina i want to eat." ;
        text = text.replace("Galina", "Alex");
        System.out.println("replace   " + text);
    }

    private static void length() {
        String s = "";
        String s1 = null;
        testString(s);

    }

    private static void testString(String s) {
        if (s != null);
        System.out.println("length   " + s.length());
    }


    public static String myName(String name) {

        if (name != null && !name.isEmpty()) {
            System.out.println("isEmpty "+ "Дальше");

        } else {
            name = "";
        }
        System.out.println("isEmpty  " + "Запалните поле" );
        return name;
    }

    private static void indexOf() {
        String text = "My name is Galina i want to eat.";
        System.out.println("indexOf        " + text.indexOf("Galina"));

    }

    private static void format() {
        String pattern  = "My name is %s i want to eat";
        String text = String.format(pattern, "Galina");
        System.out.println("format     " + text);

    }
    private static String name;

    private static void equalsIgnoreCase() {
        String text = "qweRtyui";
        String text2 = "qwertyui";
        System.out.println("equalsIgnoreCase    "+text.equalsIgnoreCase(text2));

    }

    private static void equals() {
        String text = "qwertyui";
        String text2 = "qwertyui";
        System.out.println("equals    "+text.equals(text2));
    }

    private static void startsWith() {
        String url = "https://time.is/ru/Japan";
        if (!url.startsWith("https://")); {
            url = "https://" + url;
        }
        System.out.println("startsWith    " + url);

    }


    private static void endsWith() {
        String text = " My name is Galina i want to eat.";
        if (text.endsWith("My")) ;
        {
            System.out.println("endsWith   " + "Hello Galina");
        }

    }

    private static void charAt() {

            String s = "example";
            char ch = s.charAt(4);
            System.out.println("charAt    " + ch);
        }

        public static String contains() {

            String text1 = " My name is Galina i want to eat.";
            if (text1.contains("Galina")) ;
            {
                System.out.println("contains   " + "Hello Galina");
            }


            return text1;
        }

                }

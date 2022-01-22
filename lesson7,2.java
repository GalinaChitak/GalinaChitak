public class values {
    public static void main(String[] args) {
        /*3*) Написать метод который проверяет является ли строка палиндромом, т.е. читается задом
        наперед одинаково, без учета регистра и пробелов, например:
        "А роза упала на лапу Азора" - палиндром.*/

        String myString = "А роза упала на лапу Азора";
        String formatted = myString.replaceAll(" ", "");

        newString(formatted);
        examination();
        result();
        permutation("abc", "");


    }

    public static void newString(String formatted) {

        StringBuffer my = new StringBuffer(formatted);
        my.reverse();
        String data = my.toString();
        if (formatted.equalsIgnoreCase(data)) {
            System.out.println(" is palindrome");
        } else {
            System.out.println(" is not palindrome");
        }
    }

    //4*) Написать метод который проверяет состоит ли строка из одних только цифр. Метод должен вернуть true или false
    public static void examination() {
        String text = "45675hjn888787";

        checkString(text);
        System.out.println(checkString(text));
    }

    private static boolean checkString(String text) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= '0' && ch <= '9') {
            } else {
                return false;
            }
        }
        return true;
    }

    public static int result() {
        /*2) Использя оператор "..." написать метод который возвращает максимальное значение
        типа int из переданных типа int.
        Например:
        int result1 = max(10, 30, 40, 20);
        int result2 = max(10, 20);*/

        System.out.println("Max:" + max(12, 45, -15, 48));
        System.out.println("Max:" + max(25, 45, 66, 78, 55));
        return 0;
    }

    private static int max(int... values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            int value = values[i];
            if (max < value) {
                max = value;
            }
        }
        return max;
    }
    /*5*) Вывести все перестановки строки которую вводит пользователь. Например для строки "abc": abc acb bac bca
    cab cba*/

    private static void permutation(String left, String right) {
        if (left.length() <= 1) {
            System.out.println(left + right);
            count++;
            return;
        }
        for (char ch : left.toCharArray()) {
            String newLeft = left.replace(String.valueOf(ch), "");
            permutation(newLeft, right + ch);
        }

    }

    private static int count = 0;


}





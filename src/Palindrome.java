import java.util.Scanner;
import java.lang.String;

public class Palindrome {

    public static void main(String[] args) { // Основной метод
        System.out.println("Palindrome: ");
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " - " + isPalindrome(s));
        }
    }
    public static String reverseString(String s){           //Метод для переворота строки
        String rev = "";
        for (int i = s.length() - 1; i >= 0; --i)
            rev += s.charAt(i);
        return rev;

    }
    public static Boolean isPalindrome(String s) {
        String rev = reverseString(s);                                                        //Метод для проверки палиндромов
        return s.equals(reverseString(s));
    }

}
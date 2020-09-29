package Palindrome;

public class Palindrome {
    public static void main(String[] args) {

    }

    public static boolean palindrome(String text) {
        StringBuilder result = new StringBuilder(text);
        return result.reverse().toString().equals(text);
    }


}

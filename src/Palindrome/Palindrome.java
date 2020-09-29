package Palindrome;

public class Palindrome {
    public static void main(String[] args) {

    }

    public static boolean palindrome(String text) {
        StringBuilder result = new StringBuilder(text);
        return result.reverse().toString().equals(text);
    }

    public static boolean palindrome2(String text){
        for (int i = 0, j = text.length()-1; i < text.length()/2; i++, j--) {
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }
        }
        return true;
    }
}

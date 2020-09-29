package ReverseString;

// --- Directions
// Given a string, return a new string with the reversed
// order of characters
// --- Examples
//   reverse('apple') === 'leppa'
//   reverse('hello') === 'olleh'
//   reverse('Greetings!') === '!sgniteerG'

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println(reverseString2(" salaam alaikum  8"));
    }

    static String reverseString(String text){
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            stack.push(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    static String reverseString2(String text){
        StringBuilder result = new StringBuilder(text);
        return result.reverse().toString();
    }
}

package Palindrome;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void checkPalindrome(){
        Assertions.assertTrue(Palindrome.palindrome("madam"));
    }

    @Test
    public void checkPalindromeFalse(){
        Assertions.assertFalse(Palindrome.palindrome("ali"));
    }
}

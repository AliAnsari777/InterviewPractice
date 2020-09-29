package ReverseString;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    public void checkReverseString(){
        Assertions.assertEquals("olleh", ReverseString.reverseString("hello"));
    }

    @Test
    public void checkReverseString2(){
        Assertions.assertEquals("eyb doog", ReverseString.reverseString2("good bye"));
    }

    @Test
    public void checkStringWithSpace(){
        Assertions.assertEquals("   ila", ReverseString.reverseString("ali   "));
    }
}
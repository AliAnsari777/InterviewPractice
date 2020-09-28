package ReverseString;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    @Test
    public void checkReverseString(){
        Assertions.assertEquals("olleh", ReverseString.reverseString("hello"));
    }

    @Test
    public void checkExist(){
        Assertions.assertEquals("eyb doog", ReverseString.reverseString("good bye"));
    }
}
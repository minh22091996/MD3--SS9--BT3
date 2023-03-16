package rikkei;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translate() {
    String result = FizzBuzzTranslate.translate(10);
    String expected = "Buzz";
    assertEquals(expected,result);
    }
}
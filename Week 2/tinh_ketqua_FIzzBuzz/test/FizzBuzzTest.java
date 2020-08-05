import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void getFizzBuzz() {
        int a = 435;
        String expected = "Buzz";

        String result = FizzBuzz.getFizzBuzz(a);
        assertEquals(expected,result);

    }

    @Test
    void testTranslate(){
        int numb =35;
        String expected = "twenty five";

        String result = FizzBuzz.FizzBuzzTranslate(numb);
        assertEquals(expected,result);
    }
}
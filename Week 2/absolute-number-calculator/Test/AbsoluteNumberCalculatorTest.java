import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @org.junit.jupiter.api.Test
    void testFindAbsolute() {
        int number =0;
        int expected =0;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void testFindAbsolute1() {
        int number =1;
        int expected =1;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @org.junit.jupiter.api.Test
    void testFindAbsoluteMinus2() {
        int number =-2;
        int expected =2;

        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }



}
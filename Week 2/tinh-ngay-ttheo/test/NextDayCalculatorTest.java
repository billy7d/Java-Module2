import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void testGetDaysOfMonth() {
        int day =30;
        int month =4;
        int expected = 7;

        int result = NextDayCalculator.getDaysOfMonth(month);
        assertEquals(expected,result);

    }
    @Test
    void testGetNextDay(){
        int day =23;
        int month =5;
        int expected = 23;

        int result1 = NextDayCalculator.getNextDay(day,month);
        assertEquals(expected,result1);
    }

    @Test
    void testGetMonth(){
        int day =30;
        int month =12;
        int expected = 5;

        int result2 = NextDayCalculator.getMonth(day,month);
        assertEquals(expected,result2);
    }

    @Test
    void testGetYear(){
        int day =31;
        int month =12;
        int year =2020;
        int expected = 2021;

        int result3 = NextDayCalculator.getYear(day,month,year);
        assertEquals(expected,result3);
    }

    @Test
    void testGetDayMonthYear(){
        int day =25;
        int month =4;
        int year =2020;
        int expected = 31122021;

        String result4 = NextDayCalculator.getDayMonthYear(day,month,year);
        assertEquals(expected,result4);
    }
}
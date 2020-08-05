import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testIsTriangle() {
        int a = -1;
        int b = 2;
        int c = 1;

        boolean expected = true;

        boolean result = TriangleClassifier.isTriangle(a,b,c);
        assertEquals(expected,result);

    }
    @Test
    void testClassifyTriangle(){
        int a= 2;
        int b=2;
        int c=3;

        String expected ="la tam giac can";

        String result = TriangleClassifier.classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }

}
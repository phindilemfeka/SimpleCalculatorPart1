import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void addTest(){
        SimpleCalculator obj1 = new SimpleCalculator();
        int addition=obj1.add(5,8,8,7);
        assertEquals(8,addition);

    }
    @Test
    void productTest(){
        SimpleCalculator obj2 = new SimpleCalculator();
        int multiplication = obj2.product(2*8*7);
        assertEquals(9,multiplication);
    }

}
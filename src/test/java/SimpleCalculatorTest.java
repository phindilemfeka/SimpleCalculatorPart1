import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void addTest(){
        SimpleCalculator obj1 = new SimpleCalculator();
        int addition= obj1.add(5,2);
        assertEquals(8,addition);

    }
   @Test
   void productTest(){
       SimpleCalculator obj2 = new SimpleCalculator();
       int multiplication = obj2.product(2,2);
       assertEquals(9,multiplication);
   }

}
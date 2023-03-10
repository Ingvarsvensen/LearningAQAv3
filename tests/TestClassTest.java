package tests;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClassTest {

    @Test
    public void twoPlusTwoShouldEqualFour(){
        var count = new TestClass();
        assertEquals(4, count.add(2, 2));
    }

}
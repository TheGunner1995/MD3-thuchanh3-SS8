package rikkei.academy.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Cylinder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    @DisplayName("Testing getVolume(0,0)")
    void testGetVolume0And0(){
        int radius = 0;
        int height = 0;
        double expected = 0;
        double result = Cylinder.getVolume(radius,height);
        assertEquals(expected,result);
    }

}

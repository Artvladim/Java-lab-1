import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class Lab1_sqrtTest extends Lab1_sqrt {

    @Test
    public void TheCaseOfSixteen() {
        Sqrt sqrt = new Sqrt (16);
        assertEquals(4,sqrt.calc(10),0.1);
        assertNotEquals(3,sqrt.calc(10),0.1);
    }
    @Test
    public void TheCaseOfNine() {
        Sqrt sqrt = new Sqrt (9);
        assertEquals(3,sqrt.calc(10),0.1);
        assertNotEquals(4,sqrt.calc(10),0.1);
    }
}
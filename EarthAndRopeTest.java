import org.junit.Test;

import static org.junit.Assert.*;

public class EarthAndRopeTest extends EarthAndRope{

    @Test
    public void earthAndRopeTest() {
        assertEquals(getResult(), 0.15915494319051504, 0.00000000001);
    }
}
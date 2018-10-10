import org.junit.Test;

import static org.junit.Assert.*;

public class PoolTest extends Pool{

    @Test
    public void poolTest() {
        assertEquals(getResult(), 72256.63103256523, 0.00000000001);
    }
}
package convert;

import junit.framework.TestCase;
import org.junit.Test;

public class ConvertTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testNairaToDollar() {
        double result = Convert.now("NGN", "USD", 50000);
        assertEquals(60.0, result, 0.01); // Expected result: $60.0
    }

    @Test
    public void testDollarToNaira() {
        double result = Convert.now("USD", "NGN", 1);
        assertEquals(830.0, result, 0.01); // Expected result: 830 NGN
    }
}
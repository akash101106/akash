import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testBelow1000() {
        assertEquals(800, Main.calculateAmount(800), 0.001);
    }

    @Test
    void testEqualTo1000() {
        assertEquals(900, Main.calculateAmount(1000), 0.001);
    }

    @Test
    void testAbove1000() {
        assertEquals(1800, Main.calculateAmount(2000), 0.001);
    }

    @Test
    void testZeroAmount() {
        assertEquals(0, Main.calculateAmount(0), 0.001);
    }

    @Test
    void testNoDiscount() {
        assertEquals(999, Main.calculateAmount(999), 0.001);
    }
}
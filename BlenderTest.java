import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BlenderTest {
    private Blender blender;

    @BeforeEach
    void setUp() {
        blender = new Blender();
    }

    @Test
    void testTurnOn() {
        blender.turnOn();
        assertTrue(blender.isOn(), "La licuadora debería estar encendida.");
    }

    @Test
    void testIncreaseSpeed() {
        blender.turnOn();
        blender.fill("Juice");
        blender.increaseSpeed();
        assertEquals(1, blender.getSpeed(), "La velocidad debería ser 1.");
    }

    @Test
    void testFill() {
        blender.turnOn();
        blender.fill("Juice");
        assertTrue(blender.isFull(), "La licuadora debería estar llena.");
    }

    @Test
    void testEmptyBlender() {
        blender.turnOn();
        blender.fill("Juice");
        blender.emptyBlender();
        assertFalse(blender.isFull(), "La licuadora debería estar vacía.");
    }
}

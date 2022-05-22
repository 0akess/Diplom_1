import org.junit.Test;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void BunTest_SetName_GetName() {

        Bun bun = new Bun("test", 1);
        assertEquals("test", bun.getName());
    }

    @Test
    public void BunTest_SetPrice_GetPrice() {

        Bun bun = new Bun("test", 100);
        assertEquals(100, bun.getPrice(), 0.0);
    }
}
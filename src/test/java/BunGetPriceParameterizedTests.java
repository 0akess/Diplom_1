import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetPriceParameterizedTests {

    private final float price;

    public BunGetPriceParameterizedTests(float price) {
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тестовые данные: \"{0}\"")
    public static Object[][] getTextData() {
        return new Object[][]{
                {100},
                {0},
                {0.01f},
                {1.123f},
                {-120.34f},
        };
    }

    @Test
    public void BunTest_SetPrice_GetPrice() {

        Bun bun = new Bun("test", price);
        assertEquals(price, bun.getPrice(), 0.0);
    }
}

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunGetNameParameterizedTest {

    private final String name;

    public BunGetNameParameterizedTest(String name) {
        this.name = name;
    }

    @Parameterized.Parameters(name = "Тестовые данные: \"{0}\"")
    public static Object[][] getTextData() {
        return new Object[][]{
                {"123"},
                {"FILLING"},
                {"FI34LLIN43G"},
                {"тест тестовый"},
                {"тест_тестовый"},
                {"_____"},
                {""},
                {null},
                {"тест тостовый"},
        };
    }

    @Test()
    public void BunTest_SetPrice_GetName() {

        Bun bun = new Bun(name, 1);
        assertEquals(name, bun.getName());
    }
}
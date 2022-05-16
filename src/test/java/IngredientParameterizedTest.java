import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IngredientParameterizedTest {

    private final String expected;
    private final IngredientType type;

    public IngredientParameterizedTest(String expected, IngredientType type){
        this.expected =expected;
        this.type = type;
    }

    @Parameterized.Parameters(name = "Тестовые данные: \"{0}\"")
    public static Object[][] getTextData() {
        return new Object[][] {
                {"SAUCE", IngredientType.SAUCE},
                {"FILLING", IngredientType.FILLING},
        };
    }

    @Test()
    public void doesHaveManeSexGetBoolean() throws Exception {

        Ingredient ingredient = new Ingredient(type, "test", 10f);
        assertEquals(expected, ingredient.getType().name());
    }
}

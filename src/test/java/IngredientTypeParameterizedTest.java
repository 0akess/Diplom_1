import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class IngredientTypeParameterizedTest {

    private final String expected;
    private final IngredientType type;

    public IngredientTypeParameterizedTest(String expected, IngredientType type) {
        this.expected = expected;
        this.type = type;
    }

    @Parameterized.Parameters(name = "Тестовые данные: \"{0}\"")
    public static Object[][] getTextData() {
        return new Object[][]{
                {"SAUCE", IngredientType.SAUCE},
                {"FILLING", IngredientType.FILLING},
        };
    }

    @Test()
    public void doesHaveManeSexGetBoolean() {

        Ingredient ingredient = new Ingredient(type, "test", 10f);
        assertEquals(expected, ingredient.getType().name());
    }
}
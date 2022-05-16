import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class IngredientTest {

    @Test
    public void getPriceTest(){

        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "test", 100.12f);
        assertEquals(100.12f, ingredient.getPrice(), 0.00);
    }

    @Test
    public void getNameTest(){

        Ingredient ingredient = new Ingredient(IngredientType.FILLING, "test", 100.12f);
        assertEquals("test", ingredient.getName());
    }
}

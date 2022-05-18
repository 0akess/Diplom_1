import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;


import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.Silent.class)
public class BurgerTest {

    @Mock
    Bun bun;

    @Mock
    Ingredient ingredient, ingredient2, ingredient3;

    @Test
    public void setBunsTest_SetBun_GetBun() {


        Burger burger = new Burger();
        burger.setBuns(bun);
        assertEquals(bun, burger.bun);
    }

    @Test
    public void addIngredientTest() {

        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        assertEquals(ingredient, burger.ingredients.get(0));

    }

    @Test
    public void removeIngredientTest() {

        Burger burger = new Burger();
        burger.ingredients.add(ingredient);
        burger.removeIngredient(0);
        assertEquals(true, burger.ingredients.isEmpty());
    }

    @Test
    public void moveIngredientTest() {

        Burger burger = new Burger();
        burger.ingredients.add(ingredient);
        burger.ingredients.add(ingredient2);
        burger.ingredients.add(ingredient3);
        burger.moveIngredient(0, 2);
        assertEquals(ingredient, burger.ingredients.get(2));
    }

    @Test
    public void getPriceTest() {

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.ingredients.add(ingredient);

        Mockito.when(bun.getPrice()).thenReturn(2f);
        Mockito.when(ingredient.getPrice()).thenReturn(6f);
        assertEquals(10f, burger.getPrice(), 0.00);
    }

    @Test
    public void getReceiptTest() {

        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.ingredients.add(ingredient);

        Mockito.when(bun.getName()).thenReturn("булка макаронная");
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient.getName()).thenReturn("цыпленок");

        String expected =
                "(==== булка макаронная ====)\n" +
                        "= filling цыпленок =\n" +
                        "(==== булка макаронная ====)\n" +
                        "\n" +
                        "Price: 0,000000\n";

        assertEquals(true, expected.equals(burger.getReceipt()));
    }
}
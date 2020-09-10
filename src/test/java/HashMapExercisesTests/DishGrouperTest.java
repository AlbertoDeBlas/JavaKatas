package HashMapExercisesTests;

import HashMapExercises.DishGrouper;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class DishGrouperTest {

    @Test
    public void groupingDishes_commonIngredientAndDish(){
        String[][] dishes= new String[][] {{"Salad","Tomato","Cucumber","Salad","Sauce"},
                {"Pizza","Tomato","Sausage","Sauce","Dough"},
                {"Quesadilla","Chicken","Cheese","Sauce"},
                {"Sandwich","Salad","Bread","Tomato","Cheese"}};
        String[][] expectedResult = new String[][]{{"Cheese","Quesadilla","Sandwich"},
                {"Salad","Salad","Sandwich"},
                {"Sauce","Pizza","Quesadilla","Salad"},
                {"Tomato","Pizza","Salad","Sandwich"}};
        assertGroupingDishes(dishes, expectedResult);
    }

    @Test
    public void groupingDishes_twoWordsIngredientAndDish(){
        String[][] dishes= new String[][]{{"Pasta","Tomato Sauce","Onions","Garlic"},
                {"Chicken Curry","Chicken","Curry Sauce"},
                {"Fried Rice","Rice","Onions","Nuts"},
                {"Salad","Spinach","Nuts"},
                {"Sandwich","Cheese","Bread"},
                {"Quesadilla","Chicken","Cheese"}};
        String[][] expectedResult = new String[][]{{"Cheese","Quesadilla","Sandwich"},
                {"Chicken","Chicken Curry","Quesadilla"},
                {"Nuts","Fried Rice","Salad"},
                {"Onions","Fried Rice","Pasta"}};
        assertGroupingDishes(dishes, expectedResult);
    }

    @Test
    public void groupingDishes_withoutCommonIngredients(){
        String[][] dishes= new String[][]{{"Pasta","Tomato Sauce","Onions","Garlic"},
                {"Chicken Curry","Chicken","Curry Sauce"},
                {"Fried Rice","Rice","Onion","Nuts"},
                {"Salad","Spinach","Nut"},
                {"Sandwich","Cheese","Bread"},
                {"Quesadilla","Chickens","Cheeseeee"}};
        String[][] expectedResult = new String[][]{};
        assertGroupingDishes(dishes, expectedResult);
    }

    @Test
    public void groupingDishes_multipleCommonIngredients(){
        String[][] dishes= new String[][]{{"First","a","b","c","d","e","f","g","h","i"},
                {"Second","i","h","g","f","e","x","c","b","a"}};
        String[][] expectedResult = new String[][]{{"a","First","Second"},
                {"b","First","Second"},
                {"c","First","Second"},
                {"e","First","Second"},
                {"f","First","Second"},
                {"g","First","Second"},
                {"h","First","Second"},
                {"i","First","Second"}};
        assertGroupingDishes(dishes, expectedResult);
    }

    private void assertGroupingDishes(String[][] dishes, String[][] expectedResult) {
        String[][] result = DishGrouper.groupingDishes(dishes);
        assertArrayEquals(result, expectedResult);
    }


}

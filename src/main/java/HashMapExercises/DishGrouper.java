package HashMapExercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DishGrouper {
    public static String[][] groupingDishes(String[][] dishes) {
        HashMap<String, ArrayList<String>> dishesWithIngredient = createDishesWithIngredientHashMap(dishes);
        removeDishesWithoutIngredients(dishesWithIngredient);
        TreeMap<String,ArrayList<String>> dishesWithoutIngredientsTree = orderLexicographically(dishesWithIngredient);
        String[][] dishesWithIngredientArray = createDishesWithIngredientArray(dishesWithIngredient, dishesWithoutIngredientsTree);

        return dishesWithIngredientArray;
    }

    private static String[][] createDishesWithIngredientArray(HashMap<String, ArrayList<String>> dishesWithIngredient, TreeMap<String, ArrayList<String>> dishesWithoutIngredientsTree) {
        String[][] dishesWithIngredientArray = new String[dishesWithIngredient.keySet().size()][];
        int j = 0;

        for(Map.Entry<String,ArrayList<String>> entry : dishesWithoutIngredientsTree.entrySet()) {
            ArrayList<String> dishesList = entry.getValue();
            dishesList.sort(String::compareTo);
            entry.getValue().add(0, entry.getKey());
            dishesWithIngredientArray[j++] = dishesList.toArray(new String[0]);
        }
        return dishesWithIngredientArray;
    }

    private static HashMap<String, ArrayList<String>> createDishesWithIngredientHashMap(String[][] dishes) {
        HashMap<String, ArrayList<String>> dishesWithIngredient = new HashMap<>();

        for(String[] dish: dishes){
            for(int j=1; j < dish.length;j++){
                String dishName = dish[0];
                if(!dishesWithIngredient.containsKey(dish[j])){
                    ArrayList<String> dishNames = new ArrayList();
                    dishNames.add(dishName);
                    dishesWithIngredient.put(dish[j],dishNames);
                }else{
                    ArrayList<String> dishNames = dishesWithIngredient.get(dish[j]);
                    dishNames.add(dishName);
                    dishesWithIngredient.put(dish[j],dishNames);
                }

            }
        }
        return dishesWithIngredient;
    }

    public static TreeMap<String,ArrayList<String>> orderLexicographically(HashMap<String, ArrayList<String>> map){
        return new TreeMap<String,ArrayList<String>>(map);
    }

    public static void removeDishesWithoutIngredients(HashMap<String, ArrayList<String>> map){
        map.entrySet().removeIf(e -> ((ArrayList<String>)e.getValue()).size() < 2);
    }
}

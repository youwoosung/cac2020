package dishes;

public class DishTest {

	public static void main(String[] args) {
		
		System.out.println("//to be completed");
		
		String[] keywords = { "Eggs", "Cheese", "Garlic" };
		
		Dish alfredo = new Dish("Alfredo", 
				0, 
				"https://www.modernhoney.com/fettuccine-alfredo/",
				new String[]{ "Pasta noodles", "Butter", "Heavy Cream", "Garlic", "Parmesan Cheese", "Black Pepper" });
		Dish spaghetti = new Dish("Spaghetti", 
				0, 
				"https://www.foodnetwork.com/recipes/food-network-kitchen/simple-spaghetti-with-tomato-sauce-3362665",
				new String[]{ "Pasta noodles", "Tomatoes", "Tomato sauce", "Cheese", "Garlic", "Basil", "Onion", "Ground Beef", "Black pepper", "Olive oil", "Salt" });
		
		Dish friedRice = new Dish("Fried Rice", 
				0, 
				"https://www.allrecipes.com/recipe/79543/fried-rice-restaurant-style",
				new String[]{ "Eggs", "Garlic", "Rice", "Scallion", "Onion", "Carrot", "Soy sauce", "Peas", "Sesame oil", "Vegetable Oil"  });
		
		Dish grilledCheeseSandwich = new Dish("Grilled Cheese Sandwich", 
				0, 
				"https://www.allrecipes.com/recipe/23891/grilled-cheese-sandwich/",
				new String[]{ "Cheese", "Bread", "Butter" });
		
		Dish omelette = new Dish("Omelette", 
				0, 
				"https://www.delish.com/cooking/recipe-ideas/a24892843/how-to-make-omelet/",
				new String[]{ "Cheese", "Butter", "Black Pepper", "Ham", "Milk",
						"Eggs", "Salt" });
		
		//Dish[] arrayOfDishes = { alfredo, spaghetti, friedRice, grilledCheeseSandwich, omelette };
		Dish[] arrayOfDishes = new Dish[5];
		arrayOfDishes[0] = alfredo;
		arrayOfDishes[1] = spaghetti;
		arrayOfDishes[2] = friedRice;
		arrayOfDishes[3] = grilledCheeseSandwich;
		arrayOfDishes[4] = omelette;
		
		for (int i = 0; i < arrayOfDishes.length - 1; i++) {
			arrayOfDishes[i].caculatePercentage(keywords);
		}
		
		sort(arrayOfDishes);
		
		for (int i = 0; i < arrayOfDishes.length - 1; i++) {
			arrayOfDishes[i].displayNameAndPercentage();
		}
		
	}
	
	private static void sort(Dish[] arrayOfDishes) {
		//to be completed
	}
}

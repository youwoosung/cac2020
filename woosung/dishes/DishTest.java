public class DishTest {

	public static void main(String[] args) {
		String[] keywords = { "Eggs", "Cheese", "Garlic" };
		
		Dish alfredo = new Dish("Alfredo", 
				0, 
				"https://www.modernhoney.com/fettuccine-alfredo/",
				new String[]{ "Pasta noodles", "Butter",
			           "Heavy Cream", "Garlic", "Parmesan Cheese", "Black Pepper" });
		alfredo.caculatePercentage(keywords);
		alfredo.displayAllInfo();
		
		Dish spaghetti = new Dish("Spaghetti", 
				0, 
				"https://www.foodnetwork.com/recipes/food-network-kitchen/simple-spaghetti-with-tomato-sauce-3362665",
				new String[]{ "Pasta noodles", "Tomatoes", "Tomato sauce", "Cheese", "Garlic", "Basil", "Onion", "Ground Beef", "Black pepper", "Olive oil", "Salt" });
		spaghetti.caculatePercentage(keywords);
		spaghetti.displayAllInfo();
	}
}

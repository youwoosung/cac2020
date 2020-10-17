public class SortTest2 {

	public static void main(String[] args) {
		String[][] dishes = {
			{ "Alfredo", "",
				"https://www.modernhoney.com/fettuccine-alfredo/",
				"Pasta noodles", "Butter", "Heavy Cream", "Garlic",
				"Parmesan Cheese", "Black Pepper" },
		{
				"Spaghetti",
				"",
				"https://www.foodnetwork.com/recipes/food-network-kitchen/simple-spaghetti-with-tomato-sauce-3362665",
				"Pasta noodles", "Tomatoes", "Tomato sauce", "Cheese",
				"Garlic", "Basil", "Onion", "Ground Beef",
				"Black pepper", "Olive oil", "Salt" },
		{
				"Fried Rice",
				"",
				"https://www.allrecipes.com/recipe/79543/fried-rice-restaurant-style/",
				"Eggs", "Garlic", "Rice", "Scallion", "Onion",
				"Carrot", "Soy sauce", "Peas", "Sesame oil",
				"Vegetable Oil" },
		{
				"Grilled Cheese Sandwich",
				"",
				"https://www.allrecipes.com/recipe/23891/grilled-cheese-sandwich/",
				"Cheese", "Bread", "Butter" },
		{
				"Omelette",
				"",
				"https://www.delish.com/cooking/recipe-ideas/a24892843/how-to-make-omelet/",
				"Cheese", "Butter", "Black Pepper", "Ham", "Milk",
				"Eggs", "Salt" },
		{
				"Meatloaf",
				"",
				"https://www.thewholesomedish.com/the-best-classic-meatloaf/",
				"Ground Beef", "Eggs", "Bread Crumbs", "Onion",
				"Ketchup", "Brown Sugar", "Milk", "Mustard", "Salt",
				"Pepper", "Parsley", "Garlic", "Red Wine Vinegar",
				"Black pepper" },
		{
				"Macaroni and Cheese",
				"",
				"https://www.allrecipes.com/recipe/11679/homemade-mac-and-cheese/",
				"Cheese", "Macaroni Pasta", "Milk", "Butter",
				"Bread Crumbs", "All-purpose flour", "Paprika"}
				};
		
		String[] keywords = {"Eggs", "Cheese", "Garlic"};
		
		for (int i = 0; i < dishes.length; i++) {
			int per = percentage(dishes[i], keywords);
			dishes[i][1] = String.valueOf(per);
		}
		
		bubbleSortStringArray(dishes);
		
		System.out.println("after sorting !!!!!!!!!!!!!!!!");
		
		printStringArray(dishes);
		
		
	}

	private static void printStringArray(String[][] twoDeArray) {
		// code to come
	}
	
	private static int percentage(String[] dish, String[] keywords) {
		// code to come
	}

	private static void bubbleSortStringArray(String[][] twoDeArray) {
		// code to come
	}
}

public class ArrayTest {
	public static void main(String[] args) {

		// ingredients
		String[] spaghetti = {"Spaghetti", "Pasta noodles", "Tomatoes", "Tomato sauce", "Cheese", "Garlic", "Basil", "Onion", "Ground beef", "Black pepper", "Olive oil"};
		String[] alfredo = {"Alfredo", "Pasta noodles", "Butter", "Heavy cream", "Garlic", "Parmesan cheese"};
		String[] friedRice = {"Fried Rice", "Egg", "Garlic", "Rice", "Scallion", "Onion", "Carrot", "Soy sauce", "Peas", "Sesame oil"};
		String[] cheeseSandwich = {"Cheese Sandwich", "Cheese", "Bread", "Butter"};
		String[] omelette = {"Omelette", "Egg", "Cheese", "Butter", "Onion", "Black pepper", "Ham", "Milk"};

		String[][] dishes = new String[2][10];
		dishes[0] = spaghetti;
		dishes[1] = alfredo;
		
		for (int i = 0; i < dishes.length; i++) {
			for (int a = 0; a < dishes[i].length; a++) {
				System.out.print(dishes[i][a] + ",");
			}
			System.out.println("");
		}
		
		String[] keywords = {"Pasta noodles", "Garlic", "Basil", "Butter", "Tomatoes"};
		
		caculatePercentage(spaghetti, keywords);
	}
	
	private static float caculatePercentage(String[] dish, String[] keywords) {
		int count = 0;
		float percentage = 0;
		
		for (int i = 0; i < dish.length; i++) {
			for (int a = 0; a < keywords.length; a++) {
				if (dish[i].equals(keywords[a])) {
					count = count + 1;
				}
			}
		}
		
		percentage = ((float)count/(float)dish.length)*100;
		
		System.out.println(count + ", " + percentage);
		
		return percentage;
	}
}

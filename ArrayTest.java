public class ArrayTest {
	public static void main(String[] args) {

		// ingredients
		String[] spaghetti = { "Spaghetti", "Pasta noodles", "Tomatoes", "Tomato sauce", "Cheese", "Garlic", "Basil",
				"Onion", "Ground beef", "Black pepper", "Olive oil" };

		String[] alfredo = { "Alfredo", "Pasta noodles", "Butter", "Heavy cream", "Garlic", "Parmesan cheese" };

		String[] friedrice = { "Fried Rice", "Egg", "Garlic", "Rice", "Scallion", "Onion", "Carrot", "Soy sauce",
				"Peas", "Sesame oil" };

		String[] cheesesandwich = { "Cheese Sandwich", "Cheese", "Bread", "Butter" };

		String[] omelette = { "Omelette", "Cheese", "Butter", "Onion", "Black Pepper", "Ham", "Milk" };

		String[][] dishes = new String[5][10];
		dishes[0] = spaghetti;
		dishes[1] = alfredo;
		dishes[2] = friedrice;
		dishes[3] = cheesesandwich;
		dishes[4] = omelette;

		printArray(spaghetti);
		printArray(alfredo);
		printArray(friedrice);
		printArray(cheesesandwich);
		printArray(omelette);

		String[] keywords = { "Pasta noodles", "Garlic", "Basil", "Butter", "Tomatoes" };

		float percentage = caculatePercentage(spaghetti, keywords);
		percentage = caculatePercentage(alfredo, keywords);
		percentage = caculatePercentage(friedrice, keywords);
		percentage = caculatePercentage(cheesesandwich, keywords);
		percentage = caculatePercentage(omelette, keywords);
	}

	private static float caculatePercentage(String[] dishes, String[] keywords) {
		int count = 0;
		float percentage = 0;

		for (int i = 0; i < dishes.length; i++) {
			for (int a = 0; a < keywords.length; a++) {
				if (dishes[i].equals(keywords[a])) {
					count = count + 1;
				}
			}
		}

		percentage = ((float) count / ((float) dishes.length - 1)) * 100;

		System.out.println(dishes[0] + ": " + percentage + "%");

		return percentage;
	}

	private static void printArray(String[] dishes) {
		System.out.print(dishes[0] + ": ");
		for (int i = 1; i < dishes.length; i++) {
			System.out.print(dishes[i] + ",");
		}

		System.out.println("");
	}

}

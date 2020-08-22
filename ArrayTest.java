public class ArrayTest {
	public static void main(String[] args) {

		// ingredients
		String[] spaghetti = { "Spaghetti", "", "Pasta noodles", "Tomatoes", "Tomato sauce", "Cheese", "Garlic", "Basil",
				"Onion", "Ground beef", "Black pepper", "Olive oil" };

		String[] alfredo = { "Alfredo", "", "Pasta noodles", "Butter", "Heavy cream", "Garlic", "Parmesan cheese" };

		String[] friedrice = { "Fried Rice", "", "Egg", "Garlic", "Rice", "Scallion", "Onion", "Carrot", "Soy sauce",
				"Peas", "Sesame oil" };

		String[] cheesesandwich = { "Cheese Sandwich", "", "Cheese", "Bread", "Butter" };

		String[] omelette = { "Omelette", "", "Cheese", "Butter", "Onion", "Black Pepper", "Ham", "Milk" };

		String[][] dishes = new String[5][10];
		dishes[0] = spaghetti;
		dishes[1] = alfredo;
		dishes[2] = friedrice;
		dishes[3] = cheesesandwich;
		dishes[4] = omelette;

		
		String[] keywords = { "Pasta noodles", "Garlic", "Basil", "Butter", "Tomatoes" };
		
		for (int i = 0; i < dishes.length; i++) {
			float percentage = caculatePercentage(dishes[i], keywords);
			dishes[i][1] = String.valueOf(percentage);
		}
		
		for (int i = 0; i < dishes.length; i++) {
			printArray(dishes[i]);
		}
		
		bubbleSort(dishes);
		
		for (int i = 0; i < dishes.length; i++) {
			printArray(dishes[i]);
		}
	}
	

	private static float caculatePercentage(String[] dishes, String[] keywords) {
		int count = 0;
		float percentage = 0;

		for (int i = 2; i < dishes.length; i++) {
			for (int a = 0; a < keywords.length; a++) {
				if (dishes[i].equals(keywords[a])) {
					count = count + 1;
				}
			}
		}

		percentage = ((float) count / ((float) dishes.length - 2)) * 100;

//		System.out.println(dishes[0] + ": " + percentage + "%" + " - " + dishes[1] + ", " + dishes[2] + ", " + dishes[3]);

		return percentage;
	}

//	private static void printArray(String[] dishes) {		
//		System.out.print(dishes[0] + ": ");
//		for (int i = 1; i < dishes.length; i++) {
//			System.out.print(dishes[i] + ",");
//		}
//
//		System.out.println("");
//	}


	private static void printArray(String[] dishes) {
		System.out.print(dishes[0] + ": ");
		System.out.print(dishes[1] + "%, ");
		for (int i = 2; i < dishes.length; i++) {
		System.out.print(dishes[i] + ", ");
		}

		System.out.println("");
	}
	
	private static void bubbleSort(String[][] dishes) {
		
	}
}

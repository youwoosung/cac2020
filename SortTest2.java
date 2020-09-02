public class SortTest2 {

	public static void main(String[] args) {
		String[] spaghetti = { "Spaghetti", "100.0" };
		String[] alfredo = { "Alfredo", "12.23" };
		String[] friedrice = { "Fried Rice", "50.0" };
		String[] cheesesandwich = { "Cheese Sandwich", "2.4" };
		String[] omelette = { "Omelette", "99.9" };

		String[][] dishes = new String[5][10];
		dishes[0] = spaghetti;
		dishes[1] = alfredo;
		dishes[2] = friedrice;
		dishes[3] = cheesesandwich;
		dishes[4] = omelette;

		printStringArray(dishes);

		bubbleSortStringArray(dishes);

		System.out.println("after sorting !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		printStringArray(dishes);

	}

	private static void printStringArray(String[][] twoDeArray) {
		for (int i = 0; i < twoDeArray.length; i++) {
			for (int j = 0; j < twoDeArray[i].length; j++) {
				System.out.print(twoDeArray[i][j] + ",    ");
			}
			System.out.println("");
		}
	}

	private static void bubbleSortStringArray(String[][] twoDeArray) {
		int leng = twoDeArray.length;
		for (int i = 0; i < leng - 1; i++) {
			for (int j = 0; j < leng - i - 1; j++) {
				float x = Float.parseFloat(twoDeArray[j][1]);
				float y = Float.parseFloat(twoDeArray[j+1][1]);
				if (x > y) {
					String[] temp = twoDeArray[j];
					twoDeArray[j] = twoDeArray[j+1];
					twoDeArray[j+1] = temp;
				}
			}
		}
	}

}

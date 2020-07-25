public class ArrayTest {
	public static void main(String[] args) {
			
		//ingredients
		String[] spaghetti = {"Pasta noodles", "Tomatoes", "Tomato sauce", 
				"Cheese", "Garlic", "Basil", 
				"Onion", "Ground beef", "Black pepper", "Olive oil"};
		
		String[] alfredo = {"Pasta noodles", "Butter", "Heavy cream", 
				"Garlic", "Parmesan cheese"};
		
		String[][] dishes = new String[2][10];
		dishes[0] = spaghetti;
		dishes[1] = alfredo;
		
		for (int i = 0; i < dishes.length; i++) {
			for (int a = 0; a < dishes[i].length; a++) {
				System.out.print(dishes[i][a] + ",");
			}
			System.out.println("");
		}
		
		
		
//		//what you have in refrigerator
//		String[] keywords = {"Pasta noodles", "Garlic", "Basil", "Butter", "Tomatoes"};
		
//		int count = 0;
//		float percentage = 0;
//		
//		for (int i = 0; i < spaghetti.length; i++) {
//			for (int a = 0; a < keywords.length; a++) {
//				if (spaghetti[i].equals(keywords[a])) {
//					count = count + 1;
//				}
//			}
//		}
//		
//		percentage = ((float)count/(float)spaghetti.length)*100;
//		
//		System.out.println(count + ", " + percentage);
//		
//		count = 0;
//		
//		for (int i = 0; i < alfredo.length; i++) {
//			for (int a = 0; a < keywords.length; a++) {
//				if (alfredo[i].equals(keywords[a])) {
//					count = count + 1;
//					percentage = (count/spaghetti.length)*100;
//				}
//			}
//		}
//		
//		percentage = ((float)count/(float)spaghetti.length)*100;
//		
//		System.out.println(count + ", " + percentage);

		
		
	}
}

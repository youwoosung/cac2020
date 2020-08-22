
public class SortTest {

	public static void main(String[] args) {
		float[] floatPercentages = {2.3f, 100f, 25.2f, 0.5f, 13.5f};
		printFloatArray(floatPercentages);
		bubbleSortFloatArray(floatPercentages);
		printFloatArray(floatPercentages);
				
		String[] strPercentages = {"2.3", "100.0", "25.2", "0.5", "13.5"};
		printStringArray(strPercentages);
		bubbleSortStringArray(strPercentages);
		printStringArray(strPercentages);
	}
	
	private static void printFloatArray(float[] percentages) {
		for (int i = 0; i < percentages.length; i++) {
			System.out.print(percentages[i] + ",    ");
		}

		System.out.println("");
	}
	
	private static void printStringArray(String[] percentages) {
		for (int i = 0; i < percentages.length; i++) {
			System.out.print(percentages[i] + ",    ");
		}

		System.out.println("");
	}
	
	private static void bubbleSortFloatArray(float[] percentages) {
		for (int i = 0; i < percentages.length-1; i++){
			for (int j = 0; j < percentages.length-i-1; j++) {
				if (percentages[j] > percentages[j+1]){ 
                    // swap percentages[j+1] and percentages[i] 
                    float temp = percentages[j]; 
                    percentages[j] = percentages[j+1]; 
                    percentages[j+1] = temp; 
                } 
			}
        }
	}
	
	private static void bubbleSortStringArray(String[] percentages) {
		for (int i = 0; i < percentages.length-1; i++){
			for (int j = 0; j < percentages.length-i-1; j++) {
				if (Float.parseFloat(percentages[j]) > Float.parseFloat(percentages[j+1])){ 
                    // swap percentages[j+1] and percentages[i] 
                    String temp = percentages[j]; 
                    percentages[j] = percentages[j+1]; 
                    percentages[j+1] = temp; 
                } 
			}
        }
	}

}

package teamscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medium4 {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);

			List<String> inputList = new ArrayList<>();
			String line;

			while (scanner.hasNext()) {
				line = scanner.nextLine();
				inputList.add(line);
			}

			scanner.close();
			
			int arraySize = Integer.parseInt(inputList.get(0));

			int verticalSum[] = new int[arraySize];
			
			int[][] matrix = new int[arraySize][arraySize];
			
			for (int i = 0; i < arraySize; i++) {
				String[] strSplit = inputList.get(i+1).split(" ");
				
				for(int j = 0; j < arraySize; j++) {
					matrix[i][j] = Integer.parseInt(strSplit[i]);
				}
			}
			
			
			int horizontalSum[] = new int[arraySize];
			
			for(int i=0; i<arraySize; i++) {
				int hSum = 0; 
				
				for(int j = 0; j < arraySize; j++) {
					hSum += matrix[i][j];
				}
				
				horizontalSum[i] = hSum;
			}
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

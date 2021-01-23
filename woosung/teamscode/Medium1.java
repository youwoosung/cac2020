package teamscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Medium1 {

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

			System.out.println("this is what we collected from user input");
			
			for(int i=0; i<inputList.size(); i++) {
				System.out.println(inputList.get(i));
			}
			
			String[] firstRow = inputList.get(0).split(" ");
			int row = Integer.parseInt(firstRow[0]);
			int col = Integer.parseInt(firstRow[1]);
			
			String[][] newArray = new String[row][col];
			
			for(int i=0; i<row; i++) {
				newArray[i] = inputList.get(i+1).split(" ");
			}
			
			System.out.println("this is 2d array");
			
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					System.out.print(newArray[j][i] + " ");
				}
				System.out.println("");
			}
			
		} catch (Exception e) {

		}
	}

}

package teamscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy2 {

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
			String[] inputArray = new String[inputList.size()];
			inputArray = inputList.toArray(inputArray);
			
			System.out.println(inputArray[0]);
			System.out.println(inputArray[1]);
			
			String[] strSplit = inputArray[1].split(" ");
			
			int sum = 0;
			for (int i = 0; i < strSplit.length; i++) {
				System.out.println(strSplit[i]);
				int intNum1 = Integer.parseInt(strSplit[i]);
				sum = sum + intNum1;
			}
			System.out.println(sum);

			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

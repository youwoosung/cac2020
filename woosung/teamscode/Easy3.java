package teamscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> inputList = new ArrayList<>();
		String line;
		while (scanner.hasNext()) {
			line = scanner.nextLine();
			inputList.add(line);
		}
		scanner.close();
		
		int total = 0;
		char firstCh = inputList.get(0).charAt(0);
		
		String strTarget = inputList.get(1);
		
		System.out.println(firstCh);
		for (int i = 0; i < strTarget.length(); i++) {
			if(firstCh == strTarget.charAt(i)) {
				total = total + 1;
			}
		}
		System.out.println(total);

	}

}

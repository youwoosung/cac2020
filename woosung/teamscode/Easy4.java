package teamscode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy4 {

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

			System.out.println(inputList.get(0));
			System.out.println(inputList.get(1));

			String[] strSplit = inputList.get(0).split(":");

			int addedNum = Integer.parseInt(inputList.get(1));
			int hours = Integer.parseInt(strSplit[0]);
			int minutes = Integer.parseInt(strSplit[1]);
			
			int newMinutes = minutes + addedNum;
			
			hours = hours + (newMinutes/60);
			minutes = newMinutes % 60;
			
			if (minutes < 10) {
				System.out.println(hours%24 + ":" + "0" + minutes);
			} else {
				System.out.println(hours%24 + ":" + minutes);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

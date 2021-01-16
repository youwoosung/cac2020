import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Easy5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> inputList = new ArrayList<>();
		String line;
		while (scanner.hasNext()) {
			line = scanner.nextLine();
			inputList.add(line);
		}
		scanner.close();

		String num1 = inputList.get(1);
		String num2 = inputList.get(2);
		String num3 = inputList.get(3);
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = num1.length() - 1; i >= 0; i = i - 2) {

			sum1 = sum1 + Character.getNumericValue(num1.charAt(i));

		}
		for (int i = num2.length() - 1; i >= 0; i = i - 2) {

			sum2 = sum2 + Character.getNumericValue(num2.charAt(i));

		}
		for (int i = num3.length() - 1; i >= 0; i = i - 2) {

			sum3 = sum3 + Character.getNumericValue(num3.charAt(i));

		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);

	}

}

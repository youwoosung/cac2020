import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamsCode {

	public static void main(String[] args) {
		try{
			Scanner scanner = new Scanner(System.in);

			System.out.printf("Please enter input:\n");        
			
			List<String> inputList = new ArrayList<>();
			String line;
			
			while (scanner.hasNext()) {
				line = scanner.nextLine();
				inputList.add(line);
			}
			
			scanner.close();
			
			String[] inputArray = new String[inputList.size()]; 
			inputArray = inputList.toArray(inputArray);
			
			
			for (int i = 0; i < inputArray.length; i++) {
			    System.out.println(inputArray[i]);
			}
			
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}

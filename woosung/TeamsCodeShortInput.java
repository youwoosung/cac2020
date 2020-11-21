import java.util.Scanner;

public class TeamsCodeShortInput {

	public static void main(String[] args) {
		try{
			Scanner scanner = new Scanner(System.in);

			System.out.printf("Please enter input:\n");    
			
			String strInput = scanner.nextLine();  
		    
			System.out.println("Input was: " + strInput); 
			
			
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}


public class Dish {
	String name;
	int percentage;
	String link;
	String[] ingredients;
	
	public Dish(String namePassedIn, 
			int percentagePassedIn, 
			String linkPassedIn, 
			String[] ingredientsPassedIn) {
		this.name = namePassedIn;
		this.percentage = percentagePassedIn;
		this.link = linkPassedIn;
		this.ingredients = ingredientsPassedIn;
	}

	public void displayAllInfo() {
    	//to be completed
  }
	
	public void caculatePercentage(String[] keywords) {
		  //to be completed
	}
}

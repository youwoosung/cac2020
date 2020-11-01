package dishes;

public class Dish {
	String name;
	float percentage;
	String link;
	String[] ingredients;

	public Dish(String namePassedIn, int percentagePassedIn, String linkPassedIn, String[] ingredientsPassedIn) {
		this.name = namePassedIn;
		this.percentage = percentagePassedIn;
		this.link = linkPassedIn;
		this.ingredients = ingredientsPassedIn;
	}

	public void displayAllInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Percentage: " + this.percentage);
		System.out.println("Link: " + this.link);
		System.out.print("Ingredients: ");
		for (int i = 1; i < ingredients.length; i++) {
			System.out.print(ingredients[i] + ", ");
		}

		System.out.println("");
		System.out.println("");
	}
	
	public void displayNameAndPercentage() {
		//to be completed
	}

	public void caculatePercentage(String[] keywords) {
		int count = 0;
		float percentage = 0;
		for (int i = 0; i < keywords.length; i++) {
			for (int a = 0; a < ingredients.length; a++) {
				if (keywords[i] == ingredients[a]) {
					count = count + 1;
				}
			}
		}

		percentage = ((float) count / ((float) ingredients.length)) * 100;
		this.percentage = (float) ((int) (percentage * 100)) / 100;
	}
}

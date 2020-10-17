package student;

public class ClassTest {
	public static void main(String[] arguments) {
		Student luke = new Student("Luke", 15, 10);
		luke.displayInfo();
		
		HighSchoolStudent emily = new HighSchoolStudent("Emily", 15, 10, "Cheer Leading");
		emily.displayInfo();
		emily.displayClub();
		
		GaHighSchoolStudent matthew = new GaHighSchoolStudent("Matthew", 15, 10, "Tennis", "Forsyth");
		matthew.displayAllInfo();
	}
	
	
}

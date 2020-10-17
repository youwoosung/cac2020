package student;

public class GaHighSchoolStudent extends HighSchoolStudent{
	String county;
    
    public GaHighSchoolStudent(String county) {
    	this.county = county;
	}
    
    public GaHighSchoolStudent(String namePassedIn, int agePassedIn, int gradePassedIn, String clubPassedIn, String countyPassedIn) {
    	this.name = namePassedIn;
		this.age = agePassedIn;
		this.grade = gradePassedIn;
		this.club = clubPassedIn;
    	this.county = countyPassedIn;
	}
    
    public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
	public void displayAllInfo() {
    	System.out.println("Name: " + this.name + ", Age: " + this.age + ", Grade: " + this.grade + ", Club name: " + this.club + ", County: " + this.county);
    }
}

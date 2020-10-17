package student;
public class HighSchoolStudent extends Student{
    String club;
    
    public HighSchoolStudent() {
    	this.club = club;
	}
    
    public HighSchoolStudent(String club) {
    	this.club = club;
	}
    
    public HighSchoolStudent(String namePassedIn, int agePassedIn, int gradePassedIn, String clubPassedIn) {
    	this.name = namePassedIn;
		this.age = agePassedIn;
		this.grade = gradePassedIn;
		this.club = clubPassedIn;
	}
    
    public String getClub() {
		return club;
	}

	public void setClub(String name) {
		this.club = club;
	}
    
    public void displayClub() {
    	System.out.println("Club: " + this.club);
    }
}

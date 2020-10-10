public class HighSchoolStudent extends Student{
    String club;
    
    public HighSchoolStudent() {
    	this.club = club;
	}
    
    public HighSchoolStudent(String club) {
    	this.club = club;
	}
    
    public HighSchoolStudent(String name, int age, int grade, String club) {
    	this.name = name;
		this.age = age;
		this.grade = grade;
		this.club = club;
	}
    
    public String getClub() {
		return club;
	}

	public void setClub(String name) {
		this.club = club;
	}
    
    public void displayClub() {
    	System.out.println("Club: " + this.club);
    	setName("blah... ");
    	System.out.println(name);
    }
}

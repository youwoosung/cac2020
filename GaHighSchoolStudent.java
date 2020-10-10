
public class GaHighSchoolStudent extends HighSchoolStudent{
	String county;
    
    public GaHighSchoolStudent(String county) {
    	this.county = county;
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

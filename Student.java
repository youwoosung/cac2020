class Student {
	String name;
	int age;
	int grade;

	public Student() {
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name, int age, int grade) {
		this(name, age);
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void incrementAge() {
		this.age++;
	}
	
	public void decrementAge() {
		this.age--;
	}
	
	public void incrementGrade() {
		this.grade++;
	}
	
	public void displayInfo() {
		System.out.println("Name: " + this.name + ", Age: " + this.age + ", Grade: " + this.grade);
	} 
	
	public void isGraduatedHighSchool() {
		if(this.grade > 12) {
			System.out.println(this.name + " graduated from high school.");
		}
		else {
			System.out.println(this.name + " has not graduated from high school yet.");
		}
	}
}

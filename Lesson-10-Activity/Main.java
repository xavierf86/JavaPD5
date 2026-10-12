
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("Enter your GPA:");
		double gpaValue = Input.readDouble();
		double answer1 = gpa(gpaValue);
		System.out.println(answer1);

		System.out.println("What is your grade level?");
		double grade = Input.readDouble();
		System.out.println("How much credits do you have?");
		double credits = Input.readDouble();
		boolean answer2 = isGraduating(grade, credits);

		if(answer2 == true)
			System.out.println("Student is Graduating");
		else
			System.out.println("Student is NOT Graduating");
		
		

  }

  double gpa(double gpa){
	if(gpa > 90)
		return gpa *1.1;
	else
		return gpa;
  }

  boolean isGraduating(double grade, double credits){
	if(credits >= 44 && grade == 12)
		return true;
	else
		return false;
  }

  String BMI(double weight, double pounds){
	
  }

  
}

class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
		System.out.println("Enter your GPA:");
		double gpaVal = Input.readDouble();
		double answer1 = gpa(gpaVal);
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
		
		System.out.println("Enter your weight in lbs:");
		double weight = Input.readDouble();
		System.out.println("Enter your height in inches:");
		double height = Input.readDouble();
		String answer3 = BMI(weight, height);
		System.out.println(answer3);

		System.out.println("Enter the package weight in lbs:");
		double lbs = Input.readDouble();
		double answer4 = shippingCost(lbs);
		System.out.println(answer4);

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

  String BMI(double weight, double height){
	double bmi = (weight * 703) / (height * height);
	if(bmi <= 18.4)
		return "Underweight";
	else if(bmi >= 18.5 && bmi <= 24.9)
		return "Normal";
	else if(bmi >= 25.0 && bmi <= 39.9)
    	return "Overweight";
	else
    	return "Obese";
  }

  double shippingCost(double lbs){
	if(lbs <= 10)
		return 0.00;
	else if(lbs > 10 && lbs <= 15)
		return 5.00
	else if( lbs > 15 && lbs <= 25)
		return 10.00;
	else
		 return 10.00 + (lbs - 25)* 0.02;
  }

  
}
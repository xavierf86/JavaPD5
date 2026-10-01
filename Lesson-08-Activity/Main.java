class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	print("Hello");
	
	double answer = Ftoc(50);
	System.out.println(answer);

	double answer2 = sphereVolume(15);
	System.out.println(answer2);

	double answer3 = coneVolume(5, 10);
	System.out.println(answer3);

	double answer4 = distance(5, 10, 15, 20);
	System.out.println(answer4);

	 }


	 void print(String text){
		System.out.println(text);
	}
		
	double Ftoc(double fahrenheit){
		return (fahrenheit - 32) * (5.0 / 9.0);
	}

	double sphereVolume(double radius){
		return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
	}

	double coneVolume(double radius, double height){
		return (1.0/3.0) * Math.PI * Math.pow(radius, 2) * height;
	}

	double distance(double x1, double y1, double x2, double y2){
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
  
 
}
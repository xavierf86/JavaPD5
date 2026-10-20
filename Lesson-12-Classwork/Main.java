class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println(collegeCredit("ABCDEM"));
  /*
   System.out.println("Enter course code");
   String course = Input.readString();
   System.out.println(collegeCredit(course));
   */
   
  }

  boolean collegeCredit(String course){
    String letter = course.substring(5,6);
    if(letter.equals("E") || letter.equals("M"))
      return true;
    else
      return false;
  }


}
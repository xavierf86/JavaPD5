class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String answer = spaces(4);
    System.out.println(answer + "DONE");
    
    
  }

  String spaces(int N){
    String build = "";
    for(int x = 0; x < N; x++){
      build += " "; 
    }
    return build;
  }

  double harmonic(int N){
    double sum = 0;
    for(int  x =1; x <= N; x++){
      sum = 1.0/x;
    }
    return sum;
  }

  double sine(int N, double ans){
    double sum = 0;
    int sin = 1;
    for(int x = 1; x < 2 * N; x+=2){
      sum += sign * Math.pow(ans,x)/(x);
      sin*=-1;
    }
    return sum;
  }


  
}
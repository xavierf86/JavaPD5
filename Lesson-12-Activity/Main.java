class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    System.out.println("Enter credit card number:");
    String num = Input.readString();
    String answer = creditCardType(num);
    System.out.println(answer);

    System.out.println("Enter a word:");
    String word = Input.readString();
    String answer2 = pigLatin(word);
    System.out.println(answer2);

    System.out.println("Enter your zip code:");
    String zip = Input.readString();
    String answer3 = nycLocate(zip);
    System.out.println(answer3);

  }

  String creditCardType(String num){
    if(num.substring(0,1).equals("4"))
      return "Visa";
    else if(num.substring(0,2).equals("34") || num.substring(0,2).equals("37"))
      return "American Express";
    else if(num.substring(0,2).equals("36"))
      return "Diner Club";
    else if(num.substring(0,2).equals("51") || num.substring(0,2).equals("55"))
      return "Mastercard";
    else if(num.substring(0,4).equals("6011") || num.substring(0,2).equals("65"))
      return "Discovery";
    else
      return "Unknown";
  }

  String pigLatin(String word){
    return word.substring(1) + word.substring(0,1) + "ay";
  }

  String nycLocate(String zip){
    String pre = zip.substring(0,3);

    if(pre.equals("100") || pre.equals("101") || pre.equals("102"))
      return "Manhattan";
    else if(pre.equals("103"))
      return "Staten Island";
    else if(pre.equals("104"))
      return "Bronx";
    else if(pre.equals("112"))
      return "Brooklyn";
    else if(pre.equals("113") || pre.equals("114") || pre.equals("111"))
      return "Queens";
    else
      return "Unknown";
  }

}

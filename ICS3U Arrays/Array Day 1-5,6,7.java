class Main {
  public static void main(String[] args) {
  String[] planet = {"Mercury", "Venus", "Earth","Mars"};
  //for loop
  for(int i=0;i<planet.length;i++){
    System.out.println(planet[i]);
    //for the begining of each planet print first letter
    char letter = planet[i].charAt(0);
    System.out.println(letter);   
    }

  }
}

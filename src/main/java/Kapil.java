public class Kapil{
  public static void main(String args[]){
    int i=10;
      System.out.println("Hello from local");
    int j=30;
    System.out.println(j);
    remote();
       j=20;
      System.out.println(j);
      local();
  }

  static void local(){
    System.out.println("Locaalllll");
  }

  static void remote(){
     System.out.println("Remoteeeee");

  }
}

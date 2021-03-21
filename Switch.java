public class Switch{
  public static void main(String[] args) {
    int sVal  = 10;
    switch(sVal % 2){
      case 0:
        System.out.print(sVal);
      System.out.println("is even");
      break;

      case 1:
      System.out.print(sVal);
      System.out.println("it is odd");
      break;
      

      default:
        System.out.println("oops it broke");
    }
  }
}

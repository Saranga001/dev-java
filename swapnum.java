public class swapnum {
  public static void main(String args[]){
    
    int a = 90; //decalring the variables
    int b = 45;
    
    System.out.println("Before swapping values: a = " +a + " and b = " +b);

    int swap = a; //logic to swap values
    a = b;
    b = swap;

    System.out.println("After swapping values: a = " +a + " and b = " +b);
  
  }
}

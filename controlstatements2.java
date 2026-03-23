import java.util.*;
public class controlstatements2 {
  public static void main (String[] args){
    Scanner scnum = new Scanner(System.in);

    System.out.print("Enter a number to check if it is even or odd:");
    int num = scnum.nextInt();
    scnum.close();

    if (num % 2 == 0){
      System.out.println("The number is even.");
    }
    else{
      System.out.println("The number is odd.");
    }
  }  
}

import java.util.*;

public class controlstatements {

    public static void main(String[] args){

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number to check if the number is positive or negative: ");
      int num = sc.nextInt();
      sc.close();

      if (num > 0) {
        System.out.println("The number is positive.");

      }
      else if (num < 0){
        System.out.println("The number is negative.");
      }
      else if (num == 0){
        System.out.println("The number is zero.");
      }
    }
}
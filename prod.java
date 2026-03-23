import java.util.Scanner;

public class prod {
  
  public static void main(String args[]){
    
    Scanner number = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = number.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = number.nextInt();
    number.close();

    int result = num1 * num2;

    System.out.print("The result is: " +result);

  }
}
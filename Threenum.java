import java.util.*;

public class Threenum {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter three numbers to compare which one is greater: ");

    System.out.print("Enter the first number: ");
    int num1 = scan.nextInt();
    
    System.out.print("Enter the second number: ");
    int num2 = scan.nextInt();
    
    System.out.print("Enter the third number: ");
    int num3 = scan.nextInt();
    
   scan.close();
    if (num1 > num2) {
      System.out.println("The greater number from(" +" num1 "+"num2 "+"num3) is: " + num1);
    
        } else if(num1<num3){
      System.out.println("The greater number from(num 1+num2+num3) is: " + num3);
          
        }if (num2>num3){

      System.out.println("The greater number from(num 1+num2+num3) is: " + num2);

        }else if (true) {
      System.out.println("The greater number from(num 1+num2+num3) is: " + num3);

            
        }

        }
      }
    
      
  
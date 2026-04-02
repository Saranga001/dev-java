import java.util.*;

class star{
  public static void main(String[] args) {
    int i,j;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter any odd number to print star pattern: ");
    int num = sc.nextInt();

    sc.close();

    if (num%2==0){
      System.out.print("The number entered is even. Please enter the odd number.");
    }
    else {
      System.out.println("The number enetered is odd.");
    }

    for (i = 1; i <= num; i += 2) {
    // print leading spaces to center the stars
      for (j = i; j < num; j += 2) {
        System.out.print(" ");
      }
      // print stars
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

// Lower half (mirror of upper, excluding middle row)
    for (i = num - 2; i >= 1; i -= 2) {
    // print leading spaces
      for (j = i; j < num; j += 2) {
        System.out.print(" ");
      }
      // print stars
      for (j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
  }
}
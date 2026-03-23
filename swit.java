import java.util.Scanner;

public class swit {

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Today is _______.  ");
    int day = sc.nextInt();
    sc.close();

    switch (day){
      case 1: 
        System.out.print("Today is Monday.");
        break;
      case 2: 
        System.out.print("Today is Tuesday.");
        break;
      case 3: 
        System.out.print("Today is Wednesday.");
        break;
      case 4: 
        System.out.print("Today is Thursday.");
        break;
      case 5: 
        System.out.print("Today is Friday.");
        break;
      case 6: 
        System.out.print("Today is Saturday.");
        break;
      case 7: 
        System.out.print("Today is Sunday."); 
        break;
      default:
        System.out.print("Invalid day.");
    }
  }
}

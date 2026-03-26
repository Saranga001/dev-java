import java.util.*;

class car {                   // This is a car class
   String name;               // Has attributes names and year
   int year;

   public void honk(){        //function inside car class
       System.out.println( this.name +"beep..beep");
   }
}
  

public class opps {
   public static void main(String args[]){
      
      car c1 = new car();
      c1.name = "Porche";
      c1.year = 2026;

      System.out.println("Car name:" +c1.name);
      System.out.println("Car year:" +c1.year);

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter your car name:");
      
      car c2 = new car();
      c2.name = sc.next();

      System.out.print("Enter your car year:");
      c2.year = sc.nextInt();

      sc.close();

      System.out.println("Car name:" +c2.name);
      System.out.println("Car year:" +c2.year);

      c1.honk();
      c2.honk();

   }
}

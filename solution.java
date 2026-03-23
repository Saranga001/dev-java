import java.util.Scanner;

public class solution{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Waiting for a string and an number:\t");
        
        String scan1 = scan.next();
        int scan2 = scan.nextInt();
        scan.close();
        
        System.out.println("myString is: " +scan1);
        System.out.println("myInt is:" +scan2);
    }
}
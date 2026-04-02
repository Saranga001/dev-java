import java.util.*;

class Student{
  String name;
  int roll;
  int marks;

  public void reportcard(){
    System.out.println("Roll: " + this.roll + "Name: " + this.name + "Mark: " + this.marks);
  }
}
public class oops3 {
  public static void main(String[] args) {
      
    Student s1 =  new Student();
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the student's name: ");
    s1.name = sc.next();

    System.out.println("Enter the student's roll number: ");
    s1.roll = sc.nextInt();

    System.out.println("Enter the marks obtained by the student: ");
    s1.marks = sc.nextInt();
    
    s1.reportcard();
  }
}
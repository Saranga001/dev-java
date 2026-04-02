class Student{
  String name;
  int roll;
  int marks;

  public void reportcard(){
    System.out.println("Roll: " + this.roll + "Name: " + this.name + "Marks: " + this.marks);
  }
}
public class oops2 {
  public static void main(String[] args) {
      
    Student s1 =  new Student();
    s1.name = "Saranga";
    s1.roll = 19;
    s1.marks = 74;

    s1.reportcard();
  }
}
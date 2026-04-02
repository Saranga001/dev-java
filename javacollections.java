import java.util.ArrayList;

public class javacollections {
   
  public static void main(String[] args) {
      ArrayList<String> patients = new ArrayList<>();

      patients.add("Ravi");
      patients.add("Priya");
      patients.add("Cherry");

      System.out.println(patients.get(0));
      System.out.println(patients.get(1));
      System.out.println(patients.get(2));

      patients.remove("Ravi");

      System.out.println(patients);  
    }

}

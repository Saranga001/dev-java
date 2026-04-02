import java.util.ArrayList;
import java.util.Collections;

class javacollectionsthree {
  public static void main(String Args[]){
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Mango");
    fruits.add("Bananna");
    fruits.add("Apple");

    System.out.println("Fruits: " +fruits);

    Collections.sort(fruits);

    System.out.println("Fruits: " +fruits);

    Collections.sort(fruits,Collections.reverseOrder());

    System.out.println(fruits);

  }
}
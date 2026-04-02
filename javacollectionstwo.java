import java.util.ArrayList;
import java.util.Collections;

public class javacollectionstwo {
  public static void main(String args[]){
    ArrayList<Integer> claims = new ArrayList<>();
    
    claims.add(1500);
    claims.add(1000);
    claims.add(7500);
    claims.add(4200);
    claims.add(2600);

    System.out.println(claims);

    Collections.sort(claims);

    System.out.println(claims);

    Collections.sort(claims, Collections.reverseOrder());
    
    System.out.println(claims);
    

  }  
}

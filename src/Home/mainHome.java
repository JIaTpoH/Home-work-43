package Home;

import java.util.ArrayList;
import java.util.List;

public class mainHome {
  public static void main(String... args) {
    List<Home> houses = new ArrayList<Home>();
    privateHome1 = new privateHome("Thomass-Mann-str. 2");
    privateHome2 = new privateHome("Heussenstamstr. 1");
    apartmentHome3 = new apartmentHome("Danziger Platz 12",2);

    houses.add(home1);
    houses.add(home2);
    houses.add(home3);

    for (Home house : houses) {
      System.out.println(house);
    }
  }
}

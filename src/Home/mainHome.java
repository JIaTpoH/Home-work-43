package Home;


import java.util.ArrayList;
import java.util.List;

public class mainHome {
  public static void main(String[] args) {
    List<Home> houses = new ArrayList<>();
    privateHome house1 = new privateHome("Thomas-Mann-str. 2");
    privateHome house2 = new privateHome("Heussenstamstr. 1");
    apartmentHome house3 = new apartmentHome("Danziger Platz 12 ", 2);

    houses.add(house1);
    houses.add(house2);
    houses.add(house3);


    house1.demolish();
    house3.demolish();
    System.out.println();


    for (Home house : houses) {
      System.out.println(house);
    }
  }
}

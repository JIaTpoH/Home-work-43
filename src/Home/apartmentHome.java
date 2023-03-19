package Home;

public class apartmentHome extends Home {
  private int entrance;
  public apartmentHome(String address, int entrance ) {
    super(address);
    this.entrance = entrance;
  }

  public int getEntrance() {
    return entrance;
  }

  public void setEntrance(int entrance) {
    this.entrance = entrance;
  }
  @Override
  public String toString() {
    return "Apartment house at " + getAddress() + "with " + entrance + " entrances";
  }
}

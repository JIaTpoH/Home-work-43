package Home;

public class apartmentHome extends Home {
  private final int entrance;
  public apartmentHome(String address, int entrance ) {
    super(address);
    this.entrance = entrance;
  }
  @Override
  public String toString() {
    return "Apartment house at " + getAddress() + "with " + entrance + " entrances";
  }
  @Override
  public void demolish(){
    System.out.printf("You demolished an apartment building. %d entrances!", entrance);
  }
}

package Home;

public class privateHome extends Home {
  public privateHome(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return "Private house at " + getAddress();
  }
  @Override
  public void demolish(){
    System.out.println("You demolished a private House ");
  }
}
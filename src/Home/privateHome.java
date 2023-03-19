package Home;

public class privateHome extends Home {
  public privateHome(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return "Private house at " + getAddress();
  }
}
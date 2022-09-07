public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;

  public Television() {
    instanceCount++;
  }

  public Television(String brand) {
    this();
   setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + " television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {


    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
    switch (brand) {
      case ("Samsung"):
        break;
      case ("LG"):
        break;
      case ("Sony"):
        break;
      case ("Toshiba"):
        break;
      default:
        System.out.println("The television brand is not valid.");
    }

  }

  public int getVolume() {
    return volume;
  }

  public void setVolume(int volume) {
    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "Television: Brand = " + getBrand() + ", " + "Volume = " + getVolume();
  }


}


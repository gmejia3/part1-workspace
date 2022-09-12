package com.entertainment;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;

  private String brand;
  private int volume;
  private int oldVolume;
  private DisplayType display = DisplayType.LED;

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

  public Television(String brand, int volume, DisplayType display) {
    this(brand, volume);
    setDisplay(display);
  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The " + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The " + brand + " television is off.");
  }

  public void muting(){
    oldVolume = volume;
    volume = MIN_VOLUME;
    System.out.println("Your TV is now muted.");
  }

  public void unmuting() {
    volume = oldVolume;
    System.out.printf("Your TV was returned to %d Volume. %n", volume);
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

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  public String toString() {
    return "com.entertainment.Television: Brand = " + getBrand() + ", " + "Volume = " + getVolume() + ", " + "Display =";
    // TODO: 9/8/2022 Need to set this field up. 
  }

}


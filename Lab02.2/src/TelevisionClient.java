public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.brand = "Vizio";
    tv1.volume = 58;

    Television tv2 = new Television();
    tv2.brand = "Apple";
    tv2.volume = 654;

    tv1.turnOn();
    tv1.turnOff();

    tv2.turnOn();
    tv2.turnOff();
  }
}

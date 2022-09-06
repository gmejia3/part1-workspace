public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("Vizio");
    tv1.setVolume(125);

    //tv1.turnOn();
    //tv1.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Apple", 45);
    //tv2.setBrand("Apple");
    //tv2.setVolume(654);

    tv2.turnOn();
    tv2.turnOff();
    System.out.println(tv2);
    //System.out.println(tv1.toString());
    //System.out.println(tv1);

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv3 = new Television("LG");
    tv3.turnOn();
    tv3.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

 }
}

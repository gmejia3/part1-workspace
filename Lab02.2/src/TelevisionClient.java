public class TelevisionClient {

  public static void main(String[] args) {
    Television tv1 = new Television();
    tv1.setBrand("LG");
    tv1.setVolume(98);


    tv1.muting();
    tv1.turnOn();
    tv1.unmuting();

    //tv1.turnOff();

    //System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television("Sony", 45);
    //tv2.setBrand("Apple");
    //tv2.setVolume(654);
    tv2.muting();
    tv2.turnOn();
    tv2.unmuting();
    //tv2.turnOff();
   // System.out.println(tv2);
    //System.out.println(tv1.toString());
    //System.out.println(tv1);

    //System.out.printf("%d television instances created%n", Television.getInstanceCount());

    //Television tv3 = new Television("LG");
   // tv3.turnOn();
   // tv3.turnOff();

    //System.out.printf("%d television instances created%n", Television.getInstanceCount());
    //Television tv5 = new Television("Sony", 40);
    //System.out.println(tv5);
    tv1.setDisplay(DisplayType.CRT);
    //DisplayType.CRT.equals(DisplayType.OLED);

 }
}

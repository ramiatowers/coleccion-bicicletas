public class Main {
    public static void main(String[] args) {

        Bicycle myBike1 = new Bicycle("Peugeot","M02", 45.5, true);
        System.out.println(myBike1);

        Bicycle myBike2 = new Bicycle("Decathlon", "MTB", 36.7, false);
        System.out.println(myBike2);

        Bicycle myBike3 = new Bicycle();
        myBike3.setBrand("Canyon");
        myBike3.setModel("Grail CFR AXS");
        myBike3.setMaxSpeed(68.5);
        myBike3.setGears(true);
        System.out.println(myBike3);

        System.out.println(myBike1.pedal());
        System.out.println(myBike3.left());
        System.out.println(myBike1.right());
        System.out.println(myBike2.ring());
    }
}
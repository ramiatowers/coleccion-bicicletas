import java.util.ArrayList;
import java.util.Scanner;

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

        ArrayList<Bicycle> bikes = new ArrayList<>();
        bikes.add(myBike1);
        bikes.add(myBike2);
        bikes.add(myBike3);

        for (Bicycle i : bikes) {
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to add a new bicycle? (yes/no)");
        String response = sc.nextLine();

        if (response.equalsIgnoreCase("yes")) {
            System.out.print("Enter brand: ");
            String brand = sc.nextLine();

            System.out.print("Enter model: ");
            String model = sc.nextLine();

            double maxSpeed = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.print("Enter max speed (use . or ,): ");
                String input = sc.nextLine().replace(",", ".");

                try {
                    maxSpeed = Double.parseDouble(input);
                    validInput = true;
                } catch (NumberFormatException e) {
                    System.out.println("⚠️ Invalid number. Please enter a valid speed using numbers only.");
                }
            }

            System.out.print("Does it have gears? (true/false): ");
            boolean gears = sc.nextBoolean();
            sc.nextLine();

            Bicycle userBike = new Bicycle(brand, model, maxSpeed, gears);
            bikes.add(userBike);
            System.out.println("Your bicycle was added!");
            System.out.println(userBike);
        }

        for (Bicycle i : bikes) {
            System.out.println("-------------");
            System.out.println("Brand: " + i.getBrand());
            System.out.println("Model: " + i.getModel());
            System.out.println("Max Speed: " + i.getMaxSpeed());
            String gearsText = i.isGears() ? "Includes gear shifter" : "Does not include gear shifter";
            System.out.println("Gears: " + gearsText);
            System.out.println("-------------");
        }

    }
}
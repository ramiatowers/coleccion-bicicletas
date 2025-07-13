public class Bicycle {
    // PROPERTIES
    private String brand;
    private String model;
    private double maxSpeed;
    private boolean gears;

    // CONSTRUCTORS
    public Bicycle(){
        //Empty constructor
    }

    public Bicycle(String brand, String model, double maxSpeed, boolean gears){
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.gears = gears;
    }

    // GETTER & SETTERS
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isGears() {
        return gears;
    }

    public void setGears(boolean gears) {
        this.gears = gears;
    }

    // TO STRING
    @Override
    public String toString(){
        return "Brand: " + brand + " Model: " + model + " Max Speed: " + maxSpeed + " km/h, Gears: " + gears;
    }

    // METHODS
    public String pedal() {
        return "The " + getBrand() + " bicycle is pedaling...";
    }

    public String ring() {
        return "The " + getBrand() + " bicycle ring is ringing";
    }

    public String left(){
        return "The " + getBrand() + " bicycle has turn left";
    }

    public String right(){
        return "The " + getBrand() + " bicycle has turn right";
    }
}

public abstract class Vehicle {

    private final String brand;
    private final String type;

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void speed(int speed) {
        System.out.println("This vehicle is going " + speed + "kph");
    }
    public void weight(float weight) {
        System.out.println("This vehicle weighs " + weight + "kg");
    }
    public void startEngine(){
        System.out.println("You turn on the engine");
    }
    public void turnOffEngine() {
        System.out.println("You turn off the engine");
    }

}

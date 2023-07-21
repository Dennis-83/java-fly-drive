public class Car extends Vehicle implements Driveable{

    private final String brand;
    private final String type;
    private int gear = 0;

    private String color;
    private final double engineDisplacement;

    public Car(String brand, String type, String color, double engineDisplacement) {
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.engineDisplacement = engineDisplacement;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getGear() {
        return gear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("You shift to gear " + gear);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", gear=" + gear +
                ", color='" + color + '\'' +
                ", engineDisplacement=" + engineDisplacement +
                '}';
    }
}

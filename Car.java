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


    @Override
    public void changeGear(int gear) {
        this.gear = gear;
    }
}

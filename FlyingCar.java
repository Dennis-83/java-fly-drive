public class FlyingCar extends Vehicle implements Driveable, Flyable{
    private int height = 0;
    private int gear = 0;

    private String color;

    public FlyingCar(String brand, String type, String color) {
        super(brand, type);
        this.color = color;
    }

    public int getHeight() {
        return height;
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

    @Override
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println("You shift to gear " + gear);
    }

    @Override
    public void changeHeight(int height) {
        this.height = height;
        System.out.println("You change height to " + height + "meters");

    }

    @Override
    public String toString() {
        return "FlyingCar{" +
                "brand='" + getBrand() + '\'' +
                ", type='" + getType() + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class Plane extends Vehicle implements Flyable{

    private final String airline;

    private final int numberOfEngines;
    private int height = 0;

    public Plane(String brand, String type, String airline, int numberOfEngines) {
        super(brand, type);
        this.airline = airline;
        this.numberOfEngines = numberOfEngines;
    }


    public String getAirline() {
        return airline;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public int getHeight() {
        return height;
    }



    @Override
    public void changeHeight(int height) {
        this.height = height;
        System.out.println("You change height to " + height + "meters");
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + getBrand() + '\'' +
                ", type='" + getType() + '\'' +
                "airline='" + airline + '\'' +
                ", numberOfEngines=" + numberOfEngines +
                ", height=" + height +
                '}';
    }
}

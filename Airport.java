import java.util.ArrayList;
import java.util.List;

public class Airport {
    List<Flyable> airport = new ArrayList<>();

    public Airport() {
        airport.add(new Plane("Lockheed Martin", "F-16", "RAF", 2));
        airport.add(new FlyingCar("Wayne Enterprises", "Batmobile", "black"));
    }

}

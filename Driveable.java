public interface Driveable {

    default void accelerate() {
        System.out.println("The vehicle accelerates");
    }
    default void brake() {
        System.out.println("The vehicle brakes");
    }
    void changeGear();
}

public interface Flyable {

    default void takeOff() {
        System.out.println("The vehicle takes off");
    }

    default void land() {
        System.out.println("The vehicle has landed");
    }

    void changeHeight();


}

public class Main {

    public static void main(String[] args) {

        Car golf = new Car("Volkswagen", "Golf", "blue", 1.6);

        System.out.println(golf);

        golf.startEngine();
        golf.changeGear(1);
        golf.accelerate();
        golf.speed(50);
        golf.brake();
        golf.speed(0);
        golf.turnOffEngine();
        golf.weight(1150);
    }
}

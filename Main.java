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

        System.out.println("------------------");
        Plane a380 = new Plane("Airbus", "A380", "KLM", 4);
        System.out.println(a380);

        a380.startEngine();
        a380.takeOff();
        a380.changeHeight(3000);
        a380.speed(500);
        a380.land();
        a380.changeHeight(0);
        a380.turnOffEngine();
        a380.weight(20000);

        System.out.println("------------------");
        FlyingCar delorean = new FlyingCar("Delorean", "DMC-12","silver" );
        System.out.println(delorean);
        delorean.startEngine();
        delorean.accelerate();
        delorean.speed(88);
        delorean.takeOff();
    }
}

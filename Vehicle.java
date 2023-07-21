public abstract class Vehicle {

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

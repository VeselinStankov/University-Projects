package AppleCar;

public class Car extends Exception {

    private static String color;
    private static double speed;

    public Car(String color, double speed) {

    }

    public static double getSpeed() {
        return speed;
    }

    public static void setSpeed(double speed) {
        Car.speed = speed;
    }

    public static void setColor(String color) {
        Car.color = color;
    }
    public static String getColor() {
        return color;
    }
}

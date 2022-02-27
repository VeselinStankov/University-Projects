package AppleCar;

public class Main {

    public static void checkColor(Car car){
        try{
            if (Car.getColor().equals("yellow")){
                throw new ColorExeption("The car can't be yellow");
            }
            else {
                System.out.println("Car color is not yellow");
            }
        }
        catch (ColorExeption e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {

        Car car = new Car ("red",300);
        checkColor(car);
    }
}

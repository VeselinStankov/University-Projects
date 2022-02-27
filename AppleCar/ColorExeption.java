package AppleCar;

public class ColorExeption extends Exception {

    public ColorExeption(String message) {
        this.message = message;
    }
    String message;

    public String getMessage(){
        return message;
    }
}

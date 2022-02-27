import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Square square =  new Square("square",5);
        Triangle triangle = new Triangle("triangle",6,7);
        ArrayList<Figure> figures = new ArrayList<>();
        figures.add(square);
        figures.add(triangle);

    }
}

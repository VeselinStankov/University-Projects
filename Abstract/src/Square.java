public class Square extends Figure {

    double a;

    public Square(String description,double a){
        super(description);
        this.a = a;
    }

    public double area() {
        double area = a * a;
        return area;
    }
}

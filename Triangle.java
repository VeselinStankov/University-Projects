public class Triangle extends Figure {

    double a;
    double b;

    public Triangle (String description,double a,double b){
        super(description);
        this.a = a;
        this.b = b;
    }

    public double area() {
        double area = a * b / 2;
        return area;
    }
}

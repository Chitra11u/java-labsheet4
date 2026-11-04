class Circle {
    double radius;
    static final double PI = 3.14;

    void calculateAndDisplay(double r) {
        double localRadius = r;
        this.radius = localRadius;
        double area = PI * this.radius * this.radius;
        double circumference = 2 * PI * this.radius;
        System.out.println("Radius: " + this.radius + ", Area: " + area + ", Circumference: " + circumference);
    }
}

public class Labsheet4Q3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateAndDisplay(7.0);
    }
}

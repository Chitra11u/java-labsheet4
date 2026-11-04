class Triangle {
    double a;
    double b;
    double c;
    static String type = "Scalene/Isosceles/Equilateral";

    void checkValidity(double side1, double side2, double side3) {
        double localA = side1;
        double localB = side2;
        double localC = side3;
        this.a = localA;
        this.b = localB;
        this.c = localC;
        if ((this.a + this.b > this.c) && (this.a + this.c > this.b) && (this.b + this.c > this.a)) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}

public class Labsheet4Q16 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.checkValidity(3.0, 4.0, 5.0);
    }
}

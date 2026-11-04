class Rectangle {
    double length;
    double breadth;
    static String shapeName = "Rectangle";

    void calculateAndDisplayArea(double l, double b) {
        double localLength = l;
        double localBreadth = b;
        this.length = localLength;
        this.breadth = localBreadth;
        double area = this.length * this.breadth;
        System.out.println("Shape: " + shapeName + ", Area: " + area);
    }
}

public class Labsheet4Q2 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.calculateAndDisplayArea(5.0, 4.0);
    }
}

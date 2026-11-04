class Car {
    String brand;
    double mileage;
    static int wheels = 4;

    void displayDetails(String b, double m) {
        String localBrand = b;
        double localMileage = m;
        this.brand = localBrand;
        this.mileage = localMileage;
        System.out.println("Brand: " + this.brand + ", Mileage: " + this.mileage + " mpg, Wheels: " + wheels);
    }
}

class Labsheet4Q6 {
    public static void main(String[] args) {
        Car car = new Car();
        car.displayDetails("Toyota", 35.5);
    }
}

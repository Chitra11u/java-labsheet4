class Product {
    int id;
    String name;
    double price;
    static double discountRate = 10.0;

    void calculateFinalPrice(int i, String n, double p) {
        int localId = i;
        String localName = n;
        double localPrice = p;
        this.id = localId;
        this.name = localName;
        this.price = localPrice;
        double finalPrice = this.price - (this.price * discountRate / 100.0);
        System.out.println("Product: " + this.name + ", Final Price: " + finalPrice);
    }
}

public class Labsheet4Q19 {
    public static void main(String[] args) {
        Product prod = new Product();
        prod.calculateFinalPrice(1, "Laptop", 1000.0);
    }
}

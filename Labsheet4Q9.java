class Laptop {
    String brand;
    int RAM;
    static String os = "Windows";

    void displayDetails(String b, int r) {
        String localBrand = b;
        int localRAM = r;
        this.brand = localBrand;
        this.RAM = localRAM;
        System.out.println("Brand: " + this.brand + ", RAM: " + this.RAM + "GB, OS: " + os);
    }
}

class Labsheet4Q9 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.displayDetails("Dell", 16);
    }
}

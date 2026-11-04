class ElectricBill {
    double units;
    static double fixedCharge = 50.0;

    void calculateBill(double u) {
        double localUnits = u;
        this.units = localUnits;
        double totalBill = fixedCharge + (this.units * 5.0);
        System.out.println("Units: " + this.units + ", Total Bill: " + totalBill);
    }
}

public class Labsheet4Q18 {
    public static void main(String[] args) {
        ElectricBill eb = new ElectricBill();
        eb.calculateBill(120.0);
    }
}

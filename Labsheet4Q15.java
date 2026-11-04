class SimpleInterest {
    double principal;
    double rate;
    double time;
    static String bank = "State Bank";

    void calculate(double p, double r, double t) {
        double localP = p;
        double localR = r;
        double localT = t;
        this.principal = localP;
        this.rate = localR;
        this.time = localT;
        double si = (this.principal * this.rate * this.time) / 100.0;
        System.out.println("Bank: " + bank + ", Simple Interest: " + si);
    }
}

public class Labsheet4Q15 {
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.calculate(1000.0, 5.0, 2.0);
    }
}

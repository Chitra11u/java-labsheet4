class Pen {
    String color;
    String type;
    static String manufacturer = "PILOT";

    void displayDetails(String c, String t) {
        String localColor = c;
        String localType = t;
        this.color = localColor;
        this.type = localType;
        System.out.println("Manufacturer: " + manufacturer + ", Color: " + this.color + ", Type: " + this.type);
    }
}

class Labsheet4Q8 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.displayDetails("Blue", "Gel");
    }
}

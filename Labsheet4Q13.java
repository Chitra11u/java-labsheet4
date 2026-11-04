class Temperature {
    double celsius;
    static String scale = "Celsius";

    void convert(double c) {
        double localCelsius = c;
        this.celsius = localCelsius;
        double fahrenheit = (this.celsius * 9.0 / 5.0) + 32;
        double kelvin = this.celsius + 273.15;
        System.out.println("Celsius: " + this.celsius + ", Fahrenheit: " + fahrenheit + ", Kelvin: " + kelvin);
    }
}

public class Labsheet4Q13 {
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.convert(25.0);
    }
}

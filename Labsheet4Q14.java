class Person {
    String name;
    int age;
    static String country = "India";

    void checkEligibility(String n, int a) {
        String localName = n;
        int localAge = a;
        this.name = localName;
        this.age = localAge;
        if (this.age >= 18) {
            System.out.println("Country: " + country + ", " + this.name + " is eligible to vote.");
        } else {
            System.out.println("Country: " + country + ", " + this.name + " is not eligible to vote.");
        }
    }
}

public class Labsheet4Q14 {
    public static void main(String[] args) {
        Person p = new Person();
        p.checkEligibility("John", 20);
    }
}

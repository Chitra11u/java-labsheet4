class Student {
    String name;
    int age;
    static int count = 0;

    void setAndDisplayDetails(String n, int a) {
        String localName = n;
        int localAge = a;
        this.name = localName;
        this.age = localAge;
        count++;
        System.out.println("Name: " + this.name + ", Age: " + this.age + ", Total Students: " + count);
    }
}

public class Labsheet4Q1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAndDisplayDetails("Alice", 20);
        Student s2 = new Student();
        s2.setAndDisplayDetails("Bob", 22);
    }
}

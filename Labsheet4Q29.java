class Employee {
    String name;
    double salary;
    static String organization = "Global Tech";

    void compareSalaries(Employee e1, Employee e2) {
        Employee localEmp1 = e1;
        Employee localEmp2 = e2;
        System.out.println("Organization: " + organization);
        if (localEmp1.salary > localEmp2.salary) {
            System.out.println(localEmp1.name + " earns more than " + localEmp2.name);
        } else if (localEmp1.salary < localEmp2.salary) {
            System.out.println(localEmp2.name + " earns more than " + localEmp1.name);
        } else {
            System.out.println("Both employees earn the same salary.");
        }
    }
}

public class Labsheet4Q29 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.salary = 50000;

        Employee emp2 = new Employee();
        emp2.name = "Bob";
        emp2.salary = 60000;

        Employee comp = new Employee();
        comp.compareSalaries(emp1, emp2);
    }
}

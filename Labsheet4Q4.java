class Employee {
    int empId;
    double salary;
    static String companyName = "TechCorp";

    void displayDetails(int id, double sal) {
        int localId = id;
        double localSalary = sal;
        this.empId = localId;
        this.salary = localSalary;
        System.out.println("Company: " + companyName + ", Emp ID: " + this.empId + ", Salary: " + this.salary);
    }
}

class Labsheet4Q4 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayDetails(101, 75000.0);
    }
}

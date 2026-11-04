class StudentMarks {
    double marks1;
    double marks2;
    double marks3;
    static String universityName = "Global University";

    void calculateAverage(double m1, double m2, double m3) {
        double localM1 = m1;
        double localM2 = m2;
        double localM3 = m3;
        this.marks1 = localM1;
        this.marks2 = localM2;
        this.marks3 = localM3;
        double avg = (this.marks1 + this.marks2 + this.marks3) / 3.0;
        System.out.println("University: " + universityName + ", Average Marks: " + avg);
    }
}

public class Labsheet4Q12 {
    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        sm.calculateAverage(85.0, 90.0, 80.0);
    }
}

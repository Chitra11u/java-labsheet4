class StudentGrade {
    String name;
    double marks;
    static double passingMarks = 40.0;

    void assignGrade(String n, double m) {
        String localName = n;
        double localMarks = m;
        this.name = localName;
        this.marks = localMarks;
        if (this.marks >= passingMarks) {
            System.out.println(this.name + " Passed with marks: " + this.marks);
        } else {
            System.out.println(this.name + " Failed with marks: " + this.marks);
        }
    }
}

public class Labsheet4Q17 {
    public static void main(String[] args) {
        StudentGrade sg = new StudentGrade();
        sg.assignGrade("Alice", 75.5);
    }
}

public class ScholarshipCalculator {
    public static void main(String[] args) {
        // Test the functionality with the given input
        Student student = new Student(90, 85, 95);

        Grade grade = student.calculateGrade();
        double scholarship = student.calculateScholarship();

        System.out.println("Grade: " + grade);
        System.out.println("Scholarship: " + scholarship + " rupees");
    }
}
// Enum for Grade
enum Grade {
    A, B, C, D, F // Define possible grade values
}

class Student {
    private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;

    public Student(int subject1Marks, int subject2Marks, int subject3Marks) {
        this.subject1Marks = subject1Marks;
        this.subject2Marks = subject2Marks;
        this.subject3Marks = subject3Marks;
    }

    public double calculateTotal() {
        return subject1Marks + subject2Marks + subject3Marks;
    }

    public Grade calculateGrade() {
        double totalMarks = calculateTotal();
        double averageMarks = totalMarks / 3;

        if (averageMarks >= 90) {
            return Grade.A;
        } else if (averageMarks >= 80) {
            return Grade.B;
        } else if (averageMarks >= 70) {
            return Grade.C;
        } else if (averageMarks >= 60) {
            return Grade.D;
        } else {
            return Grade.F;
        }
    }

    public double calculateScholarship() {
        Grade grade = calculateGrade();

        switch (grade) {
            case A:
                return 5000.0;
            case B:
                return 4000.0;
            case C:
                return 3000.0;
            case D:
                return 2000.0;
            default:
                return 0.0;
        }
    }
}



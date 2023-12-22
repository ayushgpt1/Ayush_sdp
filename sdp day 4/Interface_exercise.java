public class Main {
    public static void main(String[] args) {
        // For Intern
        Intern intern1 = new Intern(5000, 500);
        System.out.println("For Intern:");
        System.out.println("The total aggregate percentage secured is " + intern1.calcPercentage());

        // For Trainee
        Trainee trainee1 = new Trainee(6000);
        System.out.println("\nFor Trainee:");
        System.out.println("The total aggregate percentage secured is " + trainee1.calcPercentage());

        // Additional case for Intern
        Intern intern2 = new Intern(8000, 500);
        System.out.println("\nAdditional case for Intern:");
        System.out.println("The total aggregate percentage secured is " + intern2.calcPercentage());
    }
}
// Intern class
class Intern {
    private int marksSecured;
    private int graceMarks;
    private final int totalMaximumMarks = 8000;

    // Constructor
    public Intern(int marksSecured, int graceMarks) {
        this.marksSecured = marksSecured;
        this.graceMarks = graceMarks;
    }

    // Method to calculate percentage
    public double calcPercentage() {
        int totalMarks = marksSecured + graceMarks;
        double percentage = ((double) totalMarks / totalMaximumMarks) * 100;
        return percentage;
    }
}

// Trainee class
class Trainee {
    private int marksSecured;
    private final int totalMaximumMarks = 8000;

    // Constructor
    public Trainee(int marksSecured) {
        this.marksSecured = marksSecured;
    }

    // Method to calculate percentage
    public double calcPercentage() {
        double percentage = ((double) marksSecured / totalMaximumMarks) * 100;
        return percentage;
    }
}



public class SubjectMarks {
    private int[] marksArray;

    public SubjectMarks() {
        marksArray = new int[5];
    }

    public void storeMarks(int[] marks) {
        if (marks.length == 5) {
            System.arraycopy(marks, 0, marksArray, 0, 5);
            System.out.println("Marks stored successfully.");
        } else {
            System.out.println("Please provide marks for all 5 subjects.");
        }
    }

    public void displayMarks() {
        System.out.println("Subject Marks:");
        int subjectNumber = 1;
        for (int mark : marksArray) {
            System.out.println("Subject " + subjectNumber + ": " + mark);
            subjectNumber++;
        }
    }

    public static void main(String[] args) {
        SubjectMarks subjectMarks = new SubjectMarks();

        int[] marks = {75, 82, 90, 68, 88}; // Sample marks for 5 subjects

        subjectMarks.storeMarks(marks);
        subjectMarks.displayMarks();
    }
}

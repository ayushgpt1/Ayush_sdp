public class Student {
    private String name;
    private int age;
    private String residentialStatus; // Assuming 'H' for hostellers and 'D' for day scholars
    
    // Constructor
    public Student(String name, int age, String residentialStatus) {
        this.name = name;
        this.age = age;
        this.residentialStatus = residentialStatus;
    }
    
    // Getter and Setter methods for 'name'
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Getter and Setter methods for 'age'
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    // Getter and Setter methods for 'residentialStatus'
    public String getResidentialStatus() {
        return residentialStatus;
    }
    
    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
    }
    
    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Residential Status: " + residentialStatus);
    }
    
    public static void main(String[] args) {
        // Creating a sample student
        Student student1 = new Student("Jacob", 80, "H");
        
        // Displaying details of the student
        student1.displayDetails();
    }
}
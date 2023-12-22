public class EmployeeRecord {
    private double[] salaries;

    public EmployeeRecord(double[] salaries) {
        this.salaries = salaries;
    }

    public void displaySalaries() {
        System.out.println("Employee Salaries:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i + 1) + ": $" + salaries[i]);
        }
    }

    public double calculateAverageSalary() {
        double total = 0;
        for (double salary : salaries) {
            total += salary;
        }
        return total / salaries.length;
    }

    public int countAboveAverage() {
        double average = calculateAverageSalary();
        int count = 0;
        for (double salary : salaries) {
            if (salary > average) {
                count++;
            }
        }
        return count;
    }

    public int countBelowAverage() {
        double average = calculateAverageSalary();
        int count = 0;
        for (double salary : salaries) {
            if (salary < average) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        double[] salary = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        EmployeeRecord record = new EmployeeRecord(salary);

        record.displaySalaries();

        double averageSalary = record.calculateAverageSalary();
        System.out.println("Average Salary: $" + averageSalary);

        int aboveAverageCount = record.countAboveAverage();
        System.out.println("Number of employees earning above average: " + aboveAverageCount);

        int belowAverageCount = record.countBelowAverage();
        System.out.println("Number of employees earning below average: " + belowAverageCount);
    }
}

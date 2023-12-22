public class PerformanceCalculator {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setPoints(85);

        Employee emp2 = new Employee();
        emp2.setPoints(65);

        Employee emp3 = new Employee();
        emp3.setPoints(45);

        int rating1 = PerformanceRating.calculatePerformance(emp1);
        int rating2 = PerformanceRating.calculatePerformance(emp2);
        int rating3 = PerformanceRating.calculatePerformance(emp3);

        System.out.println("Employee 1's performance rating: " + getRatingDescription(rating1));
        System.out.println("Employee 2's performance rating: " + getRatingDescription(rating2));
        System.out.println("Employee 3's performance rating: " + getRatingDescription(rating3));
    }

    public static String getRatingDescription(int rating) {
        switch (rating) {
            case 5:
                return "Outstanding";
            case 4:
                return "Good";
            case 3:
                return "Average";
            case 2:
                return "Poor";
            default:
                return "Invalid rating or point";
        }
    }
}
class Employee {
    private int points;

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}

class PerformanceRating {
    private static final int Outstanding = 5;
    private static final int Good = 4;
    private static final int Average = 3;
    private static final int Poor = 2;

    public static int calculatePerformance(Employee employee) {
        int points = employee.getPoints();

        if (points >= 80 && points <= 100) {
            return Outstanding;
        } else if (points >= 60 && points <= 79) {
            return Good;
        } else if (points >= 50 && points <= 59) {
            return Average;
        } else if (points >= 1 && points <= 49) {
            return Poor;
        } else {
            return -1; // Indicate an invalid range or value
        }
    }
}



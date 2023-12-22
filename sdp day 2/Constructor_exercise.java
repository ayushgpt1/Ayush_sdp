public class Chocolate {
    private double defaultWeight;
    private double defaultCost;

    public Chocolate(double defaultWeight, double defaultCost) {
        this.defaultWeight = defaultWeight;
        this.defaultCost = defaultCost;
    }

    public double getDefaultWeight() {
        return defaultWeight;
    }

    public void setDefaultWeight(double defaultWeight) {
        this.defaultWeight = defaultWeight;
    }

    public double getDefaultCost() {
        return defaultCost;
    }

    public void setDefaultCost(double defaultCost) {
        this.defaultCost = defaultCost;
    }

    public void displayChocolateDetails() {
        System.out.println("Chocolate Details:");
        System.out.println("Default Weight: " + defaultWeight + " grams");
        System.out.println("Default Cost: $" + defaultCost);
    }

    public static void main(String[] args) {
        // Creating a Chocolate object with default weight of 50 grams and default cost of $2.50
        Chocolate myChocolate = new Chocolate(50, 2.50);

        // Displaying the default details of the chocolate
        myChocolate.displayChocolateDetails();

        // Modifying the default weight and cost
        myChocolate.setDefaultWeight(60);
        myChocolate.setDefaultCost(3.00);

        // Displaying the updated details of the chocolate
        myChocolate.displayChocolateDetails();
    }
}

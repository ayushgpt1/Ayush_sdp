public class Typecasting {
    // Function to calculate discounted bill amount
    public static double calculateDiscountedAmount(double billAmount, double discount) {
        return billAmount - billAmount * (discount / 100);
    }

    public static void main(String[] args) {
        // Input data for customer 1
        int billId1 = 1001;
        int customerId1 = 101;
        double discount1 = 2.0;
        double billAmount1 = 199.99;

        // Input data for customer 2
        int billId2 = 1002;
        int customerId2 = 102;
        double discount2 = 4.0;
        double billAmount2 = 210.5;

        // Calculate discounted bill amounts
        double discountedBillAmount1 = calculateDiscountedAmount(billAmount1, discount1);
        double discountedBillAmount2 = calculateDiscountedAmount(billAmount2, discount2);

        // Print the results
        System.out.println("Bill ID: " + billId1);
        System.out.println("Customer ID: " + customerId1);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount1);

        System.out.println("\nBill ID: " + billId2);
        System.out.println("Customer ID: " + customerId2);
        System.out.println("Discounted Bill Amount: " + discountedBillAmount2);
    }
}
public class PaymentTester {
    public static void main(String[] args) {
        // Credit Card Payment tests
        CreditCardPayment ccPayment1 = new CreditCardPayment(5000);
        ccPayment1.payBill(5500); // Input1 for credit card

        CreditCardPayment ccPayment2 = new CreditCardPayment(4000);
        ccPayment2.payBill(3000); // Input2 for credit card

        // Shopping Payment tests
        ShoppingPayment shoppingPayment1 = new ShoppingPayment(2500);
        shoppingPayment1.payBill(2500); // Input3 for Shopping

        ShoppingPayment shoppingPayment2 = new ShoppingPayment(1000);
        shoppingPayment2.payBill(800); // Input4 for Shopping

        ShoppingPayment shoppingPayment3 = new ShoppingPayment(1500);
        shoppingPayment3.payBill(1600); // Input5 for Shopping

        ShoppingPayment shoppingPayment4 = new ShoppingPayment(2000);
        shoppingPayment4.payBill(1900); // Input6 for Shopping
    }
}
abstract class RRPaymentServices {
    protected double balance;
    protected String paymentID;

    public RRPaymentServices(double balance) {
        this.balance = balance;
    }

    public abstract void payBill(double amount);
}

class CreditCardPayment extends RRPaymentServices {
    private static int counter = 1000;
    private double balanceDue;
    private double cashBack;

    public CreditCardPayment(double balance) {
        super(balance);
        paymentID = "C" + counter++;
    }

    @Override
    public void payBill(double amount) {
        if (amount > balance) {
            cashBack = amount - balance;
            System.out.println("Transaction ID: " + paymentID);
            System.out.println("Cashback: " + cashBack);
        } else {
            balanceDue = balance - amount;
            System.out.println("Transaction ID: " + paymentID);
            System.out.println("Balance due: " + balanceDue);
        }
    }
}

class ShoppingPayment extends RRPaymentServices {
    private static int counter = 5000;

    public ShoppingPayment(double balance) {
        super(balance);
        paymentID = "S" + counter++;
    }

    @Override
    public void payBill(double amount) {
        if (amount == balance) {
            System.out.println("Transaction ID: " + paymentID);
        } else {
            System.out.println("Invalid payment amount for shopping bill.");
        }
    }
}



public class ReverseCalculator {

    // Method to reverse a number using a while loop
    public static int reverseWithWhileLoop(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    // Method to reverse a number using a for loop
    public static int reverseWithForLoop(int number) {
        int reversedNumber = 0;
        for (; number != 0; number /= 10) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }
        return reversedNumber;
    }

    // Method to reverse a number using a do-while loop
    public static int reverseWithDoWhileLoop(int number) {
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        } while (number != 0);
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 27;

        // Using while loop
        int reversedWithWhileLoop = reverseWithWhileLoop(number);
        System.out.println("Reverse using while loop: " + reversedWithWhileLoop);

        // Using for loop
        int reversedWithForLoop = reverseWithForLoop(number);
        System.out.println("Reverse using for loop: " + reversedWithForLoop);

        // Using do-while loop
        int reversedWithDoWhileLoop = reverseWithDoWhileLoop(number);
        System.out.println("Reverse using do-while loop: " + reversedWithDoWhileLoop);
    }
}

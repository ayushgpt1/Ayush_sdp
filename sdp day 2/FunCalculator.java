public class FunCalculator {

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }
        return sum == originalNumber;
    }

    // Method to check if a number is a lucky number
    public static boolean isLuckyNumber(int number) {
        int sum = 0;
        boolean alternateDigit = false;
        
        while (number > 0) {
            int digit = number % 10;
            if (alternateDigit) {
                sum += digit * digit;
            }
            alternateDigit = !alternateDigit;
            number /= 10;
        }
        
        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        int armstrongNum = 153;
        int luckyNum = 2864;

        // Check if the number is an Armstrong number
        if (isArmstrongNumber(armstrongNum)) {
            System.out.println(armstrongNum + " is an Armstrong number.");
        } else {
            System.out.println(armstrongNum + " is not an Armstrong number.");
        }

        // Check if the number is a lucky number
        if (isLuckyNumber(luckyNum)) {
            System.out.println(luckyNum + " is a lucky number.");
        } else {
            System.out.println(luckyNum + " is not a lucky number.");
        }
    }
}

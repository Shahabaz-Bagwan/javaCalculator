/**
 * A basic Calculator class that performs arithmetic operations.
 */
public class Calculator {

    /**
     * Adds two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The sum of num1 and num2.
     */
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    /**
     * Subtracts the second number from the first.
     *
     * @param num1 The first number (minuend).
     * @param num2 The second number (subtrahend).
     * @return The difference between num1 and num2.
     */
    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The product of num1 and num2.
     */
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    /**
     * Divides the first number by the second.
     *
     * @param num1 The dividend.
     * @param num2 The divisor.
     * @return The quotient of num1 divided by num2.
     * @throws IllegalArgumentException if the divisor (num2) is zero.
     */
    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 / num2;
    }

    /**
     * Main method to demonstrate the Calculator class.
     * You can run this method to test the calculator operations.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an instance of the Calculator
        Calculator myCalculator = new Calculator();

        // Perform some operations and print the results
        double resultAdd = myCalculator.add(10.5, 5.2);
        System.out.println("10.5 + 5.2 = " + resultAdd); // Expected: 15.7

        double resultSubtract = myCalculator.subtract(20.0, 7.5);
        System.out.println("20.0 - 7.5 = " + resultSubtract); // Expected: 12.5

        double resultMultiply = myCalculator.multiply(4.0, 2.5);
        System.out.println("4.0 * 2.5 = " + resultMultiply); // Expected: 10.0

        double resultDivide = myCalculator.divide(100.0, 4.0);
        System.out.println("100.0 / 4.0 = " + resultDivide); // Expected: 25.0

        // Demonstrate division by zero error handling
        try {
            myCalculator.divide(5.0, 0.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage()); // Expected: Error: Cannot divide by zero!
        }
    }
}

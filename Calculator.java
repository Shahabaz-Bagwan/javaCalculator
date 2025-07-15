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
     * @throws ArithmeticException if the divisor (num2) is zero.
     */
    public double divide(double num1, double num2) {
        /*
        This checks if num2 is very close to 0.
        Double values are not always precise,
        so instead of checking num2 == 0,
        we check if it's close enough to zero using a small limit.
        */
        if (Math.abs(num2) < 1e-9) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }
}
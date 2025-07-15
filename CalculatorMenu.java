import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CalculatorMenu{
    /**
     * Main method to demonstrate the Calculator class.
     * You can run this method to test the calculator operations.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        while(true){
            Scanner sc = new Scanner(System.in);
            Calculator calc = new Calculator();
            System.out.println("Choose any Operation below :[+,-,*,/] Or Press 0 to exit");
            for(String operation : getMenuOptions()){  //Iterates and displays options
                System.out.println(operation);
            }
            char input = sc.next().charAt(0); //user input to select operation
            try {
                switch (input) {
                    //Addition
                    case '+':
                        System.out.println("Enter number 1:");
                        double addNum1 = sc.nextDouble();
                        System.out.println("Enter number 2:");
                        double addNum2 = sc.nextDouble();
                        System.out.println("Addition result :" + calc.add(addNum1, addNum2));
                        break;
                    //Subtraction
                    case '-':
                        System.out.println("Enter number 1:");
                        double sumNum1 = sc.nextDouble();
                        System.out.println("Enter number 2:");
                        double sumNum2 = sc.nextDouble();
                        System.out.println("Subtraction  result :" + calc.subtract(sumNum1, sumNum2));
                        break;
                    //Multiplication
                    case '*':
                        System.out.println("Enter number 1:");
                        double mulNum1 = sc.nextDouble();
                        System.out.println("Enter number 2:");
                        double mulNum2 = sc.nextDouble();
                        System.out.println("Multiplication result: " + calc.multiply(mulNum1, mulNum2));
                        break;
                    //Division
                    case '/':
                        System.out.println("Enter number 1:");
                        double divNum1 = sc.nextDouble();
                        System.out.println("Enter number 2:");
                        double divNum2 = sc.nextDouble();
                        try {
                            System.out.println("Division result: " + calc.divide(divNum1, divNum2));
                        } catch (ArithmeticException e) {
                            System.err.println(e.getMessage());
                        }
                        break;
                    //exit
                    case '0':
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.err.println("Invalid input choose from given options");
                }
            }catch (InputMismatchException e){  //handling invalid inputs from user
                System.err.println("INVALID INPUT : Enter valid Input Numbers to perform Operation");
            }
        }
    }

    /**
     * Returns a list of menu options for the calculator.
     * These options are shown to the user for selecting an operation.
     * @return List of calculator operation instructions.
     */
    public static List<String> getMenuOptions(){
        return List.of("Press '+' perform Addition",
                       "Press '-' perform Subtraction",
                       "Press '*' key to perform Multiplication",
                       "Press '/' Key to perform Division",
                       "Press '0' to exit");
    }
}

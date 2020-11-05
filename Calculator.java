import java.util.Scanner;

public class Calculator{
    public static void main (String[] args){
        Scanner scnr = new Scanner(System.in);
        double firstOperand;
        double secondOperand;
        int userOperation;
        double calcResult;

        //User selects what operation they want to perform
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("0. Exit Program");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exponentiation");
        System.out.println("6. Logarithm");
        System.out.println("7. Display Average");
        System.out.print("Enter Menu Selection: ");
        userOperation = scnr.nextInt();

        //Obtains two numbers from user for operation
        System.out.println("Enter first operand:");
        firstOperand = scnr.nextDouble();
        System.out.println("Enter second operand:");
        secondOperand = scnr.nextDouble();

        //Code performs operation based on user input
        //Addition
        if (userOperation == 1){
            calcResult = firstOperand + secondOperand;
            System.out.println("Current Result: " + calcResult + ". Goodbye!");
        }
        //Subtraction
        else if (userOperation == 2){
            calcResult = firstOperand - secondOperand;
            System.out.println("Current Result: " + calcResult + ". Goodbye!");
        }
        //Multiplication
        else if (userOperation == 3){
            calcResult = firstOperand * secondOperand;
            System.out.println("Current Result: " + calcResult + ". Goodbye!");
        }
        //Division
        else if (userOperation == 4){
            calcResult = firstOperand / secondOperand;
            System.out.println("Current Result: " + calcResult + ". Goodbye!");
        }
        //Exponentiation
        else if (userOperation == 5) {
            calcResult = Math.pow(firstOperand, secondOperand);
            System.out.println("Current Result: " + calcResult);
        }
        //Closes program if user enters invalid selection
        else {
            System.out.println("Error: Invalid selection! Terminating program.");
        }

    }
}

// Base Calculator class
class Calculator {
    private String lastOperation;
    private Integer lastResult;

    public Calculator() {
        this.lastOperation = null;
        this.lastResult = null;
    }

    // Unit 1: Primitive Types - Adding and subtracting methods
    // Add method
    public int add(int a, int b) {
        int result = a + b;
        setLastOperation("Addition", result);
        return result;
    }

    // Subtract method
    public int subtract(int a, int b) {
        int result = a - b;
        setLastOperation("Subtraction", result);
        return result;
    }

    // Unit 3: Boolean Expressions and if Statements - Adding isPositive method
    // Method to check if a number is positive
    public boolean isPositive(int num) {
        return num > 0;
    }

    // Unit 4: Iteration - Adding sumUpTo method
    // Sum up to method
    public int sumUpTo(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        setLastOperation("Sum up to " + n, result);
        return result;
    }

    // Unit 6: Arrays - Adding findMax method
    // Find maximum in an array
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        setLastOperation("Find max", max);
        return max;
    }

    // Unit 7: ArrayLists - Adding average method
    // Calculate the average of an array
    public double average(int[] lst) {
        int sum = 0;
        for (int num : lst) {
            sum += num;
        }
        double result = (double) sum / lst.length;
        setLastOperation("Average", (int) result);
        return result;
    }

    // Unit 8: 2D Arrays - Adding rowSum method
    // Sum of a specific row in a 2D array
    public int rowSum(int[][] matrix, int row) {
        int sum = 0;
        for (int num : matrix[row]) {
            sum += num;
        }
        setLastOperation("Row sum", sum);
        return sum;
    }

    // Unit 10: Recursion - Adding factorial method
    // Factorial using recursion
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        int result = n * factorial(n - 1);
        setLastOperation("Factorial of " + n, result);
        return result;
    }

    // Setter for last operation and result
    private void setLastOperation(String operation, int result) {
        this.lastOperation = operation;
        this.lastResult = result;
    }

    // Override toString method
    @Override
    public String toString() {
        return "This is a basic calculator.";
    }
}

// ScientificCalculator class inherits from Calculator
class ScientificCalculator extends Calculator {

    // Unit 9: Inheritance - Adding power method
    // Power method
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Override toString method
    @Override
    public String toString() {
        return "This is a scientific calculator.";
    }
}

// Main program to test the classes
public class Main {
    public static void main(String[] args) {
        // Unit 1: Test add and subtract
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(5, 3)); // Output: 8
        System.out.println("Subtract: " + calc.subtract(10, 4)); // Output: 6

        // Unit 3: Test isPositive
        System.out.println("Is positive: " + calc.isPositive(5)); // Output: true
        System.out.println("Is positive: " + calc.isPositive(-5)); // Output: false

        // Unit 4: Test sumUpTo
        System.out.println("Sum up to 5: " + calc.sumUpTo(5)); // Output: 15

        // Unit 6: Test findMax
        int[] arr = {1, 3, 7, 2};
        System.out.println("Max: " + calc.findMax(arr)); // Output: 7

        // Unit 7: Test average
        int[] lst = {10, 20, 30};
        System.out.println("Average: " + calc.average(lst)); // Output: 20.0

        // Unit 8: Test rowSum
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Row sum (row 1): " + calc.rowSum(matrix, 1)); // Output: 15

        // Unit 10: Test factorial
        System.out.println("Factorial of 5: " + calc.factorial(5)); // Output: 120

        // Unit 9: Test ScientificCalculator
        ScientificCalculator sciCalc = new ScientificCalculator();
        System.out.println("Power (2^3): " + sciCalc.power(2, 3)); // Output: 8.0
        System.out.println(sciCalc); // Output: This is a scientific calculator.
    }
}

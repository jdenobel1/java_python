class Calculator:
    def __init__(self):
        # Unit 5: Writing Classes - Adding instance variables
        self.last_operation = None
        self.last_result = None

    # Unit 1: Primitive Types - Adding and subtracting methods
    def add(self, a, b):
        result = a + b
        self.set_last_operation("Addition", result)
        return result

    def subtract(self, a, b):
        result = a - b
        self.set_last_operation("Subtraction", result)
        return result

    # Unit 3: Boolean Expressions and if Statements - Adding isPositive method
    def is_positive(self, num):
        return num > 0

    # Unit 4: Iteration - Adding sumUpTo method
    def sum_up_to(self, n):
        result = sum(range(1, n + 1))
        self.set_last_operation(f"Sum up to {n}", result)
        return result

    # Unit 6: Arrays - Adding findMax method
    def find_max(self, arr):
        result = max(arr)
        self.set_last_operation("Find max", result)
        return result

    # Unit 7: ArrayLists - Adding average method
    def average(self, lst):
        result = sum(lst) / len(lst)
        self.set_last_operation("Average", int(result))
        return result

    # Unit 8: 2D Arrays - Adding rowSum method
    def row_sum(self, matrix, row):
        result = sum(matrix[row])
        self.set_last_operation("Row sum", result)
        return result

    # Unit 10: Recursion - Adding factorial method
    def factorial(self, n):
        if n == 0:
            return 1
        result = n * self.factorial(n - 1)
        self.set_last_operation(f"Factorial of {n}", result)
        return result

    # Unit 5: Writing Classes - Adding a setter for last operation and result
    def set_last_operation(self, operation, result):
        self.last_operation = operation
        self.last_result = result

    # Unit 5: Writing Classes - Overriding __str__ method
    def __str__(self):
        return "This is a basic calculator."


class ScientificCalculator(Calculator):
    # Unit 9: Inheritance - Adding power method
    def power(self, base, exponent):
        return base ** exponent

    # Unit 9: Inheritance - Overriding __str__ method
    def __str__(self):
        return "This is a scientific calculator."


# Main program to test the classes
if __name__ == "__main__":
    # Unit 1: Test add and subtract
    calc = Calculator()
    print("Add:", calc.add(5, 3))  # Output: 8
    print("Subtract:", calc.subtract(10, 4))  # Output: 6

    # Unit 3: Test isPositive
    print("Is positive:", calc.is_positive(5))  # Output: True
    print("Is positive:", calc.is_positive(-5))  # Output: False

    # Unit 4: Test sumUpTo
    print("Sum up to 5:", calc.sum_up_to(5))  # Output: 15

    # Unit 6: Test findMax
    arr = [1, 3, 7, 2]
    print("Max:", calc.find_max(arr))  # Output: 7

    # Unit 7: Test average
    lst = [10, 20, 30]
    print("Average:", calc.average(lst))  # Output: 20.0

    # Unit 8: Test rowSum
    matrix = [[1, 2, 3], [4, 5, 6]]
    print("Row sum (row 1):", calc.row_sum(matrix, 1))  # Output: 15

    # Unit 10: Test factorial
    print("Factorial of 5:", calc.factorial(5))  # Output: 120

    # Unit 9: Test ScientificCalculator
    sci_calc = ScientificCalculator()
    print("Power (2^3):", sci_calc.power(2, 3))  # Output: 8.0
    print(sci_calc)  # Output: This is a scientific calculator.


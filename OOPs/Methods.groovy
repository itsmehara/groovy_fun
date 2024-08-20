// Methods.groovy

// Define a class with methods
class Calculator {
    // Method to add two numbers
    int add(int a, int b) {
        return a + b
    }

    // Method to subtract two numbers
    int subtract(int a, int b) {
        return a - b
    }
}

// Create an instance of Calculator
def calc = new Calculator()
println "Addition: ${calc.add(10, 5)}"
println "Subtraction: ${calc.subtract(10, 5)}"

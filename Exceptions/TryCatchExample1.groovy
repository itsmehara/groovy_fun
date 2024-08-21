// File: tryCatch/TryCatchExample1.groovy
def divide(int a, int b) {
    try {
        def result = a / b
        println "Result: $result"
    } catch (ArithmeticException e) {
        println "Error: Division by zero is not allowed."
    }
}

divide(10, 2)  // Output: Result: 5
divide(10, 0)  // Output: Error: Division by zero is not allowed.

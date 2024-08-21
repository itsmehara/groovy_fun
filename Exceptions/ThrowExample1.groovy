// File: ThrowExample1.groovy
def checkPositive(int number) {
    if (number <= 0) {
        throw new IllegalArgumentException("Number must be positive.")
    }
    println "Number is positive."
}

checkPositive(5)  // This will print: Number is positive.
checkPositive(-1)  // This will throw IllegalArgumentException

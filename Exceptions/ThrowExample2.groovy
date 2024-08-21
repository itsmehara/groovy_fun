// File: ThrowExample2.groovy
def performOperation() {
    try {
        throw new RuntimeException("Something went wrong.")
    } catch (RuntimeException e) {
        println "Caught exception: ${e.message}"
        throw e  // Rethrow the exception
    }
}

performOperation()  // This will print: Caught exception: Something went wrong.

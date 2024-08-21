// File: ThrowExample3.groovy
class CustomException extends Exception {
    CustomException(String message) {
        super(message)
    }
}

def validateAge(int age) {
    if (age < 18) {
        throw new CustomException("Age must be at least 18.")
    }
    println "Age is valid."
}

validateAge(20)  // This will print: Age is valid.
validateAge(15)  // This will throw CustomException

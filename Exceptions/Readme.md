Here's a comprehensive guide with Groovy code samples for each section of exception handling, 
including how to run the code, sample data, and a folder structure for organizing your files.

### Folder Structure

Here's the recommended folder structure to organize your Groovy scripts:

```
/ExceptionHandlingExamples
    /tryCatch
        TryCatchExample1.groovy
        TryCatchExample2.groovy
        TryCatchExample3.groovy
    /throwingExceptions
        ThrowExample1.groovy
        ThrowExample2.groovy
        ThrowExample3.groovy
    /customExceptions
        CustomExceptionExample1.groovy
        CustomExceptionExample2.groovy
        CustomExceptionExample3.groovy
    /finallyBlock
        FinallyExample1.groovy
        FinallyExample2.groovy
        FinallyExample3.groovy
```

### 1. Exception Handling in Groovy

#### A. Try-Catch Blocks

##### Code Sample 1: Basic Try-Catch
```groovy
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
```

##### Code Sample 2: Multiple Catch Blocks
```groovy
// File: tryCatch/TryCatchExample2.groovy
def processFile(String filename) {
    try {
        def file = new File(filename)
        def content = file.text
        println content
    } catch (FileNotFoundException e) {
        println "Error: File not found."
    } catch (IOException e) {
        println "Error: I/O error occurred."
    }
}

processFile("existentFile.txt")  // Adjust filename as needed
processFile("nonExistentFile.txt")  // Output: Error: File not found.
```

##### Code Sample 3: Handling Multiple Exceptions
```groovy
// File: tryCatch/TryCatchExample3.groovy
def readArrayElement(int[] array, int index) {
    try {
        println "Element at index $index: ${array[index]}"
    } catch (ArrayIndexOutOfBoundsException e) {
        println "Error: Index out of bounds."
    } catch (Exception e) {
        println "An unexpected error occurred."
    }
}

readArrayElement([1, 2, 3], 1)  // Output: Element at index 1: 2
readArrayElement([1, 2, 3], 5)  // Output: Error: Index out of bounds.
```

#### B. Throwing Exceptions

##### Code Sample 1: Basic Throw
```groovy
// File: throwingExceptions/ThrowExample1.groovy
def checkPositive(int number) {
    if (number <= 0) {
        throw new IllegalArgumentException("Number must be positive.")
    }
    println "Number is positive."
}

checkPositive(5)  // Output: Number is positive.
checkPositive(-1)  // Throws IllegalArgumentException
```

##### Code Sample 2: Rethrowing Exception
```groovy
// File: throwingExceptions/ThrowExample2.groovy
def performOperation() {
    try {
        throw new RuntimeException("Something went wrong.")
    } catch (RuntimeException e) {
        println "Caught exception: ${e.message}"
        throw e  // Rethrow the exception
    }
}

performOperation()  // Output: Caught exception: Something went wrong.
```

##### Code Sample 3: Throwing Custom Exception
```groovy
// File: throwingExceptions/ThrowExample3.groovy
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

validateAge(20)  // Output: Age is valid.
validateAge(15)  // Throws CustomException
```

#### C. Custom Exceptions

##### Code Sample 1: Custom Exception Definition
```groovy
// File: customExceptions/CustomExceptionExample1.groovy
class AgeTooLowException extends RuntimeException {
    AgeTooLowException(String message) {
        super(message)
    }
}

def checkAge(int age) {
    if (age < 18) {
        throw new AgeTooLowException("Age must be at least 18.")
    }
    println "Age is sufficient."
}

checkAge(25)  // Output: Age is sufficient.
checkAge(16)  // Throws AgeTooLowException
```

##### Code Sample 2: Using Custom Exception in Methods
```groovy
// File: customExceptions/CustomExceptionExample2.groovy
class InvalidUserException extends Exception {
    InvalidUserException(String message) {
        super(message)
    }
}

def authenticateUser(String username) {
    if (username != "admin") {
        throw new InvalidUserException("Invalid user.")
    }
    println "User authenticated."
}

authenticateUser("admin")  // Output: User authenticated.
authenticateUser("guest")  // Throws InvalidUserException
```

##### Code Sample 3: Custom Exception with Additional Fields
```groovy
// File: customExceptions/CustomExceptionExample3.groovy
class DetailedException extends Exception {
    int errorCode

    DetailedException(String message, int errorCode) {
        super(message)
        this.errorCode = errorCode
    }
}

def processOrder(int orderId) {
    if (orderId <= 0) {
        throw new DetailedException("Invalid order ID.", 1001)
    }
    println "Order processed successfully."
}

processOrder(1)  // Output: Order processed successfully.
processOrder(-1)  // Throws DetailedException
```

#### D. Using Finally Block

##### Code Sample 1: Basic Finally Block
```groovy
// File: finallyBlock/FinallyExample1.groovy
def executeTask() {
    try {
        println "Task is being executed."
        // Simulate task execution
    } finally {
        println "Cleanup actions performed."
    }
}

executeTask()  
// Output:
// Task is being executed.
// Cleanup actions performed.
```

##### Code Sample 2: Finally with Return
```groovy
// File: finallyBlock/FinallyExample2.groovy
def divideWithCleanup(int a, int b) {
    try {
        def result = a / b
        return result
    } finally {
        println "Exiting divideWithCleanup method."
    }
}

println divideWithCleanup(10, 2)  // Output: Exiting divideWithCleanup method. \n 5
```

##### Code Sample 3: Finally Block with Exception
```groovy
// File: finallyBlock/FinallyExample3.groovy
def readFile(String filename) {
    def reader = null
    try {
        reader = new BufferedReader(new FileReader(filename))
        println reader.readLine()
    } catch (IOException e) {
        println "Error reading file: ${e.message}"
    } finally {
        if (reader != null) {
            reader.close()
            println "File reader closed."
        }
    }
}

readFile("existentFile.txt")  // Adjust filename as needed
readFile("nonExistentFile.txt")  // Output: Error reading file: <message> (if the file does not exist)
```

### How to Run the Code

1. **Save the Groovy code** into files according to the folder structure provided.

2. **Install Groovy** if you haven’t already. You can download it from [Groovy's official website](https://groovy-lang.org/download.html) or use SDKMAN! or Homebrew for installation.

3. **Open a terminal** or command prompt and navigate to the directory where the Groovy files are located. For example:
   ```sh
   cd path/to/ExceptionHandlingExamples/tryCatch
   ```

4. **Run the Groovy script** using the command:
   ```sh
   groovy <filename>.groovy
   ```
   Replace `<filename>` with the name of the script, e.g.,
   ```sh
   groovy TryCatchExample1.groovy
   ```

This guide provides a clear overview of different exception handling techniques in Groovy, complete with runnable code samples and an organized folder structure for easy management.

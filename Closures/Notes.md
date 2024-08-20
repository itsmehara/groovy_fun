Here’s a guide on how to work with closures in Groovy, including sample code, how to run it, and a suggested folder structure.

### Folder Structure

```
groovy_samples/
├── Closures/
│   ├── Defining_Closures.groovy
│   ├── Passing_Parameters.groovy
│   ├── Returning_Values.groovy
│   └── Closure_Delegation.groovy
└── data/
    └── sample_data.txt
```

### 1. Defining Closures

**File:** `Closures/Defining_Closures.groovy`

```groovy
// Defining_Closures.groovy

// Define a simple closure
def greet = {
    println "Hello, World!"
}

// Call the closure
greet()
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Closures` directory.
3. Run the Groovy script using:
   ```sh
   groovy Defining_Closures.groovy
   ```

### 2. Passing Parameters to Closures

**File:** `Closures/Passing_Parameters.groovy`

```groovy
// Passing_Parameters.groovy

// Define a closure that takes parameters
def greetPerson = { name ->
    println "Hello, ${name}!"
}

// Call the closure with a parameter
greetPerson("Alice")
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Closures` directory.
3. Run the Groovy script using:
   ```sh
   groovy Passing_Parameters.groovy
   ```

### 3. Returning Values from Closures

**File:** `Closures/Returning_Values.groovy`

```groovy
// Returning_Values.groovy

// Define a closure that returns a value
def add = { a, b ->
    return a + b
}

// Call the closure and print the result
def result = add(10, 5)
println "The result of addition is: ${result}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Closures` directory.
3. Run the Groovy script using:
   ```sh
   groovy Returning_Values.groovy
   ```

### 4. Closure Delegation Strategies

**File:** `Closures/Closure_Delegation.groovy`

```groovy
// Closure_Delegation.groovy

// Define a class with a method
class Person {
    def name

    def introduce() {
        println "Hi, I'm ${name}."
    }
}

// Create an instance of Person
def person = new Person(name: 'John')

// Define a closure with a delegate
def introducePerson = {
    introduce() // Calls the method from the delegate
}

// Set the delegate to the person instance
introducePerson.delegate = person
introducePerson.resolveStrategy = Closure.DELEGATE_ONLY

// Call the closure
introducePerson()
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Closures` directory.
3. Run the Groovy script using:
   ```sh
   groovy Closure_Delegation.groovy
   ```

### Sample Data

For closures that might use external data, you can use `data/sample_data.txt`. 
For instance, if you want to read data from a file inside a closure:

**File:** `data/sample_data.txt`

```
Hello from file!
```

You can read from this file in a closure like this:

**Example Code in a New Script:** `Closures/Reading_File_In_Closure.groovy`

```groovy
// Reading_File_In_Closure.groovy

// Define a closure that reads a file
def readFile = {
    def file = new File("data/sample_data.txt")
    file.eachLine { line ->
        println line
    }
}

// Call the closure
readFile()
```

**Running the Code:**

1. Place the `sample_data.txt` file in the `data` directory.
2. Navigate to the `groovy_samples/Closures` directory.
3. Run the Groovy script using:
   ```sh
   groovy Reading_File_In_Closure.groovy
   ```

This setup should cover the basics of working with closures in Groovy, including defining them, passing parameters, 
returning values, and using delegation strategies.

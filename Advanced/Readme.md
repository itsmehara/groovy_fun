Below is a guide to advanced Groovy features including meta-programming, AST transformations, Groovy categories, and traits. 
Each section includes sample code, instructions on how to run the code, and a suggested folder structure.

### Folder Structure

```
groovy_samples/
├── Advanced_Features/
│   ├── Meta_Programming.groovy
│   ├── AST_Transformations.groovy
│   ├── Groovy_Categories.groovy
│   └── Traits.groovy
└── data/
    └── sample_data.txt
```

### 1. Meta-Programming

**File:** `Advanced_Features/Meta_Programming.groovy`

```groovy
// Meta_Programming.groovy

// Define a class with meta-programming
class Person {
    String name

    // Dynamically add a method
    def propertyMissing(String name) {
        "Property '${name}' is not defined."
    }

    def methodMissing(String name, args) {
        "Method '${name}' with arguments '${args}' is not defined."
    }
}

// Create an instance of Person
def person = new Person(name: "Alice")

// Access a missing property
println person.age // Output: Property 'age' is not defined.

// Call a missing method
println person.sayHello("Hi") // Output: Method 'sayHello' with arguments '[Hi]' is not defined.
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Advanced_Features` directory.
3. Run the Groovy script using:
   ```sh
   groovy Meta_Programming.groovy
   ```

### 2. AST (Abstract Syntax Tree) Transformations

**File:** `Advanced_Features/AST_Transformations.groovy`

```groovy
// AST_Transformations.groovy

// Import AST transformation
import groovy.transform.ToString

// Define a class with AST transformation
@ToString(includeNames=true, includeFields=true)
class Person {
    String name
    int age
}

// Create an instance of Person
def person = new Person(name: "Alice", age: 30)

// Print the Person object using the @ToString transformation
println person
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Advanced_Features` directory.
3. Run the Groovy script using:
   ```sh
   groovy AST_Transformations.groovy
   ```

### 3. Groovy Categories

**File:** `Advanced_Features/Groovy_Categories.groovy`

```groovy
// Groovy_Categories.groovy

// Define a category
class StringCategory {
    static String shout(String self) {
        return self.toUpperCase() + "!!!"
    }
}

// Use the category
use(StringCategory) {
    def greeting = "hello"
    println greeting.shout() // Output: HELLO!!!
}
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Advanced_Features` directory.
3. Run the Groovy script using:
   ```sh
   groovy Groovy_Categories.groovy
   ```

### 4. Traits

**File:** `Advanced_Features/Traits.groovy`

```groovy
// Traits.groovy

// Define traits
trait Greeter {
    String greet() {
        return "Hello from Greeter!"
    }
}

trait Farewell {
    String farewell() {
        return "Goodbye from Farewell!"
    }
}

// Define a class that uses traits
class Person implements Greeter, Farewell {
    String name
}

// Create an instance of Person
def person = new Person(name: "Alice")

// Call methods from traits
println person.greet()      // Output: Hello from Greeter!
println person.farewell()   // Output: Goodbye from Farewell!
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Advanced_Features` directory.
3. Run the Groovy script using:
   ```sh
   groovy Traits.groovy
   ```

### Sample Data

While the provided examples do not utilize external data files, you can still use `data/sample_data.txt` if needed. For example:

**File:** `data/sample_data.txt`

```
Sample data content for advanced Groovy features.
```

**Example Code to Read File:** `Advanced_Features/Read_File_In_Closure.groovy`

```groovy
// Read_File_In_Closure.groovy

// Define a closure that reads a file
def readFile = { filePath ->
    def file = new File(filePath)
    file.eachLine { line ->
        println line
    }
}

// Call the closure
readFile("data/sample_data.txt")
```

**Running the Code:**

1. Place the `sample_data.txt` file in the `data` directory.
2. Navigate to the `groovy_samples/Advanced_Features` directory.
3. Run the Groovy script using:
   ```sh
   groovy Read_File_In_Closure.groovy
   ```

This setup provides an overview of advanced Groovy features including meta-programming, AST transformations, categories, and traits, along with instructions for running the provided code samples.

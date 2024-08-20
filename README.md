# Fun with groovy learning

----------

Here's a guide on how to write and run Groovy code snippets for various basic concepts, 
including the folder structure and sample data where necessary.

### Folder Structure

```
groovy_samples/
├── Basic_Syntax.groovy
├── Variables_and_Types.groovy
├── Basic_Operators.groovy
├── Control_Structures.groovy
└── data/
    └── sample_data.txt
```

### 1. Basic Syntax

**File:** `Basic_Syntax.groovy`

```groovy
// Basic_Syntax.groovy
println "Hello, Groovy!"

// Define a simple function
def greet(name) {
    return "Hello, ${name}!"
}

// Call the function
println greet("World")
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples` directory.
3. Run the Groovy script using:
   ```sh
   groovy Basic_Syntax.groovy
   ```

### 2. Variables and Types

**File:** `Variables_and_Types.groovy`

```groovy
// Variables_and_Types.groovy

// Declare variables with different types
def name = "Alice"     // String
def age = 30           // Integer
def height = 5.7       // Float
def isStudent = true  // Boolean

// Print the variables
println "Name: ${name}"
println "Age: ${age}"
println "Height: ${height}"
println "Is Student: ${isStudent}"

// Type checking
println "Type of age: ${age.getClass().getName()}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples` directory.
3. Run the Groovy script using:
   ```sh
   groovy Variables_and_Types.groovy
   ```

### 3. Basic Operators

**File:** `Basic_Operators.groovy`

```groovy
// Basic_Operators.groovy

// Arithmetic operators
def a = 10
def b = 5
println "Addition: ${a + b}"
println "Subtraction: ${a - b}"
println "Multiplication: ${a * b}"
println "Division: ${a / b}"
println "Modulus: ${a % b}"

// Comparison operators
println "Is a greater than b? ${a > b}"
println "Is a equal to b? ${a == b}"

// Logical operators
def x = true
def y = false
println "x AND y: ${x && y}"
println "x OR y: ${x || y}"
println "NOT x: ${!x}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples` directory.
3. Run the Groovy script using:
   ```sh
   groovy Basic_Operators.groovy
   ```

### 4. Control Structures

**File:** `Control_Structures.groovy`

```groovy
// Control_Structures.groovy

// if-else
def num = 10
if (num > 0) {
    println "The number is positive."
} else if (num < 0) {
    println "The number is negative."
} else {
    println "The number is zero."
}

// switch
def day = 3
switch (day) {
    case 1:
        println "Monday"
        break
    case 2:
        println "Tuesday"
        break
    case 3:
        println "Wednesday"
        break
    default:
        println "Other day"
        break
}

// for loop
println "For loop:"
for (i in 1..5) {
    println "i = ${i}"
}

// while loop
println "While loop:"
def count = 0
while (count < 5) {
    println "count = ${count}"
    count++
}
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples` directory.
3. Run the Groovy script using:
   ```sh
   groovy Control_Structures.groovy
   ```

### Sample Data

For demonstration purposes, you might use the following sample data file if needed:

**File:** `data/sample_data.txt`

```
Name: Bob
Age: 28
Height: 6.0
```

You can read from this file in Groovy if needed, for example:

```groovy
// Read from data/sample_data.txt
def file = new File("data/sample_data.txt")
file.eachLine { line ->
    println line
}
```

**Running the Data Reading Code:**

1. Place the `sample_data.txt` file in the `data` directory.
2. Add the above code to a new script file or an existing one.
3. Run the script as described in the previous examples.

This setup should cover the basics of writing and running Groovy scripts for different concepts.

Here’s how you can structure your Groovy code to demonstrate various data types and collections, along with how to run each script. 
I've also included a suggested folder structure and sample code.

### Folder Structure

```
groovy_samples/
├── Data_Types_and_Collections/
│   ├── Strings_and_GStrings.groovy
│   ├── Numbers.groovy
│   ├── Booleans.groovy
│   ├── Lists.groovy
│   ├── Maps.groovy
│   ├── Ranges.groovy
│   └── Arrays.groovy
└── data/
    └── sample_data.txt
```

### 1. Strings and GStrings

**File:** `Data_Types_and_Collections/Strings_and_GStrings.groovy`

```groovy
// Strings_and_GStrings.groovy

// String
def name = "Alice"
println "String: ${name}"

// GString
def age = 30
def message = "Name: ${name}, Age: ${age}"
println "GString: ${message}"

// Multiline string
def multilineString = """This is a 
multiline string
in Groovy."""
println "Multiline String: ${multilineString}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Strings_and_GStrings.groovy
   ```

### 2. Numbers

**File:** `Data_Types_and_Collections/Numbers.groovy`

```groovy
// Numbers.groovy

// Integer
def intValue = 42
println "Integer: ${intValue}"

// Float
def floatValue = 3.14
println "Float: ${floatValue}"

// Double
def doubleValue = 2.71828
println "Double: ${doubleValue}"

// BigInteger
def bigIntValue = 123456789012345678901234567890
println "BigInteger: ${bigIntValue}"

// BigDecimal
def bigDecimalValue = 12345.678901234567890
println "BigDecimal: ${bigDecimalValue}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Numbers.groovy
   ```

### 3. Booleans

**File:** `Data_Types_and_Collections/Booleans.groovy`

```groovy
// Booleans.groovy

// Boolean values
def isTrue = true
def isFalse = false

println "Boolean true: ${isTrue}"
println "Boolean false: ${isFalse}"

// Logical operations
println "Not isTrue: ${!isTrue}"
println "isTrue AND isFalse: ${isTrue && isFalse}"
println "isTrue OR isFalse: ${isTrue || isFalse}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Booleans.groovy
   ```

### 4. Lists

**File:** `Data_Types_and_Collections/Lists.groovy`

```groovy
// Lists.groovy

// List
def fruits = ["Apple", "Banana", "Cherry"]
println "List: ${fruits}"

// Access elements
println "First fruit: ${fruits[0]}"

// Add element
fruits << "Date"
println "Updated List: ${fruits}"

// Iterate over list
fruits.each { fruit ->
    println "Fruit: ${fruit}"
}
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Lists.groovy
   ```

### 5. Maps

**File:** `Data_Types_and_Collections/Maps.groovy`

```groovy
// Maps.groovy

// Map
def person = [name: "Alice", age: 30, city: "New York"]
println "Map: ${person}"

// Access value
println "Name: ${person.name}"

// Add entry
person.country = "USA"
println "Updated Map: ${person}"

// Iterate over map
person.each { key, value ->
    println "${key}: ${value}"
}
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Maps.groovy
   ```

### 6. Ranges

**File:** `Data_Types_and_Collections/Ranges.groovy`

```groovy
// Ranges.groovy

// Range
def range = 1..5
println "Range: ${range}"

// Iterate over range
range.each { number ->
    println "Number: ${number}"
}

// Check if value is within range
println "4 in range: ${4 in range}"
println "6 in range: ${6 in range}"
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Ranges.groovy
   ```

### 7. Arrays

**File:** `Data_Types_and_Collections/Arrays.groovy`

```groovy
// Arrays.groovy

// Array
def numbers = [1, 2, 3, 4, 5] as int[]
println "Array: ${numbers}"

// Access element
println "First element: ${numbers[0]}"

// Modify element
numbers[0] = 10
println "Updated Array: ${numbers}"

// Iterate over array
numbers.each { number ->
    println "Number: ${number}"
}
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/Data_Types_and_Collections` directory.
3. Run the Groovy script using:
   ```sh
   groovy Arrays.groovy
   ```

### Sample Data

You can use `data/sample_data.txt` as a data file if needed. For example:

**File:** `data/sample_data.txt`

```
Name: Bob
Age: 28
Height: 6.0
```

To read from this file, you can add this snippet to any of your Groovy scripts:

```groovy
// Read from data/sample_data.txt
def file = new File("data/sample_data.txt")
file.eachLine { line ->
    println line
}
```

**Running the Data Reading Code:**

1. Place the `sample_data.txt` file in the `data` directory.
2. Add the above code snippet to one of the scripts or create a new script.
3. Run the script as described above.

This setup provides a comprehensive introduction to working with various data types and collections in Groovy.

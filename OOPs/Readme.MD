Below is a detailed guide for demonstrating Object-Oriented Programming (OOP) concepts in Groovy. 

This includes sample code for classes and objects, properties and fields, methods, inheritance, polymorphism, and abstract classes/interfaces.

Additionally, I’ll include how to run the code, code samples, and a suggested folder structure.

### Folder Structure

```
groovy_samples/
├── OOP/
│   ├── Classes_and_Objects.groovy
│   ├── Properties_and_Fields.groovy
│   ├── Methods.groovy
│   ├── Inheritance.groovy
│   ├── Polymorphism.groovy
│   ├── Abstract_Classes_and_Interfaces.groovy
└── data/
    └── sample_data.txt
```

### 1. Classes and Objects

**File:** `OOP/Classes_and_Objects.groovy`

```groovy
// Classes_and_Objects.groovy

// Define a simple class
class Person {
    String name
    int age

    // Constructor
    Person(String name, int age) {
        this.name = name
        this.age = age
    }

    // Method
    void introduce() {
        println "Hi, I'm ${name} and I'm ${age} years old."
    }
}

// Create an instance of Person
def person = new Person("Alice", 30)
person.introduce()
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Classes_and_Objects.groovy
   ```

### 2. Properties and Fields

**File:** `OOP/Properties_and_Fields.groovy`

```groovy
// Properties_and_Fields.groovy

// Define a class with properties
class Car {
    String make
    String model
    int year

    // Method to display details
    void displayInfo() {
        println "Make: ${make}, Model: ${model}, Year: ${year}"
    }
}

// Create an instance of Car
def car = new Car(make: "Toyota", model: "Corolla", year: 2020)
car.displayInfo()
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Properties_and_Fields.groovy
   ```

### 3. Methods

**File:** `OOP/Methods.groovy`

```groovy
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
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Methods.groovy
   ```

### 4. Inheritance

**File:** `OOP/Inheritance.groovy`

```groovy
// Inheritance.groovy

// Define a base class
class Animal {
    String name

    // Method in base class
    void speak() {
        println "The animal makes a sound."
    }
}

// Define a subclass that inherits from Animal
class Dog extends Animal {
    // Override method
    @Override
    void speak() {
        println "The dog barks."
    }
}

// Create an instance of Dog
def dog = new Dog(name: "Buddy")
dog.speak()
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Inheritance.groovy
   ```

### 5. Polymorphism

**File:** `OOP/Polymorphism.groovy`

```groovy
// Polymorphism.groovy

// Define a base class
class Shape {
    // Method to be overridden
    void draw() {
        println "Drawing a shape."
    }
}

// Define subclasses
class Circle extends Shape {
    @Override
    void draw() {
        println "Drawing a circle."
    }
}

class Square extends Shape {
    @Override
    void draw() {
        println "Drawing a square."
    }
}

// Method to demonstrate polymorphism
def drawShape(Shape shape) {
    shape.draw()
}

// Test polymorphism
def shapes = [new Circle(), new Square()]
shapes.each { shape ->
    drawShape(shape)
}
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Polymorphism.groovy
   ```

### 6. Abstract Classes and Interfaces

**File:** `OOP/Abstract_Classes_and_Interfaces.groovy`

```groovy
// Abstract_Classes_and_Interfaces.groovy

// Define an abstract class
abstract class Animal {
    abstract void makeSound()

    void sleep() {
        println "The animal is sleeping."
    }
}

// Define an interface
interface Swimmer {
    void swim()
}

// Define a class that extends Animal and implements Swimmer
class Dolphin extends Animal implements Swimmer {
    @Override
    void makeSound() {
        println "The dolphin makes a clicking sound."
    }

    @Override
    void swim() {
        println "The dolphin is swimming."
    }
}

// Create an instance of Dolphin
def dolphin = new Dolphin()
dolphin.makeSound()
dolphin.sleep()
dolphin.swim()
```

**Running the Code:**

1. Open a terminal or command prompt.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Abstract_Classes_and_Interfaces.groovy
   ```

### Sample Data

For completeness, if you want to read from a file within your OOP classes, you can use the following approach:

**File:** `data/sample_data.txt`

```
Sample data content.
```

**Example Code to Read File:** `OOP/Read_File.groovy`

```groovy
// Read_File.groovy

// Define a class with a method to read a file
class FileReader {
    String filePath

    void readFile() {
        def file = new File(filePath)
        file.eachLine { line ->
            println line
        }
    }
}

// Create an instance of FileReader
def reader = new FileReader(filePath: "data/sample_data.txt")
reader.readFile()
```

**Running the Code:**

1. Place the `sample_data.txt` file in the `data` directory.
2. Navigate to the `groovy_samples/OOP` directory.
3. Run the Groovy script using:
   ```sh
   groovy Read_File.groovy
   ```

This setup provides a comprehensive introduction to Object-Oriented Programming concepts in Groovy.

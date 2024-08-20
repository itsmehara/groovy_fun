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

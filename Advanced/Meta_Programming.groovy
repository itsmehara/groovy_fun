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

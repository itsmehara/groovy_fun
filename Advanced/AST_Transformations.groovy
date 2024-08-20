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

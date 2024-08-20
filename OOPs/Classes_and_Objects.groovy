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

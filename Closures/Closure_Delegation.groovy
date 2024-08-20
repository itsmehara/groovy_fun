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

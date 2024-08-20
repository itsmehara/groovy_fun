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

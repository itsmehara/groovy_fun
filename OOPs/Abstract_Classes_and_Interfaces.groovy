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

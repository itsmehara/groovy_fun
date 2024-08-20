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

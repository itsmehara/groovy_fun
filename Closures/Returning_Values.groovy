// Returning_Values.groovy

// Define a closure that returns a value
def add = { a, b ->
    return a + b
}

// Call the closure and print the result
def result = add(10, 5)
println "The result of addition is: ${result}"

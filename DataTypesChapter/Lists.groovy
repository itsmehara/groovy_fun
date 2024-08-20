// Lists.groovy

// List
def fruits = ["Apple", "Banana", "Cherry"]
println "List: ${fruits}"

// Access elements
println "First fruit: ${fruits[0]}"

// Add element
fruits << "Date"
println "Updated List: ${fruits}"

// Iterate over list
fruits.each { fruit ->
    println "Fruit: ${fruit}"
}

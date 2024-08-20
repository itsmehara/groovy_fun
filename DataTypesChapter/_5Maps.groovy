// Maps.groovy

// Map
def person = [name: "Alice", age: 30, city: "New York"]
println "Map: ${person}"

// Access value
println "Name: ${person.name}"

// Add entry
person.country = "USA"
println "Updated Map: ${person}"

// Iterate over map
person.each { key, value ->
    println "${key}: ${value}"
}

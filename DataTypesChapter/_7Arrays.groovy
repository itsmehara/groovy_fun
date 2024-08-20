// Arrays.groovy

// Array
def numbers = [1, 2, 3, 4, 5] as int[]
println "Array: ${numbers}"

// Access element
println "First element: ${numbers[0]}"

// Modify element
numbers[0] = 10
println "Updated Array: ${numbers}"

// Iterate over array
numbers.each { number ->
    println "Number: ${number}"
}

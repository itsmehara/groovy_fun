// Ranges.groovy

// Range
def range = 1..5
println "Range: ${range}"

// Iterate over range
range.each { number ->
    println "Number: ${number}"
}

// Check if value is within range
println "4 in range: ${4 in range}"
println "6 in range: ${6 in range}"

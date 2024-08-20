// Control_Structures.groovy

// if-else
def num = 10
if (num > 0) {
    println "The number is positive."
} else if (num < 0) {
    println "The number is negative."
} else {
    println "The number is zero."
}

// switch
def day = 3
switch (day) {
    case 1:
        println "Monday"
        break
    case 2:
        println "Tuesday"
        break
    case 3:
        println "Wednesday"
        break
    default:
        println "Other day"
        break
}

// for loop
println "For loop:"
for (i in 1..5) {
    println "i = ${i}"
}

// while loop
println "While loop:"
def count = 0
while (count < 5) {
    println "count = ${count}"
    count++
}

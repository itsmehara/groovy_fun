// File: TryCatchExample3.groovy
def readArrayElement(int[] array, int index) {
    try {
        println "Element at index $index: ${array[index]}"
    } catch (ArrayIndexOutOfBoundsException e) {
        println "Error: Index out of bounds."
    } catch (Exception e) {
        println "An unexpected error occurred."
    }
}

readArrayElement([1, 2, 3], 1)  // This will print: Element at index 1: 2
readArrayElement([1, 2, 3], 5)  // This will print: Error: Index out of bounds.

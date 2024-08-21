// File: TryCatchExample2.groovy
def processFile(String filename) {
    try {
        def file = new File(filename)
        def content = file.text
        println content
    } catch (FileNotFoundException e) {
        println "Error: File not found."
    } catch (IOException e) {
        println "Error: I/O error occurred."
    }
}

processFile("existentFile.txt")  // Handle file reading
processFile("nonExistentFile.txt")  // This will print: Error: File not found.

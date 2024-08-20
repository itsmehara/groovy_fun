// Reading_File_In_Closure.groovy

// Define a closure that reads a file
def readFile = {
    def file = new File("data/sample_data.txt")
    file.eachLine { line ->
        println line
    }
}

// Call the closure
readFile()

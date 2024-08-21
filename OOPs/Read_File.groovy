// Read_File.groovy

// Define a class with a method to read a file
class FileReader {
    String filePath

    void readFile() {
        def file = new File(filePath)
        file.eachLine { line ->
            println line
        }
    }
}

// Create an instance of FileReader
def reader = new FileReader(filePath: "data/sample_data.txt")
reader.readFile()

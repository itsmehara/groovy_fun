// Read from data/sample_data.txt
def file = new File("data/sample_data.txt")
file.eachLine { line ->
    println line
}

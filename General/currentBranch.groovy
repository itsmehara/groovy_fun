
// Read current branch name from current process of git.

def getCurrentGitBranchV1() {
    def branchName = new File('.git/HEAD').text.trim().split(':')[1].trim()
    return branchName
}

// Or using the git command:

def getCurrentGitBranchV2() {
    def branchName = 'git rev-parse --abbrev-ref HEAD'.execute().text.trim()
    return branchName
}

def getCurrentGitBranchV12() {
    def headFile = new File('.git/HEAD')
    
    // Check if .git/HEAD file exists
    if (!headFile.exists()) {
        echo "Error: .git/HEAD file does not exist."
        return null
    }
    
    // Extract branch name from the file
    def branchName = headFile.text.trim().split(':')[1]?.trim()
    if (!branchName) {
        echo "Error: Unable to determine branch name."
        return null
    }
    return branchName
}

def getCurrentGitBranchV22() {
    def process = 'git rev-parse --abbrev-ref HEAD'.execute()
    
    // Get the branch name from the command output
    def branchName = process.text.trim()
    if (process.exitValue() != 0 || branchName.isEmpty()) {
        echo "Error: Failed to get branch name using git command."
        return null
    }
    return branchName
}

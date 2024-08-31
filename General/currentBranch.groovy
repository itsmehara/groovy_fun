
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

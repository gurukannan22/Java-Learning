# Git & GitHub 

## 1. Introduction to Git
Git is a version control system that helps developers track changes in their code, collaborate with others, and manage different versions of a project efficiently.

### Why Use Git?
- Tracks changes in files over time.
- Allows collaboration among multiple developers.
- Helps in managing different versions of a project.
- Prevents accidental loss of code.

## 2. Basic Git Commands

### Setting Up Git
1. **Check if Git is installed:**
   ```bash
   git --version
   ```
2. **Configure Git (set username & email):**
   ```bash
   git config --global user.name "Your Name"
   git config --global user.email "your-email@example.com"
   ```

### Creating and Initializing a Repository
1. **Initialize a new repository:**
   ```bash
   git init
   ```
2. **Clone an existing repository:**
   ```bash
   git clone repository_url
   ```

### Staging and Committing Changes
1. **Check repository status:**
   ```bash
   git status
   ```
2. **Add files to the staging area:**
   ```bash
   git add file_name
   ```
   - To add all files:
     ```bash
     git add .
     ```
3. **Commit changes with a message:**
   ```bash
   git commit -m "Your commit message"
   ```

### Viewing Changes and History
1. **View commit history:**
   ```bash
   git log
   ```
2. **View changes made in files:**
   ```bash
   git diff
   ```

### Working with Branches
1. **Create a new branch:**
   ```bash
   git branch branch_name
   ```
2. **Switch to a different branch:**
   ```bash
   git checkout branch_name
   ```
3. **Merge a branch into the main branch:**
   ```bash
   git merge branch_name
   ```

### Undoing Changes
1. **Undo changes before committing:**
   ```bash
   git checkout -- file_name
   ```
2. **Undo the last commit:**
   ```bash
   git reset HEAD~1
   ```
3. **Remove a file from the staging area:**
   ```bash
   git restore --staged file_name
   ```

## 3. Working with GitHub
GitHub is a platform that hosts Git repositories and allows collaborative development.

### Connecting Git to GitHub
1. **Add a remote repository:**
   ```bash
   git remote add origin https://github.com/your-username/repository.git
   ```
2. **Verify remote repository:**
   ```bash
   git remote -v
   ```

### Pushing and Pulling Code
1. **Push local commits to GitHub:**
   ```bash
   git push origin branch_name
   ```
2. **Pull latest changes from GitHub:**
   ```bash
   git pull origin branch_name
   ```

### Forking and Cloning a Repository
1. **Fork a repository on GitHub (creates a copy in your account).**
2. **Clone the forked repository to your local machine:**
   ```bash
   git clone repository_url
   ```

### Creating a Pull Request
1. Push your changes to your GitHub repository.
2. Go to the original repository and click "New Pull Request."
3. Provide details and submit the request for review.

## 4. Best Practices
- Always write meaningful commit messages.
- Use branches for new features or bug fixes.
- Regularly pull updates from the main repository.
- Resolve merge conflicts carefully.
- Use `.gitignore` to exclude unnecessary files.

---
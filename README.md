## 🛠️ Tech Stack

| Technology | Version/Detail |
|------------|----------------|
| **Language** | Java 21 |
| **IDE** | IntelliJ IDEA Community Edition |
| **Data Structures** | ArrayList, Scanner |
| **Paradigm** | Object-Oriented Design |

## 🚀 Quick Start - IntelliJ IDEA Community + Java 21

### 1. Prerequisites

# Install Java 21 JDK
# Download from: https://adoptium.net/ or Oracle
java -version  # Should show: java version "21.x.x"
2. IntelliJ IDEA Setup
text
1. Download IntelliJ IDEA Community Edition: https://www.jetbrains.com/idea/download/
2. Open IntelliJ → Open → Select this project folder
3. File → Project Structure → Project Settings:
   - Project SDK: Select Java 21
   - Project language level: 21
   - Module SDK: Java 21
4. Run → Run 'Main'
3. Command Line (Alternative)
bash
javac -d . src/com/codeAlpha/gradetracker/*.java
java -cp . com.codeAlpha.gradetracker.Main
📊 Sample Output
Welcome Screen:

text
╔════════════════════════════════════════╗
║   STUDENT GRADE TRACKER - CodeAlpha    ║
╚════════════════════════════════════════╝
Student Details:

text
╔════════════════════════════════════════╗
║           Student Details              ║
╚════════════════════════════════════════╝
Student Name: John Doe
Student Grades: [85.0, 92.0, 78.0]
Student Highest Grade: 92.0
Student Average Grade: 85.0
Student Lowest Grade: 78.0
Student Grade Category: A
Summary Report:

text
🏆 Top Performer: Jane Smith (Average: 94.33)
📊 Grade Distribution:
A+: 2 | A: 3 | B+: 1 | B: 2 | C: 1 | D: 0 | F: 0
🏗️ Project Structure
text
gradetracker/
├── src/
│   └── com/
│       └── codeAlpha/
│           └── gradetracker/
│               ├── Student.java     # Model + Calculations
│               ├── GradeTracker.java # Core Logic
│               └── Main.java        # Entry Point
├── .gitignore              # IDE files
└── gradetracker.iml       # IntelliJ module
🎯 Grading Scale
Average Range	Grade
90-100	A+
80-89	A
70-79	B+
60-69	B
50-59	C
40-49	D
30-39	E
0-29	F
🔍 Key Classes
Student.java
Grade validation (0-100)

Calculations: average, max, min

Grade categorization logic

Formatted display

GradeTracker.java
Student list management

Input validation helpers

Class analytics (average, topper)

Search functionality

Main.java
Interactive menu loop

ASCII art welcome screen

Switch-case navigation

💻 IntelliJ IDEA Community Edition Setup
Install Java 21 (Adoptium Temurin recommended)

Open Project → File → Open → Select folder

Configure SDK:

text
File → Project Structure (Ctrl+Alt+Shift+S)
→ Project SDK → Add SDK → JDK → Path/to/Java21
→ Language level: 21
Run: Right-click Main.java → Run 'Main.main()'

🔧 Build Configuration
IntelliJ Run Configuration:

text
Main class: com.codeAlpha.gradetracker.Main
VM options: -Xmx512m
JRE: Project SDK (Java 21)
🎯 Future Enhancements
text
- [ ] File persistence (JSON/CSV)
- [ ] JavaFX GUI
- [ ] Database integration
- [ ] REST API (Spring Boot)
- [ ] JUnit 5 tests
- [ ] Maven/Gradle build
🐛 Known Limitations
In-memory storage only

Console-based UI

Topper method creates new Student object

📈 Why This Project?
Perfect for:

Java 21 practice [web:1]

OOP concepts demonstration

Console app development

Algorithm implementation

Job interview portfolio

🙌 Acknowledgments
CodeAlpha - Learning platform

IntelliJ IDEA Community - Free IDE [web:5]

Built with ❤️ using Java 21

Java 21 • IntelliJ IDEA Community • Grade Tracking Excellence 🎓

package com.codeAlpha.gradetracker;

import java.util.*;

public class GradeTracker
{
    public Scanner scanner;
    final private List<Student> studentList;
    public GradeTracker(Scanner scanner){
        this.studentList = new ArrayList<>();
        this.scanner = scanner;
    }

    public List<Student> getStudentList(){
        return studentList;
    }

    public void addStudent(){
        scanner.nextLine();

        System.out.println("Enter name of Student: ");
        final String studentName = scanner.nextLine().trim();
        Student student = new Student(studentName);

        System.out.println("Enter number of Subjects: ");
        final int numberOfSubjects = readInt();
        if (numberOfSubjects > 0){
            for (int i = 1; i <= numberOfSubjects; i++){
                System.out.println("Enter Grade (0-100) for subject " + i + ": ");
                double grade = readDouble();
                student.addGrade(grade);
            }
            studentList.add(student);
            studentList.forEach(s -> { if (s.getName().equals(studentName)) System.out.println("\n✓Student of Name: " + student.getName() + " added successfully.");});
        }
    }

    private int readInt() {
        while (!scanner.hasNext()){
            System.out.println("Please enter a valid number!");
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    private double readDouble(){
        while (!scanner.hasNext()){
            System.out.println("Please enter a valid grade!");
            scanner.next();
        }
        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public void displayAllStudents(){
        if (studentList.isEmpty()){
            System.out.println("No students added yet!");
        }else {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║         ALL STUDENTS REPORT            ║");
            System.out.println("╚════════════════════════════════════════╝");
            // Display all student details
            studentList.forEach(Student::displayInfo);
        }
    }


    public void displaySummaryReport() {
        if (this.studentList.isEmpty()){
            System.out.println("No students added yet!");
        } else {
            System.out.println("\n╔════════════════════════════════════════╗");
            System.out.println("║          SUMMARY REPORT                ║");
            System.out.println("╚════════════════════════════════════════╝");

            System.out.println("Total Students: " + studentList.size());

            // Average grade of class
            final double averageOfClass = this.findAverageOfClass();
            System.out.println("Class Average: " + String.format("%.2f", averageOfClass));

            // Topper Student of class
            final Student topper = this.findTopperStudentOfClass();
            System.out.println("\n🏆 Top Performer: " + topper.getName() +
                    " (Average: " + String.format("%.2f", topper.calculateAverage()) + ")");

            // Each grade count from overall class
            int APlus=0, A=0, BPlus=0, B=0, C=0, D=0, E=0, F=0;
            for (Student student : studentList){
                String gradeCategory = student.getGradeCategory();
                switch(gradeCategory){
                    case "A+": APlus++; break;
                    case "A": A++; break;
                    case "B+": BPlus++; break;
                    case "B": B++; break;
                    case "C": C++; break;
                    case "D": D++; break;
                    case "E": E++; break;
                    case "F": F++; break;
                }
            }
            System.out.println("\n📊 Grade Distribution:");
            System.out.println("A+: " + APlus + " | A: " + A + " | B+: " + BPlus +
                    " | B: " + B + " | C: " + C + " | D: " + D + " | F: " + F);
        }

    }

    // to find average grade of the class from (0-100)
    public double findAverageOfClass() {
        double sumOfStudentsGrade = 0.0;
        double totalNumberOfStudentsInClass = studentList.size();

        for (Student student : studentList){
            double averageGrade = student.getAverageGrade();
            sumOfStudentsGrade += averageGrade;
        } double averageGradeOfStudents = sumOfStudentsGrade/totalNumberOfStudentsInClass;
        return averageGradeOfStudents;
    }

    // To find topper student of the class
    public Student findTopperStudentOfClass() {
        Student topper = null;
        double topperStudentGrade = this.studentList.getFirst().getAverageGrade();

        String topperName = "";
        for (Student student : studentList){
            double averageGradeOfCurrentStudent = student.getAverageGrade();
            if (topperStudentGrade < averageGradeOfCurrentStudent){
                topperStudentGrade = averageGradeOfCurrentStudent;
                topperName = student.getName();
            }
        } topper = new Student(topperName);
        return topper;
    }

    public void showStudents(){
        studentList.forEach(Student::displayInfo);
    }

    public void searchStudent() {
        scanner.nextLine();
        if (studentList.isEmpty()){
            System.out.println("List is empty!! ");
            return;
        }
        System.out.println("Enter Student name to search: ");
        String studentName = scanner.nextLine().trim();

        for (Student student : studentList) {
            if (student.getName().equals(studentName)){
                student.displayInfo();
                return;
            }
        }
        System.out.println("student not found!");
    }
}

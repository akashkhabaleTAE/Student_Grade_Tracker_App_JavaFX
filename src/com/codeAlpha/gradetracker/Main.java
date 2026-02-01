package com.codeAlpha.gradetracker;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeTracker gradeTracker = new GradeTracker(scanner);

        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   STUDENT GRADE TRACKER - CodeAlpha    ║");
        System.out.println("╚════════════════════════════════════════╝");

        while (true){
            printMenu();

            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> gradeTracker.addStudent();
                case 2 -> gradeTracker.searchStudent();
                case 3 -> gradeTracker.displayAllStudents();
                case 4 ->gradeTracker.displaySummaryReport();
                case 5 ->{
                        System.out.println("\n\uD83D\uDC4B Thank you for using Student Grade Tracker!");
                    scanner.close();
                    return; // Exits the main method calmly and gracefully.
                }
                case 6 ->gradeTracker.showStudents();
                default -> System.out.println("Invalid choice! Please try again");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n============MENU============");
        System.out.println("1. Add new Student");
        System.out.println("2. Search Student");
        System.out.println("3. Display All Students");
        System.out.println("4. Display Summary Report");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
    }
}
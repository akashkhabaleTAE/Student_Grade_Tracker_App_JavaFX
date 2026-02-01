package com.codeAlpha.gradetracker;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Double> gradeList;

    public Student(){}
    public Student(String name){
        this.name = name;
        this.gradeList = new ArrayList<>();
    }

    @Override
    public String toString(){
        return "student[name= " + name + ", gradeList= " + gradeList + "]" ;
    }
    public String getName() {
        return name;
    }

    public List<Double> getGradeList() {
        return gradeList;
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 100) this.gradeList.add(grade);
    }

    public double calculateAverage() {
        if (this.gradeList.isEmpty()) return 0.0;
        double sum = 0.0;
        double totalNumberOfGrades = gradeList.size();
        for (double grade : gradeList) sum += grade;
        return sum/ totalNumberOfGrades;
    }

    public double getHighestGrade() {
        if (gradeList.isEmpty()) return 0.0;
        double highestGrade = this.gradeList.getFirst();
        for (double grade : gradeList){
            if (grade > highestGrade) highestGrade = grade;
        } return highestGrade;
    }

    public double getLowestGrade(){
        if (gradeList.isEmpty()) return 0.0;
        double lowestGrade = this.gradeList.getFirst();
        for (double grade : gradeList){
            if (grade < lowestGrade) lowestGrade = grade;
        } return lowestGrade;
    }

    public String getGradeCategory()
    {
        double average = this.calculateAverage();
        String gradeCategory;
        if (average >= 90){
            gradeCategory = "A+";
        }else if (average >= 80){
            gradeCategory = "A";
        } else if (average >= 70){
            gradeCategory = "B+";
        } else if (average >= 60) {
            gradeCategory = "B";
        } else if (average >= 50) {
            gradeCategory = "C";
        }else if (average >= 40){
            gradeCategory = "D";
        }else if (average >= 30){
            gradeCategory = "E";
        }else {
            gradeCategory = "F";
        }
        return gradeCategory;
    }

    public double getAverageGrade() {
        return this.calculateAverage();
    }

    public void displayInfo(){
        System.out.println("\n==========================================");
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║           Student Details              ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Student Name: " + this.getName());
        System.out.println("Student Grades: " + this.getGradeList());
        System.out.println("Student Highest Grade: " +this.getHighestGrade());
        System.out.println("Student Average Grade: " + this.getAverageGrade());
        System.out.println("Student Lowest Grade: " + this.getLowestGrade());
        System.out.println("Student Grade Category: " + this.getGradeCategory());
        System.out.println("==========================================");
    }
}

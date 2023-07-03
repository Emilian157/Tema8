package org.fasttrackit.tema8.exercise4;

public class Student {
    private String name;
    private double grade;
    private static int totalStudents = 0;
    private static double totalGrades = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
        totalGrades += grade;
        totalStudents++;
    }

    public void getName() {
        System.out.println(name);
    }

    public void getGrade() {
        System.out.println(grade);
    }

    public static double averageGrade(){
        if(totalStudents != 0){
            return totalGrades / totalStudents;
        } else {
            return 0.0;
        }
    }
}

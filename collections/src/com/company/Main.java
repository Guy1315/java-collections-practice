package com.company;

import java.util.Vector;
import java.util.HashMap;
import java.util.Scanner;
import static java.lang.System.out;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    private static Student getNewStudent(String name, int coursesNumber) {
        Student student = new Student(name, new HashMap<>());

        for (int i = 0; i < coursesNumber; i++) {
            out.println("Enter course name: ");
            String courseName = scanner.next();
            HashMap<Integer, Integer> grades = new HashMap<>();
            grades.put(1, 61);
            student.addCourse(new Course(courseName, grades));
        }

        return student;
    }

    private static void printFirstTryPasses(Student student) {
        Vector<Course> courses = student.firstTryPass();
        out.println(String.format("First try passes: %s", courses.size()));
        out.println(String.format("Courses list: %s", courses.toString()));
    }

    private static void gradeSet(Student student) {
        HashMap<Integer, Integer> grades = new HashMap<>();
        grades.put(1, 65);
        student.addCourse(new Course("Math", grades));

        grades.put(1, 59);
        grades.put(2, 99);
        student.addCourse(new Course("Web", grades));

        grades.put(1, 65);
        student.addCourse(new Course("Data structs", grades));
    }

    public static void main(String... args) {
        out.println("Enter student name and then number of courses");

        String name = scanner.next();
        int coursesNumber = scanner.nextInt();

        Student student = getNewStudent(name, coursesNumber);
        gradeSet(student);

        printFirstTryPasses(student);
    }
}
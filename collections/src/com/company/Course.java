package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Course {

    private String courseName;
    private Map<Integer, Integer> grades;

    public Course(String courseName, HashMap<Integer, Integer> grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Map<Integer, Integer> getGrades() {
        return grades;
    }

    public void setGrades(HashMap<Integer, Integer> grades) {
        this.grades = grades;
    }
    public void addGrade(int grade) {
        grades.put(grades.size() + 1, grade);
    }

    public boolean didPassFirst() {
        if (grades != null)
            return grades.get(1) > 60 && grades.size() == 1;

        return false;
    }

    private int Highest() {
        int max = -1;

        for (int index: grades.values()) {
            if (index > max)
                max = index;
        }

        return max;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", grades=" + grades +
                '}';
    }
}

package com.company;

import java.util.Vector;
import java.util.*;
import java.util.Map;
import java.util.e

public class Student {
    private String name;
    private Map<String, Course> courseData;

    public Student(String name, HashMap<String, Course> courseData) {
        this.name = name;
        this.courseData = courseData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Course> getCourseData() {
        return courseData;
    }

    public void setCourseData(Map<String, Course> courseData) {
        this.courseData = courseData;
    }

    public courseGrade(Course courseName) throws exception
    {

    }
    public void addCourse(Course c) {
        courseData.put(c.getCourseName(), c);
    }
    public Vector<Course> firstTryPass() {
        Vector<Course> passedFirst = new Vector<>();

        for (Course c: courseData.values()) {
            if (c.didPassFirst())
                passedFirst.add(c);
        }

        return passedFirst;
    }
}
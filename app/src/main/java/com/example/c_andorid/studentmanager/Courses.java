package com.example.c_andorid.studentmanager;

import java.io.Serializable;

/**
 * Created by c-andorid on 12/28/2017.
 */

public class Courses implements Serializable {

    public String kCourseName;
    public String kCourseDuration;
    public String kCourseStartYear;
    public String kCoursePassingYear;
    public String kCourseGrade;

    public Courses(String kCourseName, String kCourseDuration, String kCourseStartYear, String kCoursePassingYear, String kCourseGrade) {
        this.kCourseName = kCourseName;
        this.kCourseDuration = kCourseDuration;
        this.kCourseStartYear = kCourseStartYear;
        this.kCoursePassingYear = kCoursePassingYear;
        this.kCourseGrade = kCourseGrade;
    }

    public String getkCourseName() {
        return kCourseName;
    }

    public String getkCourseDuration() {
        return kCourseDuration;
    }

    public String getkCourseStartYear() {
        return kCourseStartYear;
    }

    public String getkCoursePassingYear() {
        return kCoursePassingYear;
    }

    public String getkCourseGrade() {
        return kCourseGrade;
    }

    public void setkCourseName(String kCourseName) {
        this.kCourseName = kCourseName;
    }

    public void setkCourseDuration(String kCourseDuration) {
        this.kCourseDuration = kCourseDuration;
    }

    public void setkCourseStartYear(String kCourseStartYear) {
        this.kCourseStartYear = kCourseStartYear;
    }

    public void setkCoursePassingYear(String kCoursePassingYear) {
        this.kCoursePassingYear = kCoursePassingYear;
    }

    public void setkCourseGrade(String kCourseGrade) {
        this.kCourseGrade = kCourseGrade;
    }
}

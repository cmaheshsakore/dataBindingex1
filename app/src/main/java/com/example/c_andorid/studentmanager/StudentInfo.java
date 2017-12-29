package com.example.c_andorid.studentmanager;

/**
 * Created by c-andorid on 12/28/2017.
 */

public class StudentInfo {

    int pic;
    String name;
    String address;

    String phoneOne;
    String phoneTwo;
    String phoneThree;

    String courseName;
    String courseDuration;
    String courseYear;
    String courseGrade;

    public StudentInfo(int pic, String name, String address, String phoneOne, String phoneTwo, String phoneThree, String courseName, String courseDuration, String courseYear, String courseGrade) {

        this.pic = pic;
        this.name = name;
        this.address = address;

        this.phoneOne = phoneOne;
        this.phoneTwo = phoneTwo;
        this.phoneThree = phoneThree;

        this.courseName = courseName;
        this.courseDuration = courseDuration;
        this.courseYear = courseYear;
        this.courseGrade = courseGrade;
    }

    public int getPic() {
        return pic;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {this.address = address;}

    public void setPhoneOne(String phoneOne) {this.phoneOne = phoneOne;}

    public void setPhoneTwo(String phoneTwo) {
        this.phoneTwo = phoneTwo;
    }

    public void setPhoneThree(String phoneThree) {
        this.phoneThree = phoneThree;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseDuration(String courseDuration) {
        this.courseDuration = courseDuration;
    }

    public void setCourseYear(String courseYear) {
        this.courseYear = courseYear;
    }

    public void setCourseGrade(String courseGrade) {
        this.courseGrade = courseGrade;
    }

    public String getPhoneTwo() {

        return phoneTwo;
    }

    public String getPhoneThree() {
        return phoneThree;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseDuration() {
        return courseDuration;
    }

    public String getCourseYear() {
        return courseYear;
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getPhoneOne() {

        return phoneOne;
    }
}

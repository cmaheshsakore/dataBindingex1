package com.example.c_andorid.studentmanager;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by c-andorid on 12/28/2017.
 */

public class Student implements Serializable {

    public int kStudentProfile;
    public int kStudentId;
    public String kStudentFirstName;
    public String kStudentLastName;
    public String kStudentAddress;
    public ArrayList<String> kStudentContactsNumbers;
    public ArrayList<Courses> kStudentCourses;

    public Student(int kStudentProfile,int kStudentId, String kStudentFirstName, String kStudentLastName, String kStudentAddress, ArrayList<String> kStudentContactsNumbers, ArrayList<Courses> kStudentCourses) {
        this.kStudentProfile = kStudentProfile;
        this.kStudentId = kStudentId;
        this.kStudentFirstName = kStudentFirstName;
        this.kStudentLastName = kStudentLastName;
        this.kStudentAddress = kStudentAddress;
        this.kStudentContactsNumbers = kStudentContactsNumbers;
        this.kStudentCourses = kStudentCourses;
    }

    public int getkStudentProfile() {

        return kStudentProfile;
    }

    public int getkStudentId() {
        return kStudentId;
    }

    public String getkStudentFirstName() {
        return kStudentFirstName;
    }

    public String getkStudentLastName() {
        return kStudentLastName;
    }

    public String getkStudentAddress() {
        return kStudentAddress;
    }

    public ArrayList<String> getkStudentContactsNumbers() {
        return kStudentContactsNumbers;
    }

    public ArrayList<Courses> getkStudentCourses() {
        return kStudentCourses;
    }

    public void setkStudentProfile(int kStudentProfile) {
        this.kStudentProfile = kStudentProfile;
    }

    public void setkStudentId(int kStudentId) {
        this.kStudentId = kStudentId;
    }

    public void setkStudentFirstName(String kStudentFirstName) {
        this.kStudentFirstName = kStudentFirstName;
    }

    public void setkStudentLastName(String kStudentLastName) {
        this.kStudentLastName = kStudentLastName;
    }

    public void setkStudentAddress(String kStudentAddress) {
        this.kStudentAddress = kStudentAddress;
    }

    public void setkStudentContactsNumbers(ArrayList<String> kStudentContactsNumbers) {
        this.kStudentContactsNumbers = kStudentContactsNumbers;
    }

    public void setkStudentCourses(ArrayList<Courses> kStudentCourses) {
        this.kStudentCourses = kStudentCourses;
    }
}

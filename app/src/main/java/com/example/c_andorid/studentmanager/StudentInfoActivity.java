package com.example.c_andorid.studentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import android.view.View;
import android.widget.Toast;
import com.example.c_andorid.studentmanager.databinding.ActivityStudentInfoBinding;

public class StudentInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityStudentInfoBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_student_info);
        Student currentStudent = (Student) getIntent().getSerializableExtra("current_student");
        if (currentStudent == null) {
            Toast.makeText(this,"Student Not Found !",Toast.LENGTH_SHORT).show();
            finish();
        }
        else {
            StudentInfo studentInfo = buildStudentInfo(currentStudent);
            if (studentInfo != null) {binding.setHandler(studentInfo);}
            else {Toast.makeText(this,"Student Not Found !",Toast.LENGTH_SHORT).show();}
        }
    }

    private StudentInfo buildStudentInfo(Student student) {
        if (student != null) {
            String name = student.getkStudentFirstName()+" "+student.getkStudentLastName();
            String[] contacts = new String[student.getkStudentContactsNumbers().size()];
            for (int k=0;k<student.getkStudentContactsNumbers().size();k++) {contacts[k] = student.getkStudentContactsNumbers().get(k);}
            String[] course = {student.getkStudentCourses().get(0).getkCourseName(),student.getkStudentCourses().get(0).getkCourseDuration(),student.getkStudentCourses().get(0).getkCourseStartYear()+" to "+student.getkStudentCourses().get(0).getkCoursePassingYear(),student.getkStudentCourses().get(0).getkCourseGrade()};

            return new StudentInfo(student.getkStudentProfile(),name,student.getkStudentAddress(),contacts[0],contacts[1],contacts[2],course[0],course[1],course[2],course[3]);
        }
        return null;
    }
}

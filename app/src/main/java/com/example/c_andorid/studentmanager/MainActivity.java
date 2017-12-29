package com.example.c_andorid.studentmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> list = new ArrayList<>();
    ListView listView;
    CustomAdapter adapter;
    int position = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("karo_1","before every thing");
        feedArrayList();
        init();
    }

    private void feedArrayList() {

        Log.i("karo_1","before forloop");

        for (int i=0;i<10;i++) {

            Courses coursesTemp = new Courses("Master In Com Sci","2 years","2010","2012","A+");
            ArrayList<Courses> courses= new ArrayList<>();
            courses.add(coursesTemp);
            courses.add(coursesTemp);
            courses.add(coursesTemp);

            ArrayList<String> phoneNo = new ArrayList<>();
            phoneNo.add("+91 1234567890");
            phoneNo.add("+91 1234567890");
            phoneNo.add("+91 1234567890");

            list.add(new Student(R.drawable.image,i,"John","Rambo","USA",phoneNo,courses));
        }

        Log.i("karo_1","Size of the list is : "+list.size());
    }

    private void init() {


        Log.i("karo_1","in init");

        listView = (ListView) findViewById(R.id.list_view);
        /*listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                View parentRow = (View) view.getParent();
                position = listView.getPositionForView(parentRow);
                collectData();
            }
        });*/

        Log.i("karo_1","before set adapter");
        adapter = new CustomAdapter(this,list);
        listView.setAdapter(adapter);
    }

    private void collectData() {
    }
}

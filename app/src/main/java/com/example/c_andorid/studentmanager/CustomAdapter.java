package com.example.c_andorid.studentmanager;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by c-andorid on 12/28/2017.
 */

public class CustomAdapter extends BaseAdapter {

    private ArrayList<Student> list;
    private Context context;
    private LayoutInflater inflater;
    public ViewHandler handler;
    int currentPosition = 0;

    public CustomAdapter(Context context,ArrayList<Student> list) {

        Log.i("karo_1","custom Adapter");
        this.list = list;
        this.context = context;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        Log.i("karo_1","getCount");
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        Log.i("karo_1","get item");
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        Log.i("karo_1","get view");
        if (view == null) {
            view = inflater.inflate(R.layout.custom_layout_view,viewGroup,false);
            handler = new ViewHandler(view);
            view.setTag(handler);
        }
        else {handler = (ViewHandler) view.getTag();}

        Student student = (Student) getItem(i);
        String studentFullName = student.getkStudentFirstName()+" "+student.getkStudentLastName();

        handler.kStudentPic.setImageResource(student.getkStudentProfile());
        handler.kStudentName.setText(studentFullName);
        handler.kStudentAddress.setText(student.getkStudentAddress());

        // setting the onclick listener on the lists view...
        final int pos = i;
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = list.get(pos).getkStudentFirstName()+" "+list.get(pos).getkStudentLastName();
                Student currentStudent = list.get(pos);

                Log.i("kr",name);
                context.startActivity(new Intent(context,StudentInfoActivity.class).putExtra("current_student",currentStudent));
                //context.startActivity(new Intent(context,StudentInfoActivity.class));
                Log.i("kr",list.get(pos).getkStudentCourses().get(0).getkCourseName());

                //currentPosition = pos;
                //Toast.makeText(context,"this is it : "+currentPosition,Toast.LENGTH_SHORT).show();
                //String name = list.get(currentPosition).getkStudentFirstName()+" "+list.get(currentPosition).getkStudentLastName();
                //context.startActivity(new Intent(context,StudentInfo.class).putExtra("image",list.get(currentPosition).getkStudentProfile()).putExtra("name",name).putExtra("address",list.get(currentPosition).getkStudentAddress()));
            }
        });

        return view;
    }

    public class ViewHandler {

        ImageView kStudentPic;
        TextView kStudentName;
        TextView kStudentAddress;

        public ViewHandler(View view) {

            Log.i("karo_1","view handler");

            kStudentPic = (ImageView) view.findViewById(R.id.iv_sprofile);
            kStudentName = (TextView) view.findViewById(R.id.tv_sname);
            kStudentAddress = (TextView) view.findViewById(R.id.tv_saddress);
        }
    }
}

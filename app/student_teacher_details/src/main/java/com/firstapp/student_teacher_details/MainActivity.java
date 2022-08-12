package com.firstapp.student_teacher_details;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
//    String spinnerdataStr;
    String[] names={"Select one---","Student","Teacher"};

    TextView  studentdata,teacherdata;
    EditText sname,smail,sid,tname,tmail,tid;

    HelperClass  helperClass;
    SQLiteDatabase db;

    String snameStr,smailStr,tnameStr,tmailStr;

    int svalue,tvalue;


    ArrayAdapter<String> arrayAdapter;
    LinearLayout l1,l2;


    SQLiteDatabase sqldb;
    Cursor cursor;

//    EditText studentname,rollno,studBranch;
//
//    String studentnameStr,studentBranchStr,tnameStr,tmailStr;
//

//    ArrayList<String> arrayList=new ArrayList<>();
//    ArrayAdapter<String> arrayAdapter1;

//    EditText teachername,teachersno,teachersubject;
//    String teachernameStr,teacherSubjectStr;
//    int value1;

//    ArrayList<String> arrayList2=new ArrayList<>();
//    ArrayAdapter<String> arrayAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner_main);


        sname = findViewById(R.id.stn_name);
        smail = findViewById(R.id.stn_branch);
        sid = findViewById(R.id.stn_roll);

        tname = findViewById(R.id.teacher_name);
        tmail = findViewById(R.id.teacher_sub);


        l1 = findViewById(R.id.linear_l1);

        l2 = findViewById(R.id.linear_l2);


        tid = findViewById(R.id.teacher_sno);


        helperClass = new HelperClass(this);
//        teacherHelper=new TeacherHelper(this);

        sqldb = helperClass.getReadableDatabase();
//        sqldb=teacherHelper.getReadableDatabase();

        l1.setVisibility(View.VISIBLE);
        l2.setVisibility(View.GONE);
        spinner.setOnItemSelectedListener(this);


        arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, names);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {
        Toast.makeText(getApplicationContext(),names[i], Toast.LENGTH_SHORT).show();
        if (names[i]=="Student") {
            l1.setVisibility(View.VISIBLE);
            l2.setVisibility(View.GONE);
        }
        else if(names[i]=="Teacher"){
            l2.setVisibility(View.VISIBLE);
            l1.setVisibility(View.GONE);
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }






//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                Toast.makeText(MainActivity.this, "selected"+spinnerdata[position]+"-", Toast.LENGTH_SHORT).show();
//                spinnerdataStr=spinner.getSelectedItem().toString();
//                if(spinnerdataStr.equals("Student")){
//                    l1.setVisibility(View.VISIBLE);
//                    l2.setVisibility(View.GONE);
//                }
//                else if (spinnerdataStr.equals("Teacher"))
//                {
//                    l2.setVisibility(View.VISIBLE);
//                    l1.setVisibility(View.GONE);
//                }
//            }
//
//


    public void InsertTeacherData(View view)
    {
        tnameStr=tname.getText().toString();
        tmailStr=tmail.getText().toString();
        tvalue=Integer.parseInt(tid.getText().toString());

        long set=helperClass.createTeacherMethod(sqldb,tvalue,tnameStr,tmailStr);
        if(set==-1)
        {
            Toast.makeText(this, "Teacher Record Already Exist", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Teacher new record created successfully", Toast.LENGTH_SHORT).show();
        }
    }

    public void InsertStudentData(View view)
    {
        snameStr=sname.getText().toString();
        smailStr=smail.getText().toString();
        svalue=Integer.parseInt(sid.getText().toString());

        long set=helperClass.createStudentMethod(sqldb,svalue,snameStr,smailStr);
        if(set==-1)
        {
            Toast.makeText(this, "Student Record Already Exist", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Student new record created successfully", Toast.LENGTH_SHORT).show();
        }
    }

    public void nextbtn(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }




}
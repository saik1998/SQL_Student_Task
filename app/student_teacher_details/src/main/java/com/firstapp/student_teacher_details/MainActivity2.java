package com.firstapp.student_teacher_details;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.model.AdapterClass;

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
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner2;

    String[] names={"Select one---","Student","Teacher"};
//    ArrayAdapter<String> arrayAdapter;
//    LinearLayout l3,l4;

    ListView listview2;

    Cursor cursor;

//    EditText studentname,rollno,studBranch;
    HelperClass helperClass;
    SQLiteDatabase db;
    //String studentnameStr,studentBranchStr;
   // int value;

    ArrayList<String> stringArrayList=new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;

    ModelClass modelClassStudent,modelClassTeacher;
    AdpterClass adpterClass;
    List<ModelClass> modelClassList=new ArrayList<>();

//    EditText teachername,sno,teachersubject;
//    HelperClass teacherHelper;
//    String teachernameStr,teacherSubjectStr;
//    int value1;

//    ArrayList<String> arrayList2=new ArrayList<>();
//    ArrayAdapter<String> arrayAdapter2;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner2=findViewById(R.id.spinner_main2);
        listview2=findViewById(R.id.list_view1);

        spinner2.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,names);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter);





    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(getApplicationContext(),names[position], Toast.LENGTH_SHORT).show();

        if (names[position]=="Student")
        {
            studentMethod();
        }
        else if(names[position]=="Teacher")
        {
            teacherMethod();
        }

    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {


    }

    private void studentMethod() {
        modelClassList.clear();

        String[] Col={"Sno","Sname","SMail"};

        helperClass=new HelperClass(this);
        db=helperClass.getReadableDatabase();

        cursor=db.query("StudentTable",Col,null,null,null,null,null);

        if (cursor.getCount()>0 && cursor!=null)
        {
            while (cursor.moveToNext())
            {
                String Name=cursor.getString(1);
                String Mail=cursor.getString(2);

                modelClassStudent=new ModelClass(Name,Mail);
                modelClassList.add(modelClassStudent);

                adpterClass=new AdpterClass(getApplicationContext(),modelClassList);
                listview2.setAdapter(adpterClass);




            }
        }
        else {
            Toast.makeText(this, "No record Found", Toast.LENGTH_SHORT).show();
        }
    }

    private void teacherMethod() {

        modelClassList.clear();

        String[] Col={"Tno","TName","TMail"};

        helperClass=new HelperClass(this);
        db=helperClass.getReadableDatabase();

        cursor=db.query("TeacherTable",Col,null,null,null,null,null);

        if (cursor.getCount()>0 && cursor!=null)
        {
            while (cursor.moveToNext())
            {
                String name=cursor.getString(1);
                String mail=cursor.getString(2);

                modelClassTeacher=new ModelClass(name,mail);
                modelClassList.add(modelClassTeacher);

                adpterClass=new AdpterClass(getApplicationContext(),modelClassList);
                listview2.setAdapter(adpterClass);

            }
        }
        else {
            Toast.makeText(this, "No record Found", Toast.LENGTH_SHORT).show();
        }

    }


}
package com.firstapp.sql_student_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
    }
}







//    private void chinaStates() {
//
//        stateModelList.clear();
//
//        stateModelchina=new StateModel("Shanghai","CHINA CM1",R.drawable.img_3);
//        stateModelList.add(stateModelchina);
//        stateModelchina=new StateModel("Beijing","CHINA CM2",R.drawable.img_4);
//        stateModelList.add(stateModelchina);
//        stateModelchina=new StateModel("Guangzhou","CHINA CM3",R.drawable.img_6);
//        stateModelList.add(stateModelchina);
//        stateModelchina=new StateModel("Shenzhen","CHINA CM4",R.drawable.img_5);
//        stateModelList.add(stateModelchina);
//        stateModelchina=new StateModel("Hangzhou","CHINA CM5",R.drawable.img_2);
//        stateModelList.add(stateModelchina);
//
//        stateAdapter=new StateAdapter(getApplicationContext(),stateModelList);
//        gridView.setAdapter(stateAdapter);
//    }
//
//    private void indiaStates() {
//        stateModelList.clear();
//        stateModelIndia=new StateModel("Andhra Pradesh","CM1",R.drawable.img_3);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("Telengana","CM2",R.drawable.img_5);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("Madhya Pradesh","CM3",R.drawable.img_4);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("Karnataka","CM4",R.drawable.img_6);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("Tamilnadu","CM5",R.drawable.img_2);
//        stateModelList.add(stateModelIndia);
//
//        stateAdapter=new StateAdapter(getApplicationContext(),stateModelList);
//        gridView.setAdapter(stateAdapter);


//        arrayAdapter=new ArrayAdapter<>(this,R.layout.custom_state,stateModelList);
//        gridView.setAdapter(arrayAdapter);
//
//        EditText editText = null;
//        editText.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                arrayAdapter.getFilter().filter(s);
//
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//
////
//            }
//        });
//
//
//    }
//
//    private void australiastates() {
//        stateModelList.clear();
//        stateModelIndia=new StateModel("assam","CM1",R.drawable.img_3);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("vijayawada","CM2",R.drawable.img_5);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel(" gujarat","CM3",R.drawable.img_4);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("kolkata","CM4",R.drawable.img_6);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("maduarai","CM5",R.drawable.img_2);
//        stateModelList.add(stateModelIndia);
//
//        stateAdapter=new StateAdapter(getApplicationContext(),stateModelList);
//        gridView.setAdapter(stateAdapter);
//    }
//
//
//    private void usaStates() {
//        stateModelList.clear();
//        stateModelIndia=new StateModel("Goa ","CM1",R.drawable.img_3);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("kirlampudi","CM2",R.drawable.img_5);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("uttarpradesh","CM3",R.drawable.img_4);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("kerala","CM4",R.drawable.img_6);
//        stateModelList.add(stateModelIndia);
//        stateModelIndia=new StateModel("kashmir","CM5",R.drawable.img_2);
//        stateModelList.add(stateModelIndia);
//
//        stateAdapter=new StateAdapter(getApplicationContext(),stateModelList);
//        gridView.setAdapter(stateAdapter);
//    }
//
//    private void loadCountries() {
//
//        countryModel=new CountryModel("india",R.drawable.img);
//        countryModelList.add(countryModel);
//        countryModel=new CountryModel("china", R.drawable.img_6);
//        countryModelList.add(countryModel);
//
//        countryModel=new CountryModel("australia",R.drawable.img);
//        countryModelList.add(countryModel);
//        countryModel=new CountryModel("usa", R.drawable.img_6);
//        countryModelList.add(countryModel);
//
//
//
//        countryAdapter.notifyDataSetChanged();
//    }
//
//
//    studentSpinner = findViewById(R.id.spinner_student);
//        gridView = findViewById(R.id.list_stu_teacher);
//
//
//        teacherAdapter=new TeacherAdapter(this,teacherModelList,inflater);
//        studentSpinner.setAdapter(teacherAdapter);
//
//        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//            }
//        });
//
//        loadDetails();
//        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//
//
//                Toast.makeText(MainActivity.this, ""+studentModelList.get(i).getStudentname(), Toast.LENGTH_SHORT).show();
//
//
//                if(studentModelList.get(i).getStudentname()=="student")
//                {
//                    studentdetails();
//                }
//                else if(studentModelList.get(i).getTeachername()=="teacher")
//                {
//                    teacherdetails();
//                }
//
//
//
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
//    }
//
//    private void teacherdetails() {
//
//        studentModelArrayList.clear();
//
//        studentdetails=new StudentModel("student1","EEE","1","Teacher1","8184962856","kakinada");
//        studentModelArrayList.add(studentdetails);
//
//        studentdetails=new StudentModel("student2","CES","2","Teacher2","98342962856","Rajamundry");
//        studentModelArrayList.add(studentdetails);
//
//        studentdetails=new StudentModel("student1","Mca","3","Teacher3","3299262856","kadapa");
//        studentModelArrayList.add(studentdetails);
//
//
////        studentdetails=new StudentModel("student1","msc","4","Teacher4","8989962856","vizag");
////        studentModelArrayList.add(studentdetails);
////
////        studentdetails=new StudentModel("student1","bsc","6","Teacher5","9989962856","tuni");
//        studentModelArrayList.add(studentdetails);
//
//
//        studentAdapter=new StudentAdapter(getApplicationContext(),studentModelList);
//        gridView.setAdapter(studentAdapter);
//    }
//
//    private void loadDetails() {
//        studentModel= new StudentModel(R.drawable.img, "teacher");
//        studentModelList.add(studentModel);
//
//        studentModel= new StudentModel(R.drawable.img_1, "student1");
//        studentModelList.add(studentModel);
//
//
//
//
//        teacherAdapter.notifyDataSetChanged();
//    }
//
//
//    private void studentdetails() {
//        studentModelArrayList.clear();
//
//        teacherdetails=new StudentModel(R.id.school_image,"student1");
//        teacherModelList.add(teacherdetails);
//
//        teacherdetails=new StudentModel(R.id.school_image,"Teacher1");
//        teacherModelList.add(teacherdetails);
//
//
//        teacherAdapter=new TeacherAdapter((MainActivity) getApplicationContext(),teacherModelList);
//        gridView.setAdapter(teacherAdapter);
//    }
//
//
//
//
//    }
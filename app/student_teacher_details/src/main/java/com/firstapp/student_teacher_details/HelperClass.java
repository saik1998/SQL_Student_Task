package com.firstapp.student_teacher_details;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class HelperClass extends SQLiteOpenHelper {
    Context context;

    public HelperClass(@Nullable Context context) {
        super(context, "COLLEGEDATABASE.db", null, 2);
        this.context = context;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create Table StudentTable(Sno  Integer primary key ,Sname text,SMail text )");
        Toast.makeText(context, "Student database strated", Toast.LENGTH_SHORT).show();

        db.execSQL("create Table TeacherTable(Tno Integer primary key,Tname text,TMail text)");
        Toast.makeText(context, "teacher database strated", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public long createStudentMethod (SQLiteDatabase sqldb,int sno,String sname,String smail){
        ContentValues cv=new ContentValues();
        cv.put("Sno",sno);
        cv.put("Sname",sname);
        cv.put("SMail",smail);


        long set= sqldb.insert("StudentTable",null,cv);
        return set;
    }

    public long createTeacherMethod(SQLiteDatabase sqldb,int tno,String tname,String tmail)
    {
        ContentValues cv1=new ContentValues();
        cv1.put("Tno",tno);
        cv1.put("TName",tname);
        cv1.put("TMail",tmail);


        long set= sqldb.insert("TeacherTable",null,cv1);
        return set;
    }
    }



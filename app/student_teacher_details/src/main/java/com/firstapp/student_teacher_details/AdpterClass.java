package com.firstapp.student_teacher_details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdpterClass extends BaseAdapter {
    Context context;
    List<ModelClass> modelClassList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public AdpterClass(Context context, List<ModelClass> modelClassList) {
        this.context = context;
        this.modelClassList = modelClassList;

        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return modelClassList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View root=layoutInflater.inflate(R.layout.custom_design,null);
        TextView Name=root.findViewById(R.id.textname);
        TextView Mail=root.findViewById(R.id.textmail);
//        TextView Id=root.findViewById(R.id.textid);


        Name.setText(""+modelClassList.get(i).getName());

        Mail.setText(""+modelClassList.get(i).getMail());

//        Id.setText(""+modelClassList.get(i).getId());


        return root;
    }
}

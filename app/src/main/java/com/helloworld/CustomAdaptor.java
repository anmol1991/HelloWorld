package com.helloworld;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by cdot on 7/4/17.
 */

public class CustomAdaptor extends BaseAdapter {
    List<StudentPresent> studentList;
    Context context;

    public CustomAdaptor(Context context, List<StudentPresent> studentList) {
        this.studentList = studentList;
        this.context = context;
    }
    @Override
    public int getCount() {
        return studentList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            //Toast.makeText(context,"Playing file : " + position,Toast.LENGTH_SHORT).show();
            convertView = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        }
        TextView text1 = (TextView) convertView.findViewById(R.id.text1);
        text1.setText(studentList.get(position).name);
        return convertView;
    }
}

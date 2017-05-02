package com.helloworld;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

/**
 * Created by cdot on 7/4/17.
 */

public class FragmentOne extends Fragment {

    ListView listView;
    //String[] values = new String[] { "Anmol", "Deepak","Rohit", "Sarang"};
    List<StudentPresent> listOfStudent;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragmentone,container,false);
        listView = (ListView)view.findViewById(R.id.students);
        initStudent();
        CustomAdaptor adapter =  new CustomAdaptor(getActivity(),listOfStudent);
        listView.setAdapter(adapter);



        /*ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);*/
        return view;
    }

    public void initStudent(){
        listOfStudent = new ArrayList<StudentPresent>();
        listOfStudent.add(0,new StudentPresent("Anmol","android"));
        listOfStudent.add(1,new StudentPresent("Rahul","android"));
        listOfStudent.add(2,new StudentPresent("Sagar","android"));
    }

}

package com.example.kristhyana.fragmentproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class DetailFrag extends android.app.Fragment {

    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle saveInstanceState){
        super.onActivityCreated(saveInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        return view;
    }

    public void setText(String item){
        TextView view = (TextView) getView().findViewById(R.id.captain);
        view.setText(item);
    }
}

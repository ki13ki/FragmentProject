package com.example.kristhyana.fragmentproject;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.StringReader;
import java.util.ArrayList;


public class ListFrag extends ListFragment {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        String[] values = new String[]{
                "Enterprise", "Star Trek", "Next Generation", "Deep Space 9", "Voyager", "Volley"
        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, values);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(ListView one, View v, int position, long id){
        String item = (String) getListAdapter().getItem(position);
        DetailFrag frag = (DetailFrag) getFragmentManager().findFragmentById(R.id.frag_capt);

        if (frag !=null && frag.isInLayout()){
            frag.setText((getCapt(item)));
        }
    }

    private String getCapt(String ship){
        if (ship.toLowerCase().contains("enterprise")){
            return "Johnathan Archer";
        }
        if (ship.toLowerCase().contains("star trek")){
            return "James T. Kirk";
        }
        if (ship.toLowerCase().contains("next generation")){
            return "Jean-Luc Picard";
        }
        if (ship.toLowerCase().contains("voyager")){
            return "Kathryn Janeway";
        }
        if (ship.toLowerCase().contains("deep space 9")){
            return "Benjamin Sisko";
        }
        //if (ship.toLowerCase().contains("volley")){
       // }
        return "???";
    }

}

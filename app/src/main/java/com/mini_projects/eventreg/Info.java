package com.mini_projects.eventreg;

import android.app.Activity;
import android.app.ListActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Info extends Activity {
//    // METHOD 1
//
//    //the list names
//    //formula 1:
//    //String[] names = {"WIFI", "VENUE", "PAYMENT", "TRANSPORT", "CONTACTS"};
//
//    //formula 2: Using Array defined in 'strings.xml'
//    String[] names;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        //setContentView(R.layout.info);
//
//
//        //Array Adapter is responsible for
//            //collecting the variables in string to list view
//            //applying styles to the list view
//        names = getResources().getStringArray(R.array.info_array);

//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_activated_1, names);
//            //adapter = name of adapter object
//            // android.R.layout.simple_list_item_1 = styling
//            //names - database which will be displayed in the list View
//        // Adding adapter object to List View
//        setListAdapter(adapter);
//    }
//    // another method - when item in list view is clicked
//    public void onListItemClick(ListView l, View v, int position, long id)
//    {
//        Toast.makeText(getBaseContext(), "You have clicked " + names[position], Toast.LENGTH_LONG).show();
//    }

    //METHOD 2
    //Using Array defined in 'strings.xml'

    String[] info_names = {
            "WIFI",
            "VENUE",
            "PAYMENT",
            "TRANSPORT",
            "CONTACTS"
    };


    Integer[] imgid = {
            R.drawable.wifi_50,
            R.drawable.arena_50,
            R.drawable.coins_50,
            R.drawable.shuttle_50,
            R.drawable.phone_50,
    };


    ListView infoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        ListAdapter theAdapter = new MyListAdapter(
                this,
                info_names,
                imgid
        );

        infoList = (ListView) findViewById(R.id.infoList);
        infoList.setAdapter(theAdapter);

        //catching clicks
        infoList.setOnItemClickListener(
            new AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                   String ListItemPicked = "You clicked " +
                          String.valueOf(adapterView.getItemAtPosition(position));
                   Toast.makeText(Info.this, ListItemPicked, Toast.LENGTH_SHORT).show();
               }
           });
    }
}

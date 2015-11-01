package com.mini_projects.eventreg;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class Info extends ListActivity {
    String[] names = {"WIFI", "VENUE", "PAYMENT", "TRANSPORT", "CONTACTS"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.info);
        //Array Adapter is responsible for
            //collecting the variables in string to list view
            //applying styles to the list view

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);
            //adapter = name of adapter object
            // android.R.layout.simple_list_item_1 = styling
            //names - database which will be displayed in the list View
        // Adding adapter object to List View
        setListAdapter(adapter);
    }
    // another method - when item in list view is clicked
    public void onListItemClick(ListView l, View v, int position, long id)
    {
        Toast.makeText(getBaseContext(), "You have clicked " +names[position], Toast.LENGTH_LONG).show();
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

}

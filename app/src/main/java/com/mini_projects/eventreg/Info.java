package com.mini_projects.eventreg;

import android.app.ListActivity;
import android.database.DataSetObserver;
import android.os.Bundle;
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


public class Info extends AppCompatActivity {
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);
        String[] names;
        names = getResources().getStringArray(R.array.info_array);

        //// using in built layout
        //ListAdapter theAdapter = new ArrayAdapter<String>(
        // this,
        // android.R.layout.simple_list_item_1,
        //  names
        // );

//        // using customized layout
//        ListAdapter theAdapter = new ArrayAdapter<String>(
//                this,
//                R.layout.listview_row_layout,
//                R.id.textViewTemplate,
//                names
//            );
//
//        // using customized layout
//        ListAdapter theAdapter = new ArrayAdapter<String>(
//                this,
//                R.layout.listview_row_layout,
//                R.id.textViewTemplate,
//                names
//        );

        ListAdapter theAdapter = new MyListAdapter(
                this,
                names
        );

        ListView theListView = (ListView)findViewById(R.id.infoList);
        theListView.setAdapter(theAdapter);

        //catching clicks
        theListView.setOnItemClickListener(new
           AdapterView.OnItemClickListener() {
               @Override
               public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                   String ListItemPicked = "You clicked " +
                           String.valueOf(adapterView.getItemAtPosition(position));
                   Toast.makeText(Info.this, ListItemPicked, Toast.LENGTH_SHORT).show();
               }
           });


    }
}

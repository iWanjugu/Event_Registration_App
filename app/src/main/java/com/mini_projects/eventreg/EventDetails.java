package com.mini_projects.eventreg;

/**
 * Created by iWanjugu on 27/10/2015.
 */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;


public class EventDetails extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_details);

    // Creating on click change activities for a button
    GridLayout firstGridLayout = (GridLayout)findViewById(R.id.gridLayout);
    firstGridLayout.setOnClickListener(this);
    }
    private void grid1click ()
    {
        startActivity(new Intent("android.intent.action.SPEAKERS"));
    }
    public void onClick(View v) {
        switch (v.getId())
        {
            case  R.id.gridLayout:
                grid1click();
                break;
        }
    }
}

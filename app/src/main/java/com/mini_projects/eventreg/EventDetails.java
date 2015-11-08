package com.mini_projects.eventreg;

/**
 * Created by iWanjugu on 27/10/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;


public class EventDetails extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_details);

    // Creating on click change activities for a button
    GridLayout speakerGridLayout = (GridLayout)findViewById(R.id.speakerGrid);
        speakerGridLayout.setOnClickListener(this);
    GridLayout agendaGridLayout = (GridLayout)findViewById(R.id.agendaGrid);
        agendaGridLayout.setOnClickListener(this);
    GridLayout infoGridLayout = (GridLayout)findViewById(R.id.infoGrid);
        infoGridLayout.setOnClickListener(this);
    GridLayout twitterGridLayout = (GridLayout)findViewById(R.id.twitterGrid);
        twitterGridLayout.setOnClickListener(this);
    }


    private void speakerGridclick () {startActivity(new Intent("android.intent.action.SPEAKERS"));}

    private void agendaGridclick () {startActivity(new Intent("android.intent.action.AGENDA"));}

    private void infoGridclick () {startActivity(new Intent("android.intent.action.INFO"));}

    private void twitterGridclick (){startActivity(new Intent("android.intent.action.TWITTER"));
    }

    public void onClick(View v) {
        switch (v.getId())
        {
            case  R.id.speakerGrid:
                speakerGridclick();
                break;

            case  R.id.agendaGrid:
                agendaGridclick();
                break;

            case  R.id.infoGrid:
                infoGridclick();
                break;

            case  R.id.twitterGrid:
                twitterGridclick();
                break;
        }
    }

}

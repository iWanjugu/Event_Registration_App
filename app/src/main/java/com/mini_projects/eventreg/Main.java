package com.mini_projects.eventreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        // Creating on click change activities for a button
        Button googleButton = (Button)findViewById(R.id.googleButton);
        googleButton.setOnClickListener(this);

        Button twitterButton = (Button)findViewById(R.id.twitterButton);
        twitterButton.setOnClickListener(this);

        Button facebookButton = (Button)findViewById(R.id.facebookButton);
        facebookButton.setOnClickListener(this);

        TextView registerTextView = (TextView)findViewById(R.id.registerTextView);
        registerTextView.setOnClickListener(this);
    }
    private void toEventDetailsclick ()
    {
        startActivity(new Intent("android.intent.action.EVENTDETAILS"));
    }
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.googleButton:
                toEventDetailsclick();
                break;

            case R.id.twitterButton:
                toEventDetailsclick();
                break;

            case R.id.facebookButton:
                toEventDetailsclick();
                break;

            case R.id.registerTextView:
                toEventDetailsclick();
                break;
        }
    }
 /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

  @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/
}

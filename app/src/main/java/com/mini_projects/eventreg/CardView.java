package com.mini_projects.eventreg;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by iWanjugu on 09/11/2015.
 */
public class CardView extends Activity {

    TextView speakerName;
    ImageView speakerImage;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cardview);

        speakerName = (TextView)findViewById(R.id.speakerName);
        speakerImage = (ImageView)findViewById(R.id.speakerImage);

        speakerName.setText("Emma Wilson");
        speakerImage.setImageResource(R.drawable.wifi_50);
    }
}


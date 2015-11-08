package com.mini_projects.eventreg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);


//    To make the image rotate on the splash screen
//    New imageview variable
    final ImageView splashImageView = (ImageView) findViewById(R.id.splashImage);

//    New Rotation variable
    final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
//        Fade out effect on the splash as it ends
    final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);


        splashImageView.startAnimation(an);
        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                splashImageView.startAnimation(an2);
                finish();
                Intent i = new Intent(getBaseContext(),Main.class);
                startActivity (i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }
}


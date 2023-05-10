package com.example.randomeveryday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.util.IslamicCalendar;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class RegionmenuActivity extends AppCompatActivity {
    ImageView wheelimg;
    String[] sectors = {"01","02","03","04","05","06"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regionmenu);
        wheelimg = findViewById(R.id.wheel);

        Collections.reverse(Arrays.asList(sectors));
    }
    public void spinWheel(View view) {
        Random rr = new Random();
        int degree = rr.nextInt(360);

        RotateAnimation rotateAnimation = new RotateAnimation(0, degree + 720,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);
        rotateAnimation.setDuration(3000);
        rotateAnimation.setFillAfter(true);
        rotateAnimation.setInterpolator(new DecelerateInterpolator());

        rotateAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                CalculatePoint(degree);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        wheelimg.startAnimation(rotateAnimation);
    }

    public void CalculatePoint(int degree) {
        // total degree 360 !! 12 segment !! 30 degree cach segment
        int initialPoint = 0;
        int endPoint = 30;
        int i = 0;
        String res = null;
        do {
            if (degree > initialPoint && degree < endPoint) {
                res= sectors[1];
            }
            initialPoint += 30; endPoint += 30;
            i++;
        }while(res == null);
}
    public void Thenorthopen (View view){
        Intent Thenorthform =new Intent(this,ThenorthActivity.class);
        startActivity(Thenorthform);
        finish();
    }
    public void Northeasternopen (View view){
        Intent Northeasternform =new Intent(this,NortheasternActivity.class);
        startActivity(Northeasternform);
        finish();
    }
    public void Centralopen (View view){
        Intent Centralform =new Intent(this,CentralActivity.class);
        startActivity(Centralform);
        finish();
    }
    public void Southopen (View view){
        Intent Southform =new Intent(this,SouthActivity.class);
        startActivity(Southform);
        finish();
    }
}


package com.example.randomeveryday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RandomMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_menu);
    }
    public void Cookopen (View view){
        Intent Cookform =new Intent(this,CookActivity.class);
        startActivity(Cookform);
        finish();
    }
    public void Drinkopen (View view){
        Intent Drinkform =new Intent(this,drinkActivity.class);
        startActivity(Drinkform);
        finish();
    }
}
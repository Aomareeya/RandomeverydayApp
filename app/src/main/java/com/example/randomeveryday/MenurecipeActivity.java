package com.example.randomeveryday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenurecipeActivity extends AppCompatActivity {
    public void Recipefooodopen (View view) {
        Intent Recipefoodform = new Intent(this,RecipefoodActivity.class);
        startActivity(Recipefoodform);
        finish();
    }
    public void fryfooodopen (View view) {
        Intent fryfoodform = new Intent(this,fryfoodActivity.class);
        startActivity(fryfoodform);
        finish();
    }
    public void boiledfooodopen (View view) {
        Intent boiledfoodform = new Intent(this,boiledfoodActivity.class);
        startActivity(boiledfoodform);
        finish();
    }
    public void bakedfoodopen (View view) {
        Intent bakedfoodform = new Intent(this,bakedfoodActivity.class);
        startActivity(bakedfoodform);
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menurecipe);
    }
}
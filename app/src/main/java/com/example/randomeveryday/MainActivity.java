package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Athomeopen (View view){
        Intent Athomeform =new Intent(this,Menuhome.class);
        startActivity(Athomeform);
        finish();
    }
    public void Regionmenuopen (View view){
        Intent Regionmenuform =new Intent(this,RegionmenuActivity.class);
        startActivity(Regionmenuform);
        finish();
    }

    public void exit(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("exit");
        builder.setMessage("Do you want to exit");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("no", null);
        builder.setNeutralButton("canel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "cancel", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
}
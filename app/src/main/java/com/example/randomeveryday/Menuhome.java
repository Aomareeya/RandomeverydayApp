package com.example.randomeveryday;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class Menuhome extends AppCompatActivity {
    public ViewPager2 viewPager;
    List<SliderItems> dataList;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuhome);
        viewPager = findViewById(R.id.Viewpager);
        dataList = new ArrayList<>();
        dataList.add(new SliderItems(R.drawable.bitcoin));
        dataList.add(new SliderItems(R.drawable.bnb));
        dataList.add(new SliderItems(R.drawable.stellar));
        dataList.add(new SliderItems(R.drawable.tezos));
        myAdapter =new MyAdapter(dataList,this);
        viewPager.setAdapter(myAdapter);
        java.util.Timer timer = new java.util.Timer();
        timer.scheduleAtFixedRate(new The_slide_timer(),2000,3000);
    }
    public void RandomMenuopen (View view){
        Intent RandomMenuform =new Intent(this,RandomMenu.class);
        startActivity(RandomMenuform);
        finish();
    }


    public class The_slide_timer extends TimerTask {
        @Override
        public void run() {
            Menuhome.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (viewPager.getCurrentItem()< dataList.size()-1) {
                        viewPager.setCurrentItem(viewPager.getCurrentItem()+1);
                    }
                    else
                        viewPager.setCurrentItem(0);
                }
            });
        }
    }//close method
}
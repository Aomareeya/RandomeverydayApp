package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class bakedfoodActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"ไข่เยี่ยวม้ากะเพรากรอบ",};
    int flags[] = {R.drawable.a3, };
    String meaning[] = {"ส่วนประกอบ\n" +
            "ไข่เยี่ยวม้า 1 ฟองผ่า 4 ชิ้น 2 ฟอง\n" +
            "ใบกะเพราเด็ดประมาณ ½ ถ้วยตวง\n" +
            "พริกชี้ฟ้าแดงหั่นแฉลบ 1 เม็ด\n" +
            "น้ำมันสำหรับทอดไข่เยี่ยวม้า และใบกะเพรา\n" +
            "คนอร์อร่อยชัวร์ 1 ½ ช้อนชา\n" +
            "น้ำมันหอย 2 ช้อนโต๊ะ\n" +
            "พริกขี้หนูเขียวแดง 1 ช้อนโต๊ะ\n" +
            "กระเทียม 1 ช้อนโต๊ะ\n" +
            "น้ำมันพืช 24 กรัม\n" +
            "น้ำเปล่า 4 ช้อนโต๊ะ\n" +
            "\n" +
            "\n" +
            "วิธีทำ\n" +
            "นำกระทะตั้งไฟใส่น้ำมัน พอร้อนแบ่งใบกะเพราครึ่งหนึ่งลงไปทอดให้กรอบ แล้วตักขึ้นสะเด็ดน้ำมันพักไว้ จากนั้นนำไข่เยี่ยวม้าลงทอดให้ด้านนอกกรอบ ข้างในนุ่มมีสีเหลืองทองพักไว้\n" +
            "นำกระทะตั้งไฟใสน้ำมัน พอร้อนใส่พริกขี้หนูเขียวแดงโขลกกับกระเทียมลงไปผัดพอหอม\n" +
            "ใส่หมูบด ผัดพอสุกแล้วเติมน้ำ ผัดให้เข้ากันปรุงรสด้วยคนอร์อร่อยชัวร์ และน้ำมันหอยผัดให้เข้ากัน\n" +
            "ใส่พริกชี้ฟ้า และใบกะเพราผัดให้เข้ากันอีกครั้ง จัดเสิร์ฟโดยราดผัดกะเพราลงบนไข่เยี่ยวม้าที่ทอดไว้ โรยหน้าด้วยใบกะเพรากรอบ\n"};
    public void onBackPressed() {
        super.onBackPressed();
        Intent Menurecipeform = new Intent(this, MenurecipeActivity.class);
        startActivity(Menurecipeform);
        finish(); //ปิดหน้าปัจจุบัน
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakedfood);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                AlertDialog.Builder dialogBuilder = new
                        AlertDialog.Builder(view.getRootView().getContext());
                dialogBuilder.setTitle("Meaning:");
                dialogBuilder.setMessage(meaning[i]);
                dialogBuilder.setPositiveButton("Close",null);
                dialogBuilder.show();
            }
        });
    }
}

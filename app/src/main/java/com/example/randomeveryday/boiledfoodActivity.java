package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class boiledfoodActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"แกงพริกกระดูกหมู",};
    int flags[] = {R.drawable.a2, };
    String meaning[] = {"ส่วนประกอบ\n" +
            "กระดูกหมูหั่นชิ้นพอคำ 500 กรัม\n" +
            "น้ำตาลปีบ 2 ช้อนชา\n" +
            "ใบมะกรูดฉีก 5 ใบ\n" +
            "น้ำเปล่า 3 ถ้วยตวง\n" +
            "คนอร์ซุปหมูก้อน 1 ก้อน\n" +
            "น้ำปลา 2 ช้อนโต๊ะ\n" +
            "น้ำตาลปีบ 1 ช้อนโต๊ะ\n" +
            "ใบมะกรูดซอยเส้นบาง พริกชี้ฟ้าซอยสำหรับตกแต่ง\n" +
            "ส่วนประกอบเครื่องเเกง\n" +
            "พริกขี้หนูแห้ง 20 เม็ด\n" +
            "หอมแดง 3 หัว\n" +
            "กระเทียม 1 หัว\n" +
            "ตะไคร้ซอย 2 ต้น\n" +
            "ข่า 5 แว่น\n" +
            "พริกไทยเม็ด 2 ช้อนชา\n" +
            "เกลือป่น ½ ช้อนชา\n" +
            "ขมิ้นหั่น 1 นิ้วหั่นชิ้นเล็กๆ\n" +
            "กะปิ 1 ช้อนโต๊ะ\n" +
            "\n" +
            "วิธีทำ\n" +
            "\n" +
            "โขลกเครื่องแกงทั้งหมดให้ละเอียด พักไว้\n" +
            "เอาน้ำ 2 ถ้วยใส่หม้อตั้งไฟ พอเดือดใส่กระดูกหมู ต้มไฟจนกระดูกหมูสุกและเปื่อยเล็กน้อย ใส่เครื่องแกงที่เตรียมไว้ ใส่น้ำ 1 ถ้วยที่เหลือ\n" +
            "พอเดือดปรุงรสด้วย คนอร์ซุปหมูก้อน น้ำตาลปีบ และน้ำปลา ใบมะกรูดฉีกต้มต่อจนน้ำขลุกขลิก ปิดไฟใส่ใบมะกรูด และพริกชี้ฟ้าซอย ตักใส่ถ้วย เสิร์ฟพร้อมผักเหนาะ (แตงกวา มะเขือเปราะ และผักต่างๆ ตามชอบ)\n"};
    public void onBackPressed() {
        super.onBackPressed();
        Intent Menurecipeform = new Intent(this, MenurecipeActivity.class);
        startActivity(Menurecipeform);
        finish(); //ปิดหน้าปัจจุบัน
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boiledfood);
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

package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class fryfoodActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"ไก่ผัดเม็ดมะม่วงหิมพาน",};
    int flags[] = {R.drawable.a1, };
    String meaning[] = {"ส่วนประกอบ\n" +
            "เนื้อสันในไก่หั่นชิ้นพอคำ 1 ½ ถ้วยตวง (300 กรัม)\n" +
            "เม็ดมะม่วงหิมพานต์ทอดกรอบ ½ ถ้วยตวง\n" +
            "พริกแห้งหั่นเป็นท่อนทอดกรอบ 5 เม็ด\n" +
            "เห็ดฟางผ่าครึ่ง 50 กรัม\n" +
            "หัวหอมใหญ่หั่นเต๋า 50 กรัม\n" +
            "ต้นหอมหั่นทอน 2 ต้น\n" +
            "น้ำมันหอย 2 ช้อนโต๊ะ\n" +
            "น้ำมันงา ¼ ช้อนชา\n" +
            "กระเทียมสับ 1 ช้อนโต๊ะ\n" +
            "คนอร์อร่อยชัวร์รสไก่ 1 ช้อนชา\n" +
            "น้ำเปล่า 2 ช้อนโต๊ะ\n" +
            "แป้งสาลีเล็กน้อย, น้ำมันสำหรับทอด\n" +
            "ซีอิ๊วขาว น้ำตาล น้ำมันสำหรับผัด\n" +
            "วิธีทำ\n" +
            "คลุกเนื้อไก่กับแป้งสาลีแล้วนำไปทอด พอไก่เริ่มมีสีเหลืองตักขึ้นพักไว้\n" +
            "ตั้งกระทะใส่น้ำมันพอร้อน ใส่กระเทียมลงผัดให้เหลือง ใส่เนื้อไก่ที่ทอดไว้ลงผัด ใส่หัวหอมใหญ่เติมน้ำเล็กน้อย\n" +
            "ปรุงรสด้วยคนอร์อร่อยชัวร์รสไก่ น้ำมันหอย ซีอิ๊วขาว และน้ำตาลทราย เสร็จแล้วใส่เห็ดผัดให้เข้ากัน\n" +
            "พอเห็ดสุกใส่น้ำมันงา เม็ดมะม่วงหิมพานต์ และพริกทอดผัดพอเข้ากัน ปิดไฟ ใส่ต้นหอมผัดพอเข้ากันอีกครั้งแล้วตักใส่จานพร้อมเสิร์ฟ\n"};
    public void onBackPressed() {
        super.onBackPressed();
        Intent Menurecipeform = new Intent(this, MenurecipeActivity.class);
        startActivity(Menurecipeform);
        finish(); //ปิดหน้าปัจจุบัน
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fryfood);
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

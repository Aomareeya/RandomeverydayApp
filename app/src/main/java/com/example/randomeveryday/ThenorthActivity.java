package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;

public class ThenorthActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thenorth);

    }
    public void Synopsis (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("โครงการพระราชดำริปางตอง 2 ปางอุ๋ง (แม่ฮ่องสอน)");
        builder.setMessage("เป็นที่เที่ยวที่สวยงามเสียจนได้ชื่อว่า “สวิสเซอร์แลนด์แห่งเมืองไทยเลยทีเดียวมีอ่างเก็บน้ำอยู่ตรงกลาง ล้อมรอบไปด้วยป่าสนสองใบ สนสามใบและดอกไม้เมืองหนาว  ช่วงเช้า ๆ จะเห็นหมอกหนาลอยอยู่บนผืนน้ำ เป็นที่มาของชื่อปางอุ๋งนั่นเอง มีหงส์ขาวและหงส์ดำที่ว่ายน้ำเล่นไปมาเป็นฉากหลัง อากาศหนาวเย็น บรรยากาศโรแมนติกสุด ๆ ไปเลย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis2 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("บ้านรักไทย (แม่ฮ่องสอน)");
        builder.setMessage("เป็นพื้นที่ที่เหมาะสมกับการปลูกชาพันธุ์ดีและพืชเมืองหนาว ทิวทัศน์ของ หมู่บ้านโอบล้อมไปด้วยทิวเขาสูงสลับซับซ้อน ทำให้อากาศเย็นสบายตลอดทั้งปี มีทะเลสาบกลางหมู่บ้าน บ้านเรือนที่ปลูกก็เป็นแบบจีน ดูสวยงามแปลกตา มีมุมให้ถ่ายรูปสวย ๆ เพียบ ทั้งไร่ชา กำแพงเมืองจีนจำลอง หรือจะนึกสนุกใส่ชุดจีนโบราณถ่ายรูปชิค ๆ ก็ดูน่าสนุกไปอีก");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis3 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดพระธาตุดอยสุเทพ (เชียงใหม่)");
        builder.setMessage("ตั้งอยู่ทางทิศตะวันตกของเมืองเชียงใหม่ ผู้ที่เดินทางมาสักการะที่วัดแห่งนี้สามารถมองเห็นทิวทัศน์เมืองเชียงใหม่ได้อย่างชัดเจน นักท่องเที่ยวสามารถเดินขึ้นบันไดนาค 300 ขั้น เพื่อไปยังด้านบนพระธาตุ หรือถ้าไม่สะดวก ก็สามารถใช้บริการรถเคเบิ้ลคาร์ ขึ้น–ลง ได้สบาย ๆ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis4(View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สวนดอกไม้ แม่ริม (เชียงใหม่)");
        builder.setMessage("แต่งตัวชิค ๆ เตรียมพรอพสวยๆมาให้พร้อม หาตากล้องดี ๆ มาสักคน จากนั้นก็แล้วแต่ใครจะหามุมสวยหล่อกันตามสบาย เมื่อดอกไม้บานสะพรั่งเต็มพื้นที่ ยิ่งได้แสงยามเย็นอุ่นๆ ถ่ายออกมาแล้วยังไงก็สวยแน่นอน รับรองว่าจะมีรูปสวยๆ ให้โพสต์ลงโซเชียลอีกเยอะจนเลือกไม่ถูกเลยล่ะ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis5 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สวนแม่ฟ้าหลวง ดอยตุง (เชียงราย)");
        builder.setMessage("ที่นี่นักท่องเที่ยวสามารถเข้ามาชมความงดงามได้ตลอดทั้งปี ภายในสวนแม่ฟ้าหลวง ยังมีประติมากรรม “ความต่อเนื่อง” ซึ่งเป็นรูปปั้นเด็กยืนต่อตัวอยู่ที่กลางสวนนอกจากนี้ยังจัดแต่งสวนหินซึ่งประดับด้วยหินภูเขากลมเกลี้ยงขนาดใหญ่สวนน้ำอุดมด้วยไม้น้ำพันธุ์ต่างๆบัวและสวนปาล์มที่รวบรวมปาล์มไว้มากมายหลายชนิด");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis6 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดพระธาตุเขาน้อย (น่าน)");
        builder.setMessage("อีกหนึ่งวัดสำคัญของเมืองน่าน ตั้งอยู่บนดอยเขาน้อย มีความสูงจากระดับน้ำทะเลประมาณ 250 เมตร ใครที่มีแรงเหลือก็สามารถเดินขึ้นบันไดจากด้านล่าง ผ่านบันไดนาค 303 ขั้นเพื่อขึ้นไปด้านบนหรือใครที่ไม่สะดวกก็สามารถขับรถขึ้นไปจอดที่ด้านบนเขาได้เลย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis7 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ดอยเสมอดาว (น่าน)");
        builder.setMessage("ตั้งอยู่ในเขตของอุทยานแห่งชาติศรีน่าน  มีสภาพป่าอุดมสมบูรณ์ มีเทือกเขาสูงสลับซับซ้อน และ เป็นแหล่งที่อยู่อาศัยของสัตว์ป่านานาชนิด โดยมี “ดอยเสมอดาว” ซึ่งเป็นภูเขายอดตัดที่มีลานกว้างเหมาะสำหรับการกางเต็นท์นักท่องเที่ยวสามารถเข้าไปพักผ่อนกางเต้นท์นอนได้มีจุดชมวิวตามแนวสันเขาสามารถชมได้ทั้งพระอาทิตย์ขึ้นและตกและที่สำคัญที่ดอยเสมอดาวนี้นักท่องเที่ยวสามารถขับรถขึ้นมาได้ถึงจุดกางเต็นท์เลยเดินเท้าเพียงแค่ไม่กี่ก้าวเท่านั้นทำให้ที่นี่เป็นที่กางเต็นท์ยอดนิยมที่เหมาะสำหรับกลุ่มคนทุกเพศทุกวัย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis8 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ดอยสกาด (น่าน)");
        builder.setMessage(" \n" +
                "ตั้งอยู่ในเขตอำเภอปัว จังหวัดน่าน อยู่บนแนวเทือกเขาดอยภูคา ห่างจากตัวเมืองประมาณ 22 กม. เท่านั้น ใช้เวลาเดินทางจากปัว แค่ครึ่งชั่วโมงก็ถึงแล้ว เป็นถนนลาดยางอย่างดีตลอดทั้งเส้น  เส้นทางคดโค้งไปมา แต่ไม่สูงชันเท่าไหร่นัก รถทุกชนิดสามารถสัญจรได้ไม่ยากเย็น\n");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis9 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("แพะเมืองผี (แพร่)");
        builder.setMessage("อีกหนึ่งสถานที่ท่องเที่ยวยอดฮิตของจ.แพร่ เกิดจากธรรมชาติสร้างสรรค์ความงามขึ้น นักธรณีวิทยาประมาณอายุสถานที่แห่งนี้ว่า น่าจะเกิดขึ้นประมาณ 2 ล้านปีมาแล้ว มีรูปร่างที่แปลกตาน่าสนใจซึ่งเป็นหิน ดิน และทรายถูกกัดกร่อน ชะล้างและผุพังตามธรรมชาติเกิดเป็นหน้าผา เสาดินที่มีรูปร่างต่าง ๆ เกิดเป็นแท่ง เป็นหย่อม มีรูปร่างแตกต่างกันไป แล้วแต่จินตนาการ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis10 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูสอยดาว (อุตรดิตถ์)");
        builder.setMessage("ตั้งอยู่ในเขตของอทุยานแห่งชาติภูสอยดาว โดยยอดสูงสุดของภูสอยดาว มีความสูงจากระดับน้ำทะเลถึง 2,102 เมตร ซึ่งถือเป็นยอดดอยที่สูงเป็นอันดับ 4 ของประเทศไทย ที่นี่ขึ้นชื่อในเรื่องของทุ่งดอกหงอนนาค ที่มีสีม่วงสวยงาม มีเสน่ห์ ปกคลุมไปทั่วทั้งบริเวณในทุกช่วงฤดูฝน ราว ๆ เดือนสิงหาคม–กันยายน ของทุกปี ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis11 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดพระศรีรัตนมหาธาตุ (พิษณุโลก)");
        builder.setMessage("วัดพระศรีรัตนมหาธาตุวรมหาวิหาร หรือชื่อที่เรียกกันทั่วไปว่า “วัดใหญ่” ตั้งอยู่ที่ ถนนพุทธบูชา ริมฝั่งแม่น้ำน่านด้านทิศตะวันออก ตรงข้ามกับศาลากลางจังหวัดพิษณุโลก เป็นพระอารามหลวง ชั้นเอก ชนิดวรมหาวิหาร เป็นที่รู้จักโดยทั่วไปในฐานะสถานที่ประดิษฐานพระพุทธชินราช พระพุทธรูปที่ได้รับการยกย่องว่าสวยงามที่สุดในประเทศไทย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis12 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สระน้ำมรกตขุนน้ำนางนอน (เชียงราย)");
        builder.setMessage("ตั้งอยู่ภายในวนอุทยานถ้ำหลวง-ขุนน้ำนางนอน เป็นสระน้ำธรรมชาติที่อยู่ใกล้กับถ้ำทรายทอง ห่างจากถ้ำหลวงราว ๆ 3 กิโลเมตร เป็นจุดที่ต้องสูบน้ำออกมาจากถ้ำหลวงเมื่อช่วงเหตุการณ์ช่วยเหลือทีมนักฟุตบอลเยาวชนหมูป่า ซึ่งหลังจากเหตุการณ์ดังกล่าว สระน้ำบริเวณนี้ก็ได้กลายเป็นสีเขียวมรกตใส ตั้งอยู่ท่ามกลางป่าไม้เขียวขจี บรรยากาศร่มรื่นสบายตา อากาศเย็นสดชื่น สวยงามน่าท่องเที่ยว");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis13 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูชี้ฟ้า (เชียงราย)");
        builder.setMessage("เป็นที่ร่ำลือกันว่า \"ภูชี้ฟ้า\" เหมาะสำหรับเป็นจุดชมและถ่ายรูปพระอาทิตย์ขึ้นและตกดินที่สวยที่สุดแห่งหนึ่งของประเทศ โดยเฉพาะอย่างยิ่งในช่วงฤดูหนาวที่นี่จะสวยมากเป็นพิเศษ นอกเหนือจากวิวทัศน์สวย ๆ แล้ว ระหว่างทางที่เดินขึ้นไป นักท่องเที่ยวอาจจะได้เจอเข้ากับดอกนางพญาเสือโคร่งและต้นเสี้ยวดอกขาว ซึ่งจะออกดอกบานสะพรั่งในช่วงเดือนมกราคม-กุมภาพันธ์ ความโดดเด่นของภูชี้ฟ้าเห็นจะเป็นหน้าผาหินคล้ายนิ้วชี้ ปกคลุมด้วยหญ้าไม้พุ่ม และโขดหิน ซึ่งเป็นจุดที่นักท่องเที่ยวนิยมถ่ายรูปเป็นอย่างมาก เพราะจะเห็นสายหมอกที่ลอยละล่องกลางหุบเขางดงามเกินบรรยาย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis14 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ดอยอินทนนท์ (เชียงใหม่)");
        builder.setMessage("ยอดดอยที่ไม่ควรพลาดอย่างยิ่งสำหรับดอยอินทนนท์เพราะที่นี่สูงจากระดับน้ำทะเลมากถึง 2,565 เมตร จึงเป็นภูเขาที่สูงที่สุดในเมืองไทย ซึ่งใครต่อใครก็อยากได้ไปสัมผัสสักครั้งในชีวิต ดอยอินทนนท์ตั้งอยู่ในอุทยานแห่งชาติดอยอินทนนท์ มีธรรมชาติที่อุดมสมบูรณ์ อากาศจึงหนาวเย็นตลอดทั้งปี");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis15 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ม่อนแจ่ม (เชียงใหม่)");
        builder.setMessage("ส่วนหนึ่งของโครงการหลวงหอย บริเวณด้านบนของม่อนแจ่มสามารถมองเห็นภูเขาสูงใหญ่โดยรอบ พร้อมกับสายหมอกได้อย่างสวยงาม อีกทั้งชาวบ้านในพื้นที่และเจ้าหน้าที่โครงการหลวงหนองหอย ยังช่วยกันปรับปรุงทัศนียภาพของม่อนแจ่มให้มีความสวยงามไปด้วยต้นไม้ ดอกไม้นานาพรรณ ให้บานสะพรั่งตลอดทั้งปี");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis16 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("กว๊านพะเยา (พะเยา)");
        builder.setMessage("หนองน้ำหรือบึงน้ำขนาดใหญ่ ซึ่งกว๊านพะเยาก็ได้ครอบคลุมพื้นที่มากถึง 12,831 ไร่ ตั้งอยู่ในเขตอำเภอเมืองพะเยา มีลักษณะเป็นบึงรูปพระจันทร์เสี้ยวเกือบครึ่งวงกลม มีความลึกเฉลี่ยประมาณ 1.5 เมตร เป็นแอ่งน้ำที่รวบรวมลำห้วยต่าง ๆ 18 สาย ภายในบึงเป็นแหล่งเพาะพันธุ์ปลากว่า 50 ชนิด มีภูเขาโอบล้อมอย่างสวยงาม โดยรอบกว๊านพะเยามีการปลูกต้นไม้อย่างร่มรื่น สวยงาม เป็นสถานที่พักผ่อนหย่อนใจของชาวเมือง");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis17 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วนอุทยานภูลังกา (พะเยา)");
        builder.setMessage("ในช่วงปลายฝนต้นหนาวและช่วงหน้าหนาวของทุกปี วนอุทยานภูลังกาจะได้รับความนิยมจากนักท่องเที่ยวค่อนข้างมาก ด้วยภายในบริเวณวนอุทยานภูลังกามีภูเขาหินปูนรูปร่างแปลกตามากมาย เป็นแหล่งกำเนิดทะเลหมอกที่สวยงามที่สุดแห่งหนึ่งของเมืองพะเยา ยามเช้าอากาศจะหนาวเย็นตลอดทั้งปี");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis18 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("น้ำตกธารสวรรค์ (พะเยา)");
        builder.setMessage("ตั้งอยู่ภายในอุทยานแห่งชาติดอยภูนาง เป็นน้ำตกที่ขึ้นชื่อที่สุดแห่งหนึ่งของอุทยาน ร่มรื่นด้วยต้นไม้นานาชนิด ถึงแม้ว่าขนาดน้ำตกจะไม่ใหญ่ แต่รับรองถึงความสวยที่ยังคงความเป็นธรรมชาติ อีกทั้งจำนวนนักท่องเที่ยวที่ยังคงไม่พลุกพล่าน ลำธารน้ำตกที่นี่จึงใส และอุดมสมบูรณ์ เอาไว้ให้เราได้กระโดดเล่นน้ำกันเพลิน ๆ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis19 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("น้ำตกก้อหลวง (ลำพูน)");
        builder.setMessage("ตั้งอยู่ในอุทยานแห่งชาติแม่ปิง อำเภอลี้ จังหวัดลำพูน เป็นน้ำตกหินปูนสีเขียวมรกตกลางป่าใหญ่ เกิดจากห้วยแม่ก้อไหลผ่านหน้าผาหินปูนทั้งหมด 7 ชั้น และตกลงมายังแอ่งน้ำขนาดใหญ่เบื้องล่างที่ใสสะอาดมองเห็นพื้นด้านล่างและปลาชนิดต่าง ๆ ที่แหวกว่ายสนุกสนาน ภายในบริเวณลานจอดรถของน้ำตกก้อหลวง จะมีจุดบริการห้องน้ำ ห้องอาบน้ำ และร้านค้า ซึ่งเป็นคนในพื้นที่มาเปิดให้บริการเฉพาะช่วงเทศกาลเท่านั้น");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis20 (View view){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ฮิโนกิแลนด์ (เชียงใหม่)");
        builder.setMessage("อาณาจักรไม้ฮิโนกิแห่งแรกและแห่งเดียวในประเทศไทย ณ ตำบลศรีดงเย็น อำเภอไชยปราการ ภายในพื้นที่กว่า 83 ไร่ ได้รับการออกแบบให้กลายเป็นเมืองจำลองแบบญี่ปุ่นขนานแท้ ประดับประดาด้วยโคมแดงขนาดยักษ์ โดยไฮไลต์สำคัญอยู่ที่ปราสาทฮิโนกิ สร้างจากไม้หอมทั้งหลัง ขนาดสูงกว่า 4 ชั้น ล้อมรอบไปด้วยบรรยากาศสวย ๆ ของภูเขาและธรรมชาติ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(), "ok", Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

}

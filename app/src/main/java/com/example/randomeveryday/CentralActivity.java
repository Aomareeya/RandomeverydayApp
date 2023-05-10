package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class CentralActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);
    }

    public void Synopsis(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ตลาดน้ำอัมพวา (สมุทรสงคราม)");
        builder.setMessage("ใครที่เป็นสายกิน รับรองว่าไม่ผิดหวัง เพราะที่นี่มีของกินอร่อยๆ เพียบ ทั้งของหวาน ของคาว รสชาติถูกปาก ราคาถูกใจ รวมทั้งของดี ของฝากมากมาย อาหารทะเลแปรรูป ผลไม้ เสื้อผ้า และอีกหนึ่งกิจกรรมที่น่าพลาดไม่ได้ เมื่อมาเที่ยวที่อัมพวา นั่นคือการล่องเรือไปชมหิ่งห้อย ที่อาศัยอยู่ตามต้นไม้ริมแม่น้ำในช่วงหัวค่ำ สนนราคาคนละ 50-60 บาทเท่านั้น");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis2(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สะพานมอญ (กาญจนบุรี)");
        builder.setMessage("สะพานอุตตมานุสรณ์ หรือที่นิยมเรียกกันว่า สะพานมอญ เป็นสะพานไม้ที่ยาวที่สุดในประเทศไทย มีความยาว 850 เมตร และเป็นสะพานไม้ที่ยาวเป็นอันดับ 2 ของโลกรองจากสะพานไม้อูเบ็ง ในประเทศพม่า เป็นสะพานที่ข้ามแม่น้ำซองกาเลีย ที่ตำบลหนองลู อำเภอสังขละบุรี จังหวัดกาญจนบุรี");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis3(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ตลาดไทยย้อนยุคบ้านระจัน (สิงห์บุรี)");
        builder.setMessage("ตั้งอยู่ในวัดโพธิ์เก้าต้น มีเนื้อที่ทั้งหมด 5 ไร่ เริ่มก่อตั้งเมื่อปี พ.ศ.2559 โดยเป็นความตั้งใจของหลวงพ่อเจ้าอาวาสวัดโพธิ์เก้าต้น พระครูวิชิต วุฒิคุณ อยากให้ประชาชนชาวบ้านในพื้นที่ ได้มีอาชีพ มีรายได้หาเลี้ยงครอบครัว จึงรวบรวมชาวบ้านในพื้นที่ ตั้งกลุ่มขายของในวัดเป็นตลาดเล็กๆ เริ่มจาก 20 ร้านค้า และเพิ่มขึ้นมาเรื่อยๆ จนถึงปัจจุบัน");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis4(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดไชยวัฒนาราม (พระนครศรีอยุธยา)");
        builder.setMessage("ตั้งอยู่ริมแม่น้ำเจ้าพระยาฝั่งตะวันตกนอกเกาะเมือง เป็นวัดที่พระเจ้าปราสาททอง กษัตริย์กรุงศรีอยุธยาองค์ที่ 24 ( พ.ศ. 2173-2198) โปรดให้สร้างขึ้นเมื่อ พ.ศ. 2173 ได้ชื่อว่าเป็นวัดที่มีความงดงามมากแห่งหนึ่งในกรุงศรีอยุธยา ถึงแม้ว่าในตอนนี้จะหลงเหลือเพียงซากปรักหักพัง แต่ก็ยังคงความงดงามอยู่ และกลายมาเป็นแลนด์มาร์คอีกแห่งหนึ่งของอยุธยา");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis5(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Woodland เมืองไม้ (นครปฐม)");
        builder.setMessage("พิพิธภัณฑ์เอกชนริมแม่น้ำนครชัยศรี ที่รวบรวมงานไม้แกะสลักจำนวนมาก แต่ละชิ้นมีความละเอียดประณีต ดูสวยงามอลังการ รับรองว่าผู้ที่เข้าชมพิพิธภัณฑ์ จะได้ได้สัมผัสถึงความมหัศจรรย์แห่งการก่อเกิดธรรมชาติที่ยิ่งใหญ่และความงดงามทางศิลปะ ที่มนุษย์ได้บรรจงสร้างขึ้นมา");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis6(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สะพานข้ามแม่น้ำแคว (กาญจนบุรี)");
        builder.setMessage("แลนด์มาร์คอันดับหนึ่งของกาญจนบุรี ที่มีชื่อเสียงโด่งดังขจรไกลไปทั่วโลก นับเป็นหนึ่งในจุดหมายปลายทางที่นักท่องเที่ยวจากทั่วทุกสารทิศจะต้องแวะมาเยือนอยู่เสมอๆ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis7(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดพระศรีรัตนศาสดาราม (กรุงเทพฯ)");
        builder.setMessage("พลาดไม่ได้เลยถ้ามาเที่ยวเมืองหลวงของเรา สถานที่ท่องเที่ยวที่แนะนำให้ไปเป็นที่แรกๆเลย  คือวัดพระศรีรัตนศาสดาราม หรือที่เรียกกันทั่วไปว่าวัดพระแก้วเป็นวัดที่พระบาทสมเด็จพระพุทธยอดฟ้าจุฬาโลกมหาราชโปรดเกล้าฯให้สร้างขึ้นในพ.ศ. 2325");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis8(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดโสธรวรารามวรวิหาร (ฉะเชิงเทรา)");
        builder.setMessage("วัดโสธรวรารามวรวิหาร เป็นวัดที่ประดิษฐานพระพุทธรูปที่สำคัญคือ “หลวงพ่อโสธร” อันเป็นศูนย์รวมศรัทธาของชาวแปดริ้วและพุทธศาสนิกชนทั่วไป ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis9(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สวนนกชัยนาท (ชัยนาท)");
        builder.setMessage("สวนนกขนาดใหญ่ที่มีกรงนกใหญ่ที่สุดในเอเชีย และสร้างขึ้นได้ใกล้เคียงสภาพธรรมชาติ ประกอบไปด้วยนกหลายสายพันธุ์ให้นักท่องเที่ยวได้ศึกษา นอกจากจะเพลิดเพลินใจไปกับนกนานาชนิดแล้ว ยังมีการจัดแสดงอีกหลายโซนด้วยกัน เช่น ศูนย์วิทยาศาสตร์ท้องฟ้าจำลองฯ, พิพิธภัณฑ์ไข่นก, พิพิธภัณฑ์ปลาน้ำจืด เป็นต้น");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis10(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("พระปฐมเจดีย์ (นครปฐม)");
        builder.setMessage(" \n" +
                "เป็นพระเจดีย์ใหญ่ รูประฆังคว่ำ ปากผาย โครงสร้างเป็นไม้ซุง รัดด้วยโซ่เส้นมหึมา ก่ออิฐ ถือปูน ประดับด้วยกระเบื้องปูทับ ประกอบด้วยวิหาร 4 ทิศกำแพงแก้ว 2 ชั้น เป็นที่ประดิษฐานพระบรมสารีริกธาตุ ของพระพุทธเจ้า อันเป็นที่เคารพสักการบูชาของบรรดาพุทธศาสนิกชนทั่วโลก ทางวัดกำหนดให้มีงานเทศกาลนมัสการองค์พระปฐมเจดีย์ ในวันขึ้น 12 ค่ำ เดือน 12 ถึง วันแรม 5 ค่ำ เดือน 12 รวม 9 วัน 9 คืน เป็น ประจำทุกปี\n");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis11(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะเกร็ด (นนทบุรี)");
        builder.setMessage("เกิดขึ้นจากการขุดคลองลัดแม่น้ำเจ้าพระยา สืบต่อความเจริญรุ่งเรืองมาตั้งแต่สมัยกรุงศรีอยุธยา และมีชาวมอญมาตั้งถิ่นฐานในสมัยกรุงธนบุรี ซึ่งยังปรากฏหลักฐานตามวัดวาอารามต่าง ๆ จนถึงทุกวันนี้");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis12(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อำเภอสวนผึ้ง (ราชบุรี)");
        builder.setMessage("แหล่งพักผ่อนในวันสบาย ๆ เติมความสุขให้วันหยุดอย่างคุ้มค่า กับกิจกรรมท่องเที่ยวมากมายหลากหลาย สัมผัสธรรมชาติที่บริสุทธิ์ อากาศมันหนาวเป็นเรื่องแปลก แต่จริงที่เกิดขึ้นในภาคกลางของประเทศไทย นั่นเพราะสวนผึ้งอยู่ในอ้อมล้อมของขุนเขาตะนาวศรี ระดับความสูงของขุนเขาบางแห่ง อยู่สูงกว่าระดับน้ำทะเลกว่า 1,000 เมตร");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis13(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อุทยานแห่งชาติน้ำตกสามหลั่น (สระบุรี)");
        builder.setMessage("อุทยานแห่งชาติน้ำตกสามหลั่น ที่มีลานหินกว้างเรียงลดหลั่นกันลงมาทั้งหมดสามชั้นเป็นระเบียบเหมือนขั้นบันไดแปลกตา จนเป็นที่มาของชื่อน้ำตกสามหลั่นนั่นเอง ด้วยความที่ธรรมชาติยังสมบูรณ์และเป็นแหล่งท่องเที่ยวที่ไม่ไกลจากกรุงเทพฯ มากเท่าไหร่นัก เลยเป็นแหล่งตั้งแคมป์ยอดฮิตของจังหวัดสระบุรี ที่มีนักท่องเที่ยวทั้งชาวไทย และชาวต่างชาติเดินทางมาที่อุทยานฯ แห่งนี้กัน ต้องรีบไปแพ็คกระเป๋าไปเที่ยวแล้ว");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis14(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("บางปู (สมุทรปราการ)");
        builder.setMessage("แหล่งท่องเที่ยวชื่อดังของจังหวัดสมุทรปราการ พูดได้เลยว่ามาถึงสมุทรปราการต้องมานั่งกินปู ชมวิวสวยๆ พอกินอาหารแสนอร่อยเสร็จแล้วสิ่งที่ลืมไปไม่ได้คือ ให้อาหารนกนางนวลที่บินร่อนรออาหารจากนักท่องเที่ยว");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis15(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดม่วง (อ่างทอง)");
        builder.setMessage("ตั้งอยู่หมู่ที่ 6 ตำบลหัวตะพาน อยู่ห่างจากอำเภอเมือง ประมาณ 8 กิโลเมตร ไปตามเส้นทางสายอ่างทอง-วิเศษชัยชาญ (ทางหลวงหมายเลข 3195) ภายในวัดมีสถานที่สำคัญหลายแห่ง เช่น พระอุโบสถ ล้อมรอบด้วยกลีบบัวสีชมพู ขนาดใหญ่ที่สุดในโลก วิหารแก้ว ชั้นล่าง เป็นพิพิธภัณฑ์วัตถุมงคลและวัตถุโบราณ ชั้นบน ประดิษฐานพระพุทธรูปศักดิ์สิทธิ์ เนื้อเงินแท้ องค์แรกองค์เดียวที่ใหญ่ที่สุดในประเทศไทย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis16(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อุทยานแห่งชาติคลองวังเจ้า (กำแพงเพชร)");
        builder.setMessage("อุทยานแห่งชาติคลองวังเจ้า ตั้งอยู่ที่จังหวัดกำแพงเพชร ที่มีความโดดเด่นในเรื่องความสวยงาม มีน้ำตกถึง 3 แห่ง แต่น้ำตกที่ดึงดูดนักท่องเที่ยวมากที่สุดในอุทยานฯ คงหนีไม่พ้น น้ำตกคลองสมอกล้วย ที่มีความแตกต่างกับน้ำตกแห่งอื่นภายในอุทยานฯ ด้วยสีน้ำที่คล้ายกับสีบุษราคัม เรียกได้ว่าเป็นอุทยานฯ ที่เหมาะสำหรับตั้งแคมป์แล้วไปตะลุยเดินให้ทั่วอย่างชิลล์");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis17(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("น้ำตกสาลิกา (นครนายก)");
        builder.setMessage("น้ำตกสาริกาน้ำตกขนาดใหญ่ไหลลงจากหน้าผาถึง 9 ชั้น กับธรรมชาติสีเขียวขจีมีมุมสวยๆ ไว้ให้เล่นน้ำเบาๆ ถ่ายรูปชิคๆ ยิ่งถ้าไปในฤดูฝนก็จะมีน้ำมากเป็นพิเศษ จึงทำให้ส่วนใหญ่จะมีนักท่องเที่ยวเลือกที่จะไปช่วงหน้าฝน เพราะเห็นธรรมชาติได้อย่างเต็มที่และสมบูรณ์เหมาะกับการเล่นน้ำสุดๆ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis18(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อ่างเก็บน้ำหุบวง (สุพรรณบุรี)");
        builder.setMessage("พักในแพเหนือน้ำกลางป่า บรรยากาศโรแมนติกเหมาะที่จะไปพักผ่อนร่างกาย รับบรรยากาศบริสุทธิ์ชิลล์ ๆ หรือว่าจะกางเต็นท์นอนสบาย ๆ ใกล้ชิดธรรมชาติก็ดีไปอีกแบบ ภายในอ่างเก็บน้ำจะมีเรือพาย และจักรยานไว้คอยบริการให้กับนักท่องเที่ยวด้วย สามารถแชะภาพรัว ๆ ได้ทุกมุม");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis19(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สะพานแดงจุดชมวิวปลาโลมา (สมุทรสาคร)");
        builder.setMessage("สะพานสีแดงสีสันสดใสเป็นสะพานไม้ยาวอยู่ใกล้ตรงด้านหน้าศาลเจ้าพ่อมัจฉานุ เดินเข้ามาก็จะเห็นสะพานสีเด่นมาแต่ไกลเลย ด้วยความยาวของสะพานทำให้เดินรับลมทะเลเย็นๆ ฉ่ำๆ ชมวิวป่าชายเลน มีจุดให้นั่งปิกนิกให้ปูเสื่อนั่งเม้าท์ได้อีกด้วย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
    public void Synopsis20(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เขื่อนป่าสักชลสิทธิ์ (ลพบุรี)");
        builder.setMessage("้เขื่อนป่าสักชลสิทธิ์ เขื่อนดินที่ยาวที่สุดในประเทศไทย สถานที่ท่องเที่ยวที่สำคัญ และมีชื่อเสียงของจังหวัดลพบุรี เดินทางสะดวก แถมที่เขื่อนมีบริการรถรางสำหรับพาชมรอบเขื่อนนั่งรับลมชิลล์ ๆ แบบไม่กลัวร้อน ถ่ายรูปสวยได้ไม่หวั่น");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
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
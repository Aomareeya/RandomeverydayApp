package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SouthActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_south);
    }
    public void Synopsis(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("หมู่เกาะสิมิลัน (พังงา)");
        builder.setMessage("ที่สุดของทะเลไทยต้องยกให้ หมู่เกาะสิมิลัน  ซึ่งตั้งอยู่ใน อุทยานแห่งชาติหมู่เกาะสิมิลัน จังหวัดพังงา นักท่องเที่ยวทั่วโลกต่างก็ยกให้ที่นี่เป็น “เกาะสวรรค์” เลยทีเดียว เพราะน้ำทะเลที่ใสราวกระจก ดูเผิน ๆ เหมือนเรือกำลังลอยอยู่กลางมหาสมุทร");
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
    public void Synopsis2(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะเต่า (สุราษฎร์ธานี)");
        builder.setMessage("สายดำน้ำยังไงก็ต้องไม่พลาด เกาะเต่า เพราะที่นี่คือ แหล่งดำน้ำสวยติดอันดับโลก และ ยังติดอันดับ 25 ชายหาดสวย ที่ดีที่สุดในประเทศไทย ที่นี่มีจุดดำน้ำหลายจุด ทั้งดำน้ำลึกและดำน้ำตื้น มีปะการังที่สวยงาม และเป็นที่อยู่ของสัตว์น้ำนานาชนิด");
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
    public void Synopsis3(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะพีพี (กระบี่)");
        builder.setMessage("หมู่เกาะพีพีตั้งอยู่ในอุทยานแห่งชาติหาดนพรัตนธารา จังหวัดกระบี่ รอบ ๆ เกาะจะสวยงามมาก ๆ และเต็มไปด้วยปะการังใต้ทะเลที่มีความสวยงามแปลกต ด้วยเอกลักษณ์ที่ไม่มีที่ไหนก็คือ ภูเขาหินปูนที่มีหน้าผาเป็นชั้น ๆ มีถ้ำที่สวยงามใต้ท้องทะเล");
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
    public void Synopsis4(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะไข่ (พังงา)");
        builder.setMessage("เกาะไข่ตั้งอยู่ทางด้านตอนใต้ของหมู่เกาะสุรินทร์ใต้ จังหวัดพังงา ที่นี่เป็นเกาะเล็ก ๆ แต่เป็นจุดดำน้ำที่สวยงามและมีความสมบูรณ์มากที่สุดอีกแห่งหนึ่ง ซึ่งบริเวณนี้จะมีทั้งแนวปะการังและกองหินใต้น้ำสลับกันไป บริเวณโดยรอบจะมีด้วยกัน 3 เกาะ นั่นก็คือ เกาะไข่ใน เกาะไข่นอก และ เกาะไข่นุ้ย ");
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
    public void Synopsis5(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะหลีเป๊ะ (สตูล)");
        builder.setMessage("เกาะหลีเป๊ะตั้งอยู่ในอุทยานแห่งชาติตะรุเตา จังหวัดสตูล ที่นี่อุดมไปด้วยความสวยงามธรรมชาติของปะการังรอบเกาะ รวมถึงหาดทรายสีขาวละเอียด น้ำทะเลที่ใสปิ๊งและที่สำคัญคือ เป็นแหล่งที่อยู่ของเหล่าปลานีโม่หรือปลาการ์ตูน นั่นเอง พร้อมด้วยดอกไม้ทะเลที่งดงาม ");
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
    public void Synopsis6(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("หมู่เกาะสุรินทร์ (พังงา)");
        builder.setMessage("อุทยานแห่งชาติหมู่เกาะสุรินทร์ตั้งอยู่ในจังหวัดพังงา เป็นหมู่เกาะที่อยู่ในทะเลอันดามันและติดชายแดนประเทศเมียนมาอีกด้วย หมู่เกาะสุรินทร์เป็นสถานที่ท่องเที่ยวที่สวยงามมาก ๆ ไม่ว่าจะเป็นปะการังนานาชนิด ทั้งปะการังผักกาด ปะการังสมอง ปะการังเขากวาง ดอกไม้ทะเล ฯลฯ");
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
    public void Synopsis7(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะนางยวน (สุราษฎร์ธานี)");
        builder.setMessage("เกาะนางยวนเป็นเกาะที่ได้ชื่อว่า อะเมซซิ่งไทยแลนด์มาก ๆ ด้วยบริเวณนั้นจะมีเกาะ 3 เกาะที่ถูกเชื่อมต่อด้วยชายหาดเดียวกันเป็นสันทรายสีขาวจนเกิดเป็นทะเลแหวกและชายหาดจำนวน 3 แห่ง ซึ่งนับเป็นที่เที่ยวอีกแห่งหนึ่งในไทยของเราเลยทีเดียว ทำให้นักท่องเที่ยวทั้งชาวไทยและต่างชาติก็อยากมาเที่ยวที่นี่สักครั้ง");
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
    public void Synopsis8(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะรอก (กระบี่)");
        builder.setMessage("เกาะรอกเป็นส่วนหนึ่งของอุทยานแห่งชาติหมู่เกาะลันตา จังหวัดกระบี่ ซึ่งแบ่งเป็นเกาะรอกนอก และเกาะรอกใน และยังได้รับการขนานนามว่าเป็น “ราชินีแห่งอันดามัน” อีกด้วย เกาะสีเขียวที่โอบกอดด้วยน้ำทะเลสวยใส หาดทรายขาว เดินผ่อนคลายเหยียบทรายนุ่มๆ อาบแดดให้ผิวแทน");
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
    public void Synopsis9(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะตาชัย (พังงา)");
        builder.setMessage("เกาะตาชัยตั้งอยู่ในอุทยานแห่งชาติหมู่เกาะสิมิลัน จังหวัดพังงา และตั้งอยู่ไม่ไกลจากหมู่เกาะสุรินทร์มากนัก ที่นี่ได้ชื่อว่าเป็น “เกาะสวรรค์” อีกแห่งหนึ่งของทะเลใต้ เพราะหาดทรายขาวละเอียดที่ทอดตัวยาวให้ความรู้สึกสบายทุกครั้งที่ได้สัมผัส น้ำทะเลที่ใสสะอาดเหมือนได้ว่ายอยู่กลางสระว่ายน้ำขนาดใหญ่ ทั้งหมดอยู่ที่เกาะตาชัยแห่งนี้");
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
    public void Synopsis10(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("หมู่เกาะกำ (ระนอง)");
        builder.setMessage("หมู่เกาะกำตั้งอยู่ที่อุทยานแห่งชาติแหลมสน เป็นอีกหนึ่งในหมู่เกาะที่สวยงามมาก ๆ แต่นักท่องเที่ยวอาจจะยังไม่รู้มากนัก เพราะถ้าพูดถึงระนอง ทุกคนมักจะนึกถึงเกาะพยามเป็นส่วนใหญ่ ที่จริงแล้วที่ระนองยังมีหมู่เกาะกำที่สวยงามมาก ๆ อยู่ด้วย ที่นี่มีความสวยงามมากทั้งน้ำทะเลใส และหาดทรายขาว เป็นจุดดำน้ำตื้นเล่นน้ำที่สงบเงียบ เหมาะกับการมาพักผ่อนสุดๆ");
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
    public void Synopsis11(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เขื่อนเชี่ยวหลาน (สุราษฎร์ธานี)");
        builder.setMessage("เขื่อนรัชประภาหรือที่ใคร ๆ รู้จักกันดีว่า “เขื่อนเชี่ยวหลาน” อันเป็นชื่อดั้งเดิม ก่อนจะเปลี่ยนเป็นชื่อปัจจุบัน อันเป็นชื่อพระราชทานจากพระบาทสมเด็จพระเจ้าอยู่หัว เป็นเขื่อนหินทิ้งแกนดินเหนียวอเนกประสงค์ สูง 95 เมตร ยาว 700 เมตร ทะเลสาบเหนือเขื่อนก็เต็มไปด้วยภูเขาหินปูนธรรมชาติที่มีรูปร่างต่าง ๆ แปลกตา ");
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
    public void Synopsis12(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูเขาหญ้า (ระนอง)");
        builder.setMessage("ภูเขาหญ้าหรือเขาหัวล้านหรือเขาผี เป็นภูเขาที่ไม่มีไม้ใหญ่ขึ้น ในแต่ละฤดูจะได้บรรยากาศที่สวยงามแตกต่างกันไป ในฤดูฝนมีหญ้าสีเขียวขึ้นปกคลุมแนวเขาที่ทอดตัวจากทิศเหนือสู่ทิศใต้ บางครั้งจึงเรียกว่า ภูเขาหญ้า ส่วนในฤดูหนาวและฤดูร้อนจะได้บรรยากาศหญ้าแห้งสีน้ำตาลก็ให้ความรู้สึกไปอีกแบบ ที่ราบเชิงเขามีทางเดินเท้าสำหรับนักท่องเที่ยวขึ้นสู่บนสันเขาเพื่อชมทิวทัศน์โดยรอบแบบ 360 องศา");
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
    public void Synopsis13(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วัดพระมหาธาตุวรมหาวิหาร (นครศรีธรรมราช)");
        builder.setMessage("วัดพระมหาธาตุวรมหาวิหารเดิมเรียกว่าวัดพระบรมธาตุ เป็นพระอารามหลวงชั้นเอกชนิดวรมหาวิหาร และมีอายุการก่อสร้างเก่าแก่ โดยมีความสำคัญทางศาสนามาแต่โบราณ อีกทั้งมีโบราณสถานที่สำคัญของประวัติศาสตร์ทางโบราณคดีและศาสนา");
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
    public void Synopsis14(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะสมุย (สุราษฎร์ธานี)");
        builder.setMessage("เกาะที่มีชื่อเสียงไปทั่วโลก อยู่บริเวณอ่าวไทย 1 ใน 3 ของเกาะเป็นที่ราบ ล้อมรอบภูเขา ช่วงเดือนมกราคมถึงเดือนพฤษภาคม เป็นช่วงคลื่นลมสงบเหมาะแก่การท่องเที่ยวที่สุด เป็นเกาะที่มีหาดทรายสวยทรายขาวมีชื่อหลายแห่ง ");
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
    public void Synopsis15(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ถ้ำภูผาเพชร (สตูล)");
        builder.setMessage("เป็นถ้ำที่มีขนาดใหญ่ที่สุดในประเทศไทย และใหญ่ติดอันดับ 4 ของโลก เนื้อที่ภายในถ้ำกว่า 50 ไร่ เพดานถ้ำสูงโปร่ง โดยความอัศจรรย์ภายในถ้ำแห่งนี้ปรากฏผ่านหินงอกหินย้อย ที่มีประกายระยิบระยับตระการตาดูคล้ายเกล็ดเพชรมากมาย ภายในถ้ำนั้นจัดสรรแบ่งเป็นห้องต่าง ๆ มากถึง 20 ห้อง มีสะพานไม้เป็นทางเดินตลอดถ้ำและติดตั้งไฟส่องสว่าง โดยห้องที่น่าสนใจ \n");
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
    public void Synopsis16(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ท่าปอม คลองสองน้ำ (กระบี่)");
        builder.setMessage("อุดมไปด้วยหญ้าทะเลเขียวสดงอกงามจำนวนมากทำให้สามารถพายเรือแคนูในคลองสองน้ำได้หรือใช้เส้นทางเดินธรรมชาติ ซึ่งผ่านป่าพรุน้ำจืดและรอยต่อป่าสองถิ่นตลอดแนวลำคลอง ความยาวประมาณ 700 เมตร ตลอดทางเดินนักท่องเที่ยวสามารถสัมผัสความงามของพืชวงศ์ปาล์ม และผักพื้นบ้านนานาชนิด");
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
    public void Synopsis17(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เขามัทรี (ชุมพร)");
        builder.setMessage("จุดชมวิวเขามัทรีอยู่บนเส้นทาง ชุมพร-ปากน้ำ-หาดทราย ที่นี่เป็นแหล่งท่องเที่ยวจุดชมวิวทิวทัศน์ ที่น่าสนใจอีกแห่งหนึ่งของชุมพร สามารถชมวิวทิวทัศน์ ได้ 360 องศา สามารถมองเห็นชุมชนปากน้ำชุมพรและชายหาดของทะเลชุมพร โดยเฉพาะในยามเย็นช่วงเวลาที่พระอาทิตย์งดงามมาก ซึ่งบริเวณจุดชมวิวมีร้านกาแฟพร้อมระเบียงชมวิวให้ได้ชมทัศนียภาพอีกด้วย");
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
    public void Synopsis18(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("หาดทุ่งวัวแล่น (ชุมพร)");
        builder.setMessage("เป็นชายหาดที่สวยงามขึ้นชื่อของอำเภอปะทิว ตั้งอยู่ที่หมู่ 8 ตำบลสะพลี อ.ปะทิว จ.ชุมพร เป็นชายหาดที่มีเม็ดทรายสีขาวนวลละเอียด ทอดตัวยาวสุดสายตา ลักษณะเป็นชายหาดน้ำตื้นค่อย ๆ ลาดเอียงลงทีละน้อย หาดกว้าง เหมาะแก่การเล่นน้ำ เป็นที่นิยมของนักท่องเที่ยว");
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
    public void Synopsis19(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เมืองเก่าภูเก็ต (ภูเก็ต)");
        builder.setMessage("ย่านเมืองเก่าเป็นแหล่งรวมสถาปัตยกรรมแบบชิโนโปรตุกีส ที่ยังคงรักษาไว้จนถึงปัจจุบัน มีรูปแบบวัฒนธรรมเฉพาะที่เรียกว่า “เพอรานากัน” มีพิพิธภัณฑ์ภูเก็ตไทยหัว เป็นแหล่งรวบรวมเรื่องราวของย่านเมืองเก่าและวิถีชีวิตวัฒนธรรมชาวจีนโพ้นทะเลที่อพยพมาทำเหมืองแร่ เป็นแหล่งท่องเที่ยวที่ควรแวะมาเที่ยวชมให้ได้สักครั้งหนึ่ง");
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
    public void Synopsis20(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("เกาะลังกาจิว (ชุมพร)");
        builder.setMessage("เกาะลังกาจิว ตั้งอยู่ในท้องทะเลฝั่งอ่าวไทย ในพื้นที่ตำบลหาดทรายรี อำเภอเมือง จังหวัดชุมพร เป็นเกาะเล็ก ๆ ที่ได้รับสัมปทานรังนกจากอุทยานแห่งชาติหมู่เกาะชุมพร แต่อนุญาตให้นักท่องเที่ยวเข้าไปเที่ยวชมได้ บริเวณรอบ ๆ ของเกาะลังกาจิวจะมีแนวปะการังหนาแน่นและสวยงามมาก น้ำทะเลสวยใส จึงสามารถมองเห็นแนวปะการังได้จากบริเวณชายหาด หาดทรายก็ขาวสะอาดตา บรรยากาศเงียบสงบ");
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

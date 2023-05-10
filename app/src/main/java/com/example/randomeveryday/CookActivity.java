package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CookActivity extends AppCompatActivity {
        private ImageView ImageView;
        private TextView TextView;
        private Button Button;
        private WebView Showweb;
        public AlertDialog.Builder builder;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_cook);


            ImageView = (ImageView)findViewById(R.id.imageView);
            TextView = (TextView)findViewById(R.id.textView);
            Button = (Button)findViewById(R.id.button);
            Showweb=findViewById(R.id.WebView);
            Showweb.getSettings().setJavaScriptEnabled(true);
            showRandomFact();

            Button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    showRandomFact();
                }
            });
        }

        public void showRandomFact(){
            shuffleFacts();
            ImageView.setImageResource(factArray[0].getmImage());
            TextView.setText(factArray[0].getmFact());
        }

        Facts f01 = new Facts(R.drawable.a1,"ไก่ผัดเม็ดมะม่วงหิมพาน\n" +
                "พลังงานทั้งหมด 335 กิโลแคลอรี่\n" +
                "ระยะเวลาการเตรียม30 นาที\n" +
                "ระยะเวลาการทำ30 นาที\n");
        Facts f02 = new Facts(R.drawable.a2,"แกงพริกกระดูกหมู\n" +
                "พลังงาน\t1,730.42\tแคลอรี\n" +
                "ระยะเวลาการเตรียม30 นาที\n" +
                "ระยะเวลาการทำ25 นาที\n" );
        Facts f03 = new Facts(R.drawable.a3,"ไข่เยี่ยวม้ากะเพรากรอบ\n" +
                "พลังงาน1,160 แคลอรี่\n" +
                "ระยะเวลาการเตรียม15 นาที\n" +
                "ระยะเวลาการทำ15 นาที\n" );
        Facts f04 = new Facts(R.drawable.a4,"ไก่ทอด\n" +
                "พลังงาน245.9แคลอรี่\n" +
                "ระยะเวลาการเตรียม25 นาที\n" +
                "ระยะเวลาการทำ20 นาที\n" );
        Facts f05 = new Facts(R.drawable.a5,"ขนมปังหน้าหมู\n" +
                "พลังงาน 412.1 กิโลแคลอรี่\n" +
                "ระยะเวลาการเตรียม30 นาที\n" +
                "ระยะเวลาการทำ20 นาที\n");
        Facts f06 = new Facts(R.drawable.a6,"แกงเขียวหวานเนื้อ\n" +
                "พลังงาน 256.58 กิโลแคลอรี่\n" +
                "ระยะเวลาการเตรียม15 นาที\n" +
                "ระยะเวลาการทำ15 นาที\n");
        Facts f07 = new Facts(R.drawable.a7,"แกงจืดไข่น้ำ\n" +
                "แกงจืดไข่น้ำ เป็นเมนูแกงจืดที่เด็กๆ ต่างชื่นชอบ เพราะมีไข่เจียว เมนูยอดฮิตเป็นหนึ่งในส่วนผสม นอกจากนี้น้ำซุปอร่อยเข้มข้นจะทำให้ซดน้ำแกงได้คล่องคอมากยิ่งขึ้น เชิญทดลองทำแกงจืดไข่น้ำสูตรเด็ดได้เลย\n" +
                "ระยะเวลาการเตรียม15 นาที\n" +
                "ระยะเวลาการทำ20 นาที\n");
        Facts f09 = new Facts(R.drawable.a9,"แกงอ่อมกระดูกหมู\n" +
                "แกงอ่อมกระดูกหมู เป็นเมนูสำหรับคนที่ชื่นชอบการรับประทานผัก เนื่องจากมีผักมากมายหลายชนิดเป็นส่วนประกอบ เมื่อนำมาต้มให้เข้ากับความหวานของน้ำต้มกระดูกหมูและ รสชาติของกระดูกหมูที่เปื่อย รับรองว่าเป็นรสชาติที่อร่อยจนไม่อยากวางช้อนเลยทีเดียว\n" +
                "ระยะเวลาการเตรียม30 นาที\n" +
                "ระยะเวลาการทำ30 นาที\n");
        Facts f010 = new Facts(R.drawable.a10,"ต้มข่าไก่\n" +
                "ต้มข่าไก่ อาหารประเภทแกงกะทิที่ทุกคนรู้จักเป็นอย่างดี รสจัดนิดๆ ไม่ถึงกับจัดจ้าน เหมาะสำหรับผู้ที่ไม่ชอบทานเผ็ดมาก และยังหอมกลิ่นกะทิ และสมุนไพรไทยอีกด้วย\n" +
                "\n" +
                "ระยะเวลาการเตรียม20 นาที\n" +
                "ระยะเวลาการทำ20 นาที\n");
        Facts f011 = new Facts(R.drawable.a11,"หมูตุ๋นเครื่องยาจีน\n" +
                "“หมูตุ๋นเครื่องยาจีน” เป็นอาหารที่ใครๆ ต่างรู้จักเป็นอย่างดี เพราะเป็นอาหารที่มีประโยชน์ต่อร่างกาย ดังนั้นเราจึงขอนำเสนอสูตรเด็ดเคล็ดลับให้กับทุกท่านได้ลองทำทานกัน บอกเลยว่าวิธีทำก็ไม่ยากอย่างที่คิด เพียงลองทำตามสูตรทางด้านล่างนี้\n" +
                "ระยะเวลาการเตรียม25 นาที\n" +
                "ระยะเวลาการทำ40 นาที\n");
        Facts f012 = new Facts(R.drawable.a12,"เต้าเจี้ยวหลน\n" +
                "ถ้ามองหาเมนูสุขภาพ รสชาติเด็ด ๆ พร้อมรับประทานคู่กับผักสดหลากหลายชนิดเป็นเครื่องเคียง ขอแนะนำเต้าเจี้ยวหลนให้ได้ลิ้มลองกัน นับว่าเป็นเมนูเครื่องจิ้มสไตล์ไทยๆ ที่อยากให้ทุกคนได้ลองชิม\n");
        Facts f013 = new Facts(R.drawable.a13,"ยำปลาดุกฟู\n" +
                "หากพูดถึงยำ แน่นอนว่ายำปลาดุกฟูนั้นจะต้องเป็นเมนูที่ใครหลาย ๆ คนนึกถึงเป็นอันดับแรกความกรอบของปลาดุกฟูคลุกเคล้ากับรสชาติหวานอมเปรี้ยวของน้ำยำแถมยังชูรสชาติด้วยมะม่วงดิบซอยเป็นฝอย ๆ รับประทานพอดีคำ พูดแล้วทำให้ชวนน้ำลายสออยากจะลิ้มลองในทันใด\n" +
                "ระยะเวลาการเตรียม45 นาที\n" +
                "ระยะเวลาการทำ25 นาที\n");
        Facts f014 = new Facts(R.drawable.a14,"ลาบไก่\n" +
                "เรามาเอาใจคนที่กำลังลดน้ำหนักอยู่ด้วยเมนูลาบไก่ เพราะเนื้อไก่นั้นเป็นเนื้อสัตว์ที่มีไขมันอิ่มตัวน้อยและย่อยง่าย เพื่อเพิ่มรสชาติให้กับเนื้อไก่จึงนำมาคลุกเคล้ากับเครื่องปรุงของลาบ ทำให้รสชาติจัดจ้านขึ้น ทานคู่กับผักเคียง หรือข้าวเหนียวร้อน ๆ ยิ่งเพิ่มความอร่อยได้เลยทีเดียว\n" +
                "ระยะเวลาการเตรียม25 นาที\n" +
                "ระยะเวลาการทำ15 นาที\n");
        Facts f015 = new Facts(R.drawable.a15,"น้ำพริกปลาทู\n" +
                "น้ำพริกปลาทู เป็นเมนูขึ้นชื่อที่แสดงถึงความเป็นไทย มีรสชาติอร่อยจัดจ้าน ทำทานได้ง่ายเพราะส่วนผสมและเครื่องปรุงหาได้ง่ายในทุกท้องถิ่น ทานคู่กับผักสดหรือผักลวกตามชอบ เป็นอีกเมนูหนึ่งที่นอกจากอร่อยแล้วยังดีต่อสุขภาพ\n" +
                "ระยะเวลาการเตรียม25 นาที\n" +
                "ระยะเวลาการทำ15 นาที\n");
        Facts f016 = new Facts(R.drawable.a16,"ต้มจืดฟักหมูสับวุ้นเส้นสาหร่าย\n" +
                "เมนูที่จะแนะนำต่อไปนี้ คือ เมนูต้มจืดฟักหมูสับวุ้นเส้นสาหร่าย เป็นเมนูที่มีขั้นตอนการทำที่ไม่ยาก สามารถทำทานภายในครอบครัวได้ โดยเมนูต้มจืดฟักหมูสับวุ้นเส้นสาหร่าย เหมาะสำหรับเด็กที่เพิ่งหัดทานอาหาร เพราะช่วยในการย่อยอาหาร\n" +
                "\n" +
                "ระยะเวลาการเตรียม20 นาที\n" +
                "ระยะเวลาการทำ25 นาที\n");
        Facts f017 = new Facts(R.drawable.a17,"พะโล้หมู\n" +
                "\n" +
                "หลายคนชื่นชอบการทานพะโล้มาก แต่ไม่ค่อยได้ทำทานกันเองเนื่องจาก มีกระบวนการที่ยุ่งยาก แต่จริงๆ แล้วการทำพะโล้ให้อร่อยนั้นไม่ได้ยุ่งยากอย่างที่ใครๆ คิดแถมยังอุดมไปด้วยสมุนไพรนานาชนิดอีกด้วย\n" +
                "\n" +
                "ระยะเวลาการเตรียม20 นาที\n" +
                "ระยะเวลาการทำ45 นาที\n");
        Facts f018 = new Facts(R.drawable.a18,"ข้าวคลุกกะปิ\n" +
                "ข้าวคลุกกะปิ เป็นอาหารที่มีเครื่องเคียงหลายชนิด ทั้งไข่เส้น มะม่วง กุ้งแห้ง เป็นต้น เหมาะสำหรับผู้ที่ชอบทานอาหารเครื่องเคียงหลากหลาย นอกจากนี้ข้าวคลุกกะปิยังมีขั้นตอนการทำที่ง่าย สามารถลองทำให้ที่บ้านรับประทานกันได้ ตามสูตรนี้ได้เลย\n" +
                "\n" +
                "ระยะเวลาการเตรียม30 นาที\n" +
                "ระยะเวลาการทำ30 นาที\n");
        Facts f019 = new Facts(R.drawable.a19,"ข้าวผัดไข่\n" +
                "ข้าวผัดไข่ เป็นเมนูง่ายๆ ทำไม่ยาก เรียกได้ว่า เปิดตู้เย็น เจอไข่ กับผักบางชนิดก็สามารถปรุงเมนูนี้ได้แล้ว นอกจากนี้ ข้าวผัดไข่ยังเหมาะกับผู้อ่านที่สนใจการทานมังสวิรัติ เพราะไม่มีส่วนผสมของเนื้อสัตว์\n" +
                "\n" +
                "ระยะเวลาการเตรียม10 นาที\n" +
                "ระยะเวลาการทำ10 นาที\n");
        Facts f020 = new Facts(R.drawable.a20,"ข้าวหมกไก่\n" +
                "ข้าวหมกไก่เป็นเมนูอาหารที่ได้รับอิทธิพลมาจากชาวอินเดีย กลิ่นหอมของเครื่องเทศนานาชนิด สีของข้าวที่เหลืองสวยชวนรับประทาน จะทำให้เมนูนี้เป็นที่ติดใจของใครหลายคน\n" +
                "\n" +
                "ระยะเวลาการเตรียม35 นาที\n" +
                "ระยะเวลาการทำ30 นาที\n");
       Facts f021 = new Facts(R.drawable.a21,"ผัดหมี่โคราช\n" +
               "ก่อนลงมือทำผัดหมี่โคราช มาทราบประวัติคร่าวๆ ของผัดหมี่โคราชกันสักหน่อย ผัดหมี่โคราชมีต้นกำเนิดมาจากโคราช และมีลักษณะคล้ายกับผัดไทย แต่ผัดหมี่โคราชจะใช้เส้นหมี่ของตนเอง เรียกว่า เส้นหมี่โคราช และไม่ใส่ไข่ อีกทั้งยังมีเครื่องน้อยกว่าผัดไทยด้วย หากสงสัยว่ารสชาติจะเป็นอย่างไร ต้องลองทำชิมดู\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ2-3\n" +
               "ระยะเวลาการเตรียม30 นาที\n" +
               "ระยะเวลาการทำ20 นาที\n");
       Facts f022 = new Facts(R.drawable.a22,"ปูผัดผงกะหรี่ เมนูอาหารยอดฮิตตามภัตตาคาร เป็นเมนูที่มีขั้นตอนการทำที่ไม่ยาก ไม่ต้องไปทานถึงภัตตาคารทำทานเองที่บ้านก็อร่อยได้\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ2-3\n" +
               "ระยะเวลาการเตรียม25 นาที\n" +
               "ระยะเวลาการทำ20 นาที\n");
       Facts f023 = new Facts(R.drawable.a23,"หลายคนคงปฏิเสธไม่ได้ว่าผัดกะเพราะไก่นั้น เป็นเมนูยอดนิยมอีกเมนูหนึ่งที่มีวิธีการทำที่ไม่ยุ่งยากซับซ้อนเหมาะที่จะทำรับประทานเองที่บ้านเป็นอย่างยิ่ง\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-4\n" +
               "ระยะเวลาการเตรียม10 นาที\n" +
               "ระยะเวลาการทำ10 นาที\n");
       Facts f024 = new Facts(R.drawable.a24,"เรามาลองเปลี่ยนรสชาติจากผัดกะเพราหมู กะเพราไก่อันแสนจะธรรมดามาเป็นรสชาติของอาหารทะเล เพื่อให้ได้ความแปลกใหม่ไปจากเดิม ของอาหารยอดนิยมซึ่งจะมีรสชาติที่จัดจ้าน รับรองว่าทุกคนที่ได้ลิ้มลองจะชื่นชอบ\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-4\n" +
               "ระยะเวลาการเตรียม15 นาที\n" +
               "ระยะเวลาการทำ10 นาที\n");
       Facts f025 = new Facts(R.drawable.a25,"“บวบ” เป็นผักที่มีแร่ธาตุสำคัญอย่างฟอสฟอรัสและธาตุเหล็กที่ช่วยสร้างเม็ดเลือดแดง ประโยชน์จากบวบนั้นมีมากมาย เราจึงขอแนะนำเมนูอาหารที่ทำจากบวบซึ่งมีขั้นตอนการทำไม่ยากและรับรองในความอร่อย ก็คือ ผัดบวบไข่ใส่กุ้งเมนูนี้นั่นเอง\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-4\n" +
               "ระยะเวลาการเตรียม20 นาที\n" +
               "ระยะเวลาการทำ20 นาที\n");
       Facts f026 = new Facts(R.drawable.a26,"ผัดปลาหมึกไข่เค็ม อาหารรสชาติอร่อยสีสวยที่หลายท่านรู้จักเป็นอย่างดี โดยมากมักทานในร้านอาหารหรือภัตตาคาร ในความเป็นจริงปลาหมึกผัดไข่เค็มนั้นทำได้ง่าย เครื่องปรุงน้อย จึงขอเสนอสูตรปลาหมึกผัดไข่เค็มให้ลองทำทานด้วยตนเอง\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ2-3\n" +
               "ระยะเวลาการเตรียม20 นาที\n" +
               "ระยะเวลาการทำ10 นาที\n");
       Facts f027 = new Facts(R.drawable.a27,"มะตะบะไส้ไก่ เป็นอาหารอิสลามที่เป็นที่รู้จักและนิยมโดยทั่วไป มะตะบะไส้ไก่เป็นอาหารที่มีส่วนผสมจากเครื่องเทศเป็นหลัก นอกจากเครื่องเทศแล้วยังใช้แป้งโรตีมาเป็นส่วนประกอบซึ่งเป็นส่วนผสมที่ลงตัว อร่อยกลมกล่อมทั้งจากไส้ที่มีเครื่องเทศและแป้งโรตีหอมๆ\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ6-7\n" +
               "ระยะเวลาการเตรียม45 นาที\n" +
               "ระยะเวลาการทำ15 นาที\n");
       Facts f028 = new Facts(R.drawable.a28,"ทอดมันข้าวโพดเป็นเมนูที่เด็ก ๆ ชื่นชอบ วิธีการทำไม่ยุ่งยาก เพียงนำเอาเมล็ดข้าวโพดผสมกับเครื่องปรุงแล้วนำมา ทอดจนสุกเหลืองหอมกินกับซอสมะเขือเทศหรือซอสพริกได้ตามชอบ สามารถนำเมนูทอดมันข้าวโพดนี้มาเป็นเมนูทานเล่นให้เด็ก ๆ ได้\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-4\n" +
               "ระยะเวลาการเตรียม25 นาที\n" +
               "ระยะเวลาการทำ20 นาที\n");
       Facts f029 = new Facts(R.drawable.a29,"แกงเผ็ดไก่ใส่หน่อไม้ เป็นเมนูยอดฮิตตามร้านขายข้าวแกงทั่วไป ทั้งที่จริงแล้วเมนูนี้สามารถทำรับประทานเองได้ที่บ้าน เนื่องจากขั้นตอนการทำแกงเผ็ดไก่ใส่หน่อไม้ไม่ยุ่งยากอย่างที่คิด\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ6-7\n" +
               "ระยะเวลาการเตรียม30 นาที\n" +
               "ระยะเวลาการทำ15 นาที\n");
       Facts f030 = new Facts(R.drawable.a30,"ผักโขมอบชีส เป็นอาหารอิตาเล่ียนที่ได้รับความนิยมอย่างมากในไทย เรียกได้ว่า น้อยคนนักที่จะไม่รู้จักผักโขมอบชีส เมนูนี้จะได้คุณประโยชน์จากผักโขมและความหอมกรุ่นจากชีส เป็นการผสมผสานกันอย่างลงตัว\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-4\n" +
               "ระยะเวลาการเตรียม20 นาที\n" +
               "ระยะเวลาการทำ15 นาที\n");
       Facts f031 = new Facts(R.drawable.a31,"วันนี้ เราขอนำเสนอเมนูอาหารแซ่บครบรส ทั้งเปรี้ยว หวาน เค็ม เป็นของโปรดของใครหลายคน นั่นคือยำหมูยอ ขั้นตอนการทำเมนูยำหมูยอทำได้ง่ายมาก อีกทั้งยังสามารถปรุงรสได้ตามชอบของแต่ละคนได้เลย\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3\n" +
               "ระยะเวลาการเตรียม20 นาที\n" +
               "ระยะเวลาการทำ5 นาที\n");
       Facts f032 = new Facts(R.drawable.a32,"ขนมจีบ เป็นหนึ่งในเมนูติ่มซำยอดนิยม แต่วิธีการทำไม่ได้ยุ่งยากอย่างที่คิด โดยวันนี้ เราจะแนะนำวิธีการทำขนมจีบกุ้งปูที่อร่อยน่าลิ้มลองอย่างยิ่ง\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-4\n" +
               "ระยะเวลาการเตรียม15 นาที\n" +
               "ระยะเวลาการทำ10 นาที\n");
       Facts f033 = new Facts(R.drawable.a33,"แกงส้มนั้นสามารถที่จะดัดแปลงได้หลากหลายแบบ การนำดอกแคริมรั้วที่ปลูกไว้ใส่ลงไปก็จะได้เมนูใหม่ โดยรสชาติที่ได้นั้นจะเปรี้ยว หวานและมันในรสชาติของดอกแค ทั้งกลมกล่อมและได้รสชาติของเครื่องแกง หากได้รับประทานเมนูแกงส้มดอกแคกุ้งสดจานนี้รับรองไม่ผิดหวัง\n" +
               "\n" +
               "จำนวนคนที่เสิร์ฟ3-5\n" +
               "ระยะเวลาการเตรียม15 นาที\n" +
               "ระยะเวลาการทำ10 นาที\n");


               Facts [] factArray = new Facts[]{
                f01,f02,f03,f04,f05,f06,f07,f09,f010,f011,f012,f013,f014,f015,f016,f017,f018,f019,f020,f021,f022,f023,f024,f025,f026,f027,f028,f029,f030,f031,f032,f033
        };
        public void shuffleFacts(){
            Collections.shuffle(Arrays.asList(factArray));
        }
    public void Menurecipeopen (View view){
        Intent Menurecipeform =new Intent(this,MenurecipeActivity.class);
        startActivity(Menurecipeform);
        finish();
    }
    public void openyoutube(View view){
        Showweb.loadUrl("https://www.youtube.com/");
    }
    public void openwed(View view){
        Showweb.loadUrl("https://www.thairath.co.th/news");
    }
    }

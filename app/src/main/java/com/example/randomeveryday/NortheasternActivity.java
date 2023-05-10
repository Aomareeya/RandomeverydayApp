package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NortheasternActivity extends AppCompatActivity {
    public AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_northeastern);

    }
    public void Synopsis(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ผาชะนะได (อุบลราชธานี)");
        builder.setMessage("หากใครอยากเห็นแสงแรกของวันก็ต้องมาที่แห่งนี้ เพราะเป็นสถานที่ที่พระอาทิตย์ขึ้นเป็นที่แรกของในทุก ๆ วันของประเทศไทย ผาชะนะไดเป็นภูเขาสูงที่อยู่เหนือระดับน้ำทะเลประมาณ 450 เมตร ช่วงที่สวยที่สุดและเหมาะกับการไปเที่ยวคือช่วงเดือน ตุลาคม – กุมภาพันธ์ เพราะอากาศกำลังเย็นสบาย มีทะเลหมอกให้ได้ชม");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis2(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("สามพันโบก (อุบลราชธานี)");
        builder.setMessage("สามพันโบกหรือแกรนด์แคนยอนเมืองไทย ตั้งอยู่ที่บ้านสองคอน อ.โพธิ์ไทร โดยเราจะได้เห็นทัศนียภาพของหินที่ถูกน้ำกัดเซาะเป็นแอ่งเล็กใหญ่เป็นรูปทรงต่าง ๆ ที่มีมากกว่า 3,000 แอ่ง สามารถเช่าเรือเพื่อล่องไปตามลำน้ำโขงได้ด้วย โดยเรือจะพาเรานำเที่ยวไปยังสามพันโบก หาดหงส์ หินหัวพะเนียง ปากบ้อง และผาหินศิลาเลข แนะนำให้ไปช่วงเช้าหรือช่วงเย็นที่ไม่ค่อยมีแดด ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis3(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อุทยานแห่งชาติผาแต้ม (อุบลราชธานี)");
        builder.setMessage("เป็นอุทยานแห่งชาติที่มีความอุดมสมบูรณ์เป็นอย่างมาก โดยเฉพาะพันธุ์ไม้ดอกต่าง ๆ ที่มีสภาพป่าที่อุดมสมบูรณ์ มีสัตว์ป่านานาชนิดให้เราได้ชม ภูผาขาม ภูผาเมย ภูผาเจ็ก ภูผาสร้อย ภูย่าแพะ ผาชะนะได ฯลฯ รวมไปถึงเป็นแหล่งต้นน้ำลำธารของหลายๆ ห้วย โดยบริเวณผาแต้มจะมีจุดกางเต้นท์และที่พักต่าง ๆ มีภาพเขียนสีสำคัญทางประวัติศาสตร์อายุมากกว่า 3,000 ปีให้เราได้ชมอีกด้วย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis4(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("น้ำตกแสงจันทร์ (อุบลราชธานี)");
        builder.setMessage("หน้าฝนก็ต้องเที่ยวน้ำตก ซึ่งที่อุบลราชธานีก็มีน้ำตกแสงจันทร์ ซึ่งมีความมหัศจรรย์ตรงที่ไหลลอดผ่านช่องหินที่มีรูขนาดใหญ่ จนใคร ๆ ต่างก็เรียกว่า “น้ำตกลงรู” ส่วนชื่อน้ำตกแสงจันทร์นั้นก็เพราะว่าเวลาที่น้ำตกลอดผ่านช่องหินลงมากระทบกับแสงจันทร์ในวันเพ็ญ แสงจันทร์จะส่องลงมาตรงรูหินพอดีทำให้เกิดภาพที่สวยงามเป็นอย่างมากนั่นเอง");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis5(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อุทยานแห่งชาติแก่งตะนะ (อุบลราชธานี)");
        builder.setMessage("เป็นบริเวณที่มีแม่น้ำมูลและแม่น้ำโขงไหลผ่าน สามารถชมวิวแม่น้ำโขงได้อย่างฟิน ๆ โดยอุทยานแห่งชาติแก่งตะนะมีสถานที่ท่องเที่ยวให้เราได้เที่ยวหลาย เหมาะแก่การพักผ่อนเป็นอย่างมาก ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis6(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูกระดึง (เลย)");
        builder.setMessage("ว่ากันว่าหากอยากพิสูจน์รักก็ต้องพาคนรักไปขึ้นภูกระดึง เพราะต้องใช้ระยะเวลาในการเดินขึ้นยอดภูผ่านจุดน่าสนใจมากมาย เช่น “ผานกแอ่น” จุดท่องเที่ยวชมพระอาทิตย์ขึ้นที่สำคัญ “ผาหล่มสัก” จุดชมพระอาทิตย์ตกที่ต้องมาให้ได้เมื่อจะไปพิชิตยอดภูกระดึง “ผาหมากดูก” ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis7(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูป่าเปาะ (เลย)");
        builder.setMessage("จุดชมวิวที่อยู่สูงจากระดับน้ำทะเลประมาณ 900 เมตร ที่เราสามารถเห็น “ภูหอ” ภูเขายอดตัดที่มีลักษณะเหมือนภูเขาไฟฟูจิประเทศญี่ปุ่น จนได้ชื่อว่าเป็นฟูจิแห่งเมืองไทย สวยงามมากในช่วงที่มีทะเลหมอกปกคลุม เพราะเราจะได้เห็นทิวทัศน์เหมือนภูเขาไฟฟูจิเป็นอย่างมาก ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis8(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูลมโล (เลย)");
        builder.setMessage("ดินแดนแห่งซากุระเมืองไทยที่ได้ชื่อนี้ก็เพราะว่าเป็นจุดชมดอกนางพญาเสือโคร่งสำคัญในประเทศไทย ที่มีอาณาเขตกว่าพันไร่ เราจะได้เห็นดอกนางพญาเสือโคร่งกระจัดกระจายอยู่ทั่วภูลมโล และสวยงามเป็นอย่างมากในช่วงเดือนมกราคม - กุมภาพันธ์ ตั้งอยู่ในเขตอุทยานแห่งชาติภูหินร่องกล้า บนรอยต่อของ 3 จังหวัด ได้แก่ เลย เพชรบูรณ์ และพิษณุโลก นอกจากการไปชมดอกนางพญาเสือโคร่งแล้วยังมีกิจกรรมให้ได้ทำอีก เช่น แรลลี่ลงภู นั่งรถฟอร์มูล่าม้งขับลงเนิน เป็นต้น");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis9(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อุทยานแห่งชาติภูเรือ (เลย)");
        builder.setMessage("สัมผัสอากาศหนาวๆ กันที่อุทยานแห่งชาติภูเรือ จ.เลย ภายในอุทยานมีสถานที่ท่องเที่ยวสำคัญให้เราได้สัมผัสกับธรรมชาติอยู่มากมาย เช่น “ยอดภูเรือ” จุดชมวิวที่สูงที่สุดในอุทยานแห่งชาติภูเรือที่มีดอกกระเจียวให้ได้ชมในช่วงฤดูฝน “ผาโหล่นน้อย” จุดชมพระอาทิตย์ขึ้นที่สามารถมองเห็นภูหลวง ภูผาสาด ภูครั่ง และทะเลภูเขาได้ “น้ำตกห้วยไผ่” แหล่งน้ำสำคัญในภูเรือ นอกจากนั้นยังมีผาซำทอง ลาดหินแตก สวนหินพาลี น้ำตกแก่งสุข ถ้ำไทร ฯลฯ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis10(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("แก่งคุดคู้ (เลย)");
        builder.setMessage("เป็นอีกหนึ่งจุดชมวิวธรรมชาติที่สวยงามของ จ.เลย และสามารถมองเห็นวิวประเทศลาวได้ด้วย เราสามารถไปเดินเล่น ปั่นจักรยาน กินลม ชมวิวริมโขง ทานอาหาร หรือจะล่องเรือหางยาวชิล ๆ ก็สามารถทำได้ ช่วงเวลาที่เหมาะสมกับการมาเที่ยวที่นี่ก็คือเดือนกุมภาพันธ์ – พฤษภาคม");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis11(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ทะเลบัวแดง (อุดรธานี)");
        builder.setMessage("เป็นอีกไฮไลท์เด็ดของการชมทุ่งดอกไม้ในภาคอีสานในช่วงเดือนกุมภาพันธ์ของทุกปี เหล่าดอกบัวในบึงหนองหาน อ.กุมภวาปี แห่งนี้จะแข่งกันบานสะพรั่งไปทั่วบึงหนองหาน เกิดเป็นภาพสีชมพูอันสวยงามทั่วทั้งบึงบนเนื้อที่กว่า 10,000 ไร่ ซึ่งเราสามารถเช่าเรือเพื่อล่องเรือในบึง ถ่ายรูปสวย ๆ กันได้เลย แนะนำให้ไปช่วงพระอาทิตย์ขึ้นถึงประมาณเก้าโมงเช้า เพราะเป็นช่วงที่สวยที่สุด");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis12(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ผาเก็บตะวัน (นครราชสีมา)");
        builder.setMessage("ตั้งอยู่ที่อุทยานแห่งชาติทับลาน ต.ไทยสามัคคี อ.วังน้ำเขียว จ.นครราชสีมา เป็นจุดชมวิวที่สวยงามเป็นอย่างมาก นักท่องเที่ยวนิยมมาชมพระอาทิตย์ขึ้นและพระอาทิตย์ตกกันที่แห่งนี้ ณ จุดชมวิวเราสามารถทำยิงเมล็ดมะค่าโมง เมล็ดลานด้วยหนังสติ๊กเพื่อเป็นการปลูกป่าได้อีกด้วย อีกทั้งที่นี่ยังเป็นสถานที่ท่องเที่ยวยอดฮิตในช่วงฤดูฝนและฤดูหนาว เพราะจะได้สัมผัสกับอากาศเย็นๆ และทะเลหมอกอันสวยงาม ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis13(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("น้ำตกม่านฟ้า (นครราชสีมา)");
        builder.setMessage("น้ำตกที่ได้ชื่อว่าสวยงามราวกันม่านน้ำตกจากฟ้า ด้วยลักษณะของน้ำตกที่สูงราว 30 เมตร ตกลงมาราวกับผ้าม่านที่กว้างถึง 50 เมตร เมื่อกระทบกับแสงแดดจึงเกิดเป็นภาพที่สวยงาม บวกกับธรรมชาติอันอุดมสมบูรณ์โดยรอบจึงทำให้เป็นสถานที่ท่องเที่ยวทางธรรมชาติอีกแห่งที่ต้องไปเยือนให้ได้ โดยน้ำตกม่านฟ้านั้นตั้งอยู่ในบริเวณหน่วยพิทักษ์อุทยานแห่งชาติทับลานที่ 13");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis14(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("น้ำตกเหวสุวัต (นครราชสีมา)");
        builder.setMessage("ตั้งอยู่ในอุทยานแห่งชาติเขาใหญ่ เป็นน้ำตกหน้าผาสูงประมาณ 20 เมตร สามารถเล่นน้ำได้ทั้งด้านบนและด้านล่าง แต่ไม่เหมาะกับการเล่นน้ำในฤดูฝนเนื่องจากปริมาณน้ำมากและน้ำไหลแรง อย่างไรก็ตามธรรมชาติที่นี่ยังคงความอุดมสมบูรณ์ สายน้ำไหลเย็นฉ่ำ เหมาะกับการไปคลายร้อนเป็นที่สุด");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis15(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อ่างเก็บน้ำลำพระเพลิง (นครราชสีมา)");
        builder.setMessage("เป็นเก็บน้ำที่เรียบไปตามถนนที่เชื่อมไปยังเขาใหญ่ เป็นอีกหนึ่งสถานที่ที่จะได้พบกับทัศนียภาพอันสวยงาม สามารถไปถ่ายรูปเล่น เดินเล่น สัมผัสอากาศดี ๆ ในช่วงหน้าหนาวกันได้แบบเพลิน ๆ อีกทั้งอ่างเก็บน้ำลำพระเพลิงยังเป็นเส้นทางปั่นจักรยานที่สวยงาม เพราะมีเลนปั่นจักรยานสำหรับสายปั่นให้ได้ปั่นชมวิว สูดอากาศดี ๆ กันได้อีกด้วย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis16(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("อุทยานแห่งชาติป่าหินงาม (ชัยภูมิ)");
        builder.setMessage(" \n" +
                "เป็นสถานที่ท่องเที่ยวสำคัญในการไปชมดอกกระเจียวที่จะบานเต็มลานเป็นสีชมพูอมม่วงในช่วงเดือนมิถุนายน - สิงหาคม นอกจากนั้นในอุทยานแห่งชาติป่าหินงามยังมีสถานที่ท่องเที่ยวทางธรรมชาติที่น่าสนใจอีกมากมาย เช่น เขาพนมโดม ลานหินงาม สุดแผ่นดิน\n");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis17(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("มอหินขาว (ชัยภูมิ)");
        builder.setMessage("ตั้งอยู่ในอุทยานแห่งชาติภูแลนคา โดยมอหินขาวได้รับการขนามนามว่าเป็น “สโตนเฮนจ์เมืองไทย” เนื่องจากมีเสาหินตั้งอยู่คล้ายกับสโตนเฮนจ์ในประเทศอังกฤษ ในช่วงฤดูฝนหากมาเที่ยวที่นี่ก็จะได้พบกับธรรมชาติอันสวยงามและเขียวชอุ่ม นักท่องเที่ยวหลาย ๆ คนนิยมมากางเต้นท์นอนนับดาวที่นี่เพราะเป็นจุดชมดาวที่สวย ท้องฟ้าโปร่ง และมีอากาศเย็นสบาย");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis18(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("ภูทอก (บึงกาฬ)");
        builder.setMessage("ภูทอก มีอยู่ 2 ลูก คือภูทอกใหญ่และภูทอกน้อย โดยเราสามารถไปชมวิวธรรมชาติกันได้ที่ภูทอกน้อย ซึ่งเราต้องเดินขึ้นสู่ยอดภูทอกบนสะพานไม้และบันไดทั้งหมด 7 ชั้น แต่ละชั้นก็จะได้เห็นวิวแตกต่างกันไป โดยชั้น 5 เป็นที่ตั้งของหินพระธาตุอินแขวนด้วย เมื่อขึ้นไปแล้วจะได้ชมวิวรอบภูทอกแบบ 360 องศา ซึ่งถือเป็นไฮไลท์ของที่นี่");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis19(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("วนอุทยานน้ำตกบ๋าหลวง (ขอนแก่น)");
        builder.setMessage(" \n" +
                "ตั้งอยู่ในพื้นที่ป่าสงวนแห่งชาติป่าดงมูล ซึ่งเป็นน้ำตกที่ยังคงความอุดมสมบูรณ์อยู่มาก นอกจากการเล่นน้ำที่น้ำตกแล้ว ยังสามารถศึกษาธรรมชาติได้อีกด้วย น้ำตกที่นี่ค่อนข้างไหลแรง ดังนั้นนักท่องเที่ยวที่ชอบความตื่นเต้น และท้าทายจะมีความสนุกสนานไปกับการกระโดดน้ำจากด้านบนลงมาสู่ด้านล่างกันเลยทีเดียว\n");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
    public void Synopsis20(View view) {
        builder = new AlertDialog.Builder(this);
        builder.setTitle("จุดชมวิววัดผาตากเสื้อ (หนองคาย)");
        builder.setMessage("เป็น Skywalk กระจกใสยื่นออกไปบริเวณหน้าผาของวัดผาตากเสื้อ ที่สามารถเดินไปชมวิวแม่น้ำโขงแบบพาโนราม่าได้ หากไปในช่วงน้ำลดจะได้เห็นสันทรายเป็นริ้วคล้ายเกล็ดพญานาค นอกจากนั้นสามารถมองเห็นเมืองสังข์ทอง ประเทศลาวได้อีกด้วย ");
        builder.setPositiveButton("Choose YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
                finish();
            }
        });
        builder.setNeutralButton("Choose OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(getApplicationContext(),"ok",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }

}

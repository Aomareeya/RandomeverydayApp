package com.example.randomeveryday;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class RecipefoodActivity extends AppCompatActivity {
    ListView simpleList;
    String countryList[] = {"ไก่ผัดเม็ดมะม่วงหิมพาน", "แกงพริกกระดูกหมู","ไข่เยี่ยวม้ากะเพรากรอบ","ไก่ทอด","ขนมปังหน้าหมู","แกงเขียวหวานเนื้อ","แกงจืดไข่น้ำ","แกงอ่อมกระดูกหมู","ต้มข่าไก่","หมูตุ๋นเครื่องยาจีน","เต้าเจี้ยวหลน","ยำปลาดุกฟู","ลาบไก่","น้ำพริกปลาทู"};
    int flags[] = {R.drawable.a1, R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,};
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
            "พอเห็ดสุกใส่น้ำมันงา เม็ดมะม่วงหิมพานต์ และพริกทอดผัดพอเข้ากัน ปิดไฟ ใส่ต้นหอมผัดพอเข้ากันอีกครั้งแล้วตักใส่จานพร้อมเสิร์ฟ\n","ส่วนประกอบ\n" +
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
            "พอเดือดปรุงรสด้วย คนอร์ซุปหมูก้อน น้ำตาลปีบ และน้ำปลา ใบมะกรูดฉีกต้มต่อจนน้ำขลุกขลิก ปิดไฟใส่ใบมะกรูด และพริกชี้ฟ้าซอย ตักใส่ถ้วย เสิร์ฟพร้อมผักเหนาะ (แตงกวา มะเขือเปราะ และผักต่างๆ ตามชอบ)\n","ส่วนประกอบ\n" +
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
            "ใส่พริกชี้ฟ้า และใบกะเพราผัดให้เข้ากันอีกครั้ง จัดเสิร์ฟโดยราดผัดกะเพราลงบนไข่เยี่ยวม้าที่ทอดไว้ โรยหน้าด้วยใบกะเพรากรอบ\n","ส่วนประกอบ\n" +
            "ปีกกลาง หรือปีกบนไก่ หรือเนื้อสะโพกไก่หั่นชิ้นพอคำ 1 กิโลกรัม\n" +
            "คนอร์อร่อยชัวร์รสไก่ (2 ช้อนโต๊ะ) 24-28 กรัม\n" +
            "น้ำเย็น (1/3 ถ้วยตวง) 80 กรัม\n" +
            "คนอร์แป้งข้าวโพด หรือแป้งสาลี(2 ช้อนโต๊ะ) 16 กรัม\n" +
            "น้ำมันพืชสำหรับทอดประมาณ 500 กรัม\n" +
            "วิธีทำ\n" +
            "หมักไก่โดยล้างไก่ให้สะอาด สะเด็ดน้ำใส่กะละมังไว้\n" +
            "ใส่คนอร์อร่อยชัวร์รสไก่ แป้ง และน้ำลงในกะละมังไก่ ผสมส่วนผสมทั้งหมดให้เข้ากัน และผงปรุงรสละลายดี\n" +
            "นำไก่ที่ได้หมักไว้ในตู้เย็นประมาณ 1 ชั่วโมง (หรือ 1 คืนก็ได้) หรือถ้าไม่มีตู้เย็นให้ใช้ถังน้ำแข็งแทน\n" +
            "ทอดไก่โดยนำไก่ที่หมักไว้ออกจากตู้เย็นคนให้เข้ากันอีกครั้ง แล้วนำไก่ขึ้นจากน้ำที่หมักไก่\n" +
            "นำกระทะใส่น้ำมันตั้งไฟโดยใช้ไฟกลาง พอร้อนใส่ไก่ลงไปทอดให้เหลืองทั้งสองด้าน\n" +
            "นำขึ้นจากกระทะสะเด็ดน้ำมัน จัดใส่จานพร้อมเสิร์ฟ\n" +
            "หมายเหตุ น้ำมันที่ใช้ทอดควรเป็นน้ำมันปาล์มเพราะจะทำให้อาหารที่ทอดกรอบเก็บได้นานไม่นิ่ม\n","ส่วนประกอบ\n" +
            "ขนมปังแผ่น 10 แผ่น\n" +
            "หมูสับ 1 ถ้วยตวง\n" +
            "คนอร์อร่อยชัวร์ 1 ช้อนชา\n" +
            "รากผักชี กระเทียม พริกไทยโขลกละเอียด 2 ช้อนชา\n" +
            "ไข่ไก่ตีให้เข้ากัน 1 ฟอง\n" +
            "น้ำมันพืชสำหรับทอด\n" +
            "พริกชี้ฟ้าซอยเป็นเส้นบาง และใบผักชี สำหรับตกแต่ง\n" +
            "รับประทานคู่กับน้ำอาจาด ซอสพริก หรือ ซอสมะเขือเทศ\n" +
            "วิธีทำ\n" +
            "หั่นแบ่งขนมปัง 1 แผ่นเป็น 4 ชิ้น นำไปผึ่งลมให้หน้าขนมปังแห้งประมาณ 1 ชม.\n" +
            "ผสมหมูสับกับคนอร์อร่อยชัวร์ รากผักชี กระเทียม พริกไทยโขลกละเอียด และ ไข่ไก่ ½ ฟอง นวดให้ส่วนผสมทั้งหมดเข้ากัน หมักทิ้งไว้ประมาณ 20 นาที\n" +
            "นำหมูที่หมักทาลงบนขนมปังที่เตรียมไว้ ตกแต่งด้วยใบผักชี และพริกชี้ฟ้า แล้วนำขนมปังด้านที่ทาหมูไปชุบลงบนไข่ที่เหลือ\n" +
            "นำไปทอดโดยใส่ด้านที่มีหมูลงในน้ำมันก่อน พอทั้งสองด้านสุกเหลืองดีแล้วตักขึ้นสะเด็ดน้ำมัน เสิร์ฟโดยรับประทานคู่กับ อาจาด ซอสพริก หรือ ซอสมะเขือเทศ\n","ส่วนประกอบ\n" +
            "เนื้อสันใน หรือเนื้อส่วนติดมัน 500 กรัม\n" +
            "มะเขือเปราะ 1 ลูก ผ่า 4 ซีก 3 ถ้วยตวง\n" +
            "หัวกะทิ 1 ถ้วยตวง\n" +
            "หางกะทิ 4 ถ้วยตวง\n" +
            "ใบมะกรูดฉีก 5 ใบ\n" +
            "มะเขือพวง ½ ถ้วยตวง\n" +
            "พริกชี้ฟ้าแดงหั่นแฉลบ 2 เม็ด\n" +
            "ใบโหระพา ½ ถ้วยตวง\n" +
            "น้ำตาลปีบ ½-1 ช้อนโต๊ะ\n" +
            "น้ำปลา 1 ช้อนโต๊ะ\n" +
            "คนอร์ซุปเนื้อก้อน 2 ก้อน\n" +
            "น้ำพริกแกงเขียวหวานประมาณ 100 กรัม\n" +
            "พริกขี้หนูบุบ 10 เม็ด\n" +
            "ส่วนผสมน้ำพริกแกงเขียวหวาน\n" +
            "พริกชี้ฟ้าเขียว 2 ช้อนโต๊ะ\n" +
            "พริกขี้หนูเขียว 1 ช้อนโต๊ะ\n" +
            "หัวหอมแดง 2 ช้อนโต๊ะ\n" +
            "กระเทียม 2 ช้อนโต๊ะ\n" +
            "ข่า ½ ช้อนชา\n" +
            "รากผักชี 1 ช้อนชา\n" +
            "กะปิ 1 ช้อนชา\n" +
            "ลูกผักชีคั่วป่น 1 ช้อนชา\n" +
            "ตะไคร้ 1 ช้อนโต๊ะ\n" +
            "ผิวมะกรูดซอย ½ ช้อนชา\n" +
            "พริกไทย 10 เม็ด\n" +
            "เกลือ ½ ช้อนชา\n" +
            "ยี่หร่าคั่วป่น ½ ช้อนชา\n" +
            "วิธีทำ\n" +
            "โขลกเครื่องน้ำพริกตามส่วนผสมให้ละเอียด แล้วพักไว้\n" +
            "หั่นเนื้อวัวตามขวางของเส้นใยเนื้อ แล้วพักไว้\n" +
            "ตั้งหม้อใส่หางกะทิบนไฟเดือด ใส่เนื้อที่หั่นไว้ลงไปในหม้อ ลดไฟลงเคี่ยวประมาณ 20-30 นาที จนเนื้อนุ่ม\n" +
            "ตั้งกระทะบนไฟแรงจนร้อน ผัดหัวกะทิกับน้ำพริกให้แตกมันและมีกลิ่นหอม ใส่เนื้อที่เคี่ยวกับหางกะทิไว้ลงไปพร้อมตั้งไฟเดือด\n" +
            "ปรุงรสด้วยคนอร์ซุปเนื้อก้อน น้ำปลา น้ำตาล แล้วใส่มะเขือเปราะ และมะเขือพวง\n" +
            "ตั้งไฟให้เดือด จนมะเขือสุก ใส่พริกขี้หนู พริกชี้ฟ้า ใบมะกรูด ใบโหระพา จัดใส่ชามพร้อมเสิร์ฟ\n" +
            "หมายเหตุ การเคี่ยวเนื้ออาจทำให้น้ำแกงเหลือน้อยลง สามารถเติมน้ำเพิ่มได้\n","ส่วนประกอบ\n" +
            "ไข่ไก่ 3 ฟอง\n" +
            "คนอร์อร่อยชัวร์ 1 ช้อนชา\n" +
            "หัวหอมใหญ่หั่นเสี้ยว ½ หัวเล็ก\n" +
            "มะเขือเทศหั่นเต๋า 1 ลูก\n" +
            "คนอร์ซุปหมูก้อน 2 ก้อน\n" +
            "น้ำเปล่า 1 ลิตร\n" +
            "ต้นหอม ผักชีซอยสำหรับโรยหน้าตามชอบ\n" +
            "น้ำมันพืชสำหรับทอดไข่\n" +
            "วิธีทำ\n" +
            "\n" +
            "ตอกไข่ใส่ถ้วย ใส่คนอร์อร่อยชัวร์ตีให้เข้ากัน นำไปทอดให้สุกเหลืองทั้งสองด้านหั่นเป็นชิ้นสี่เหลี่ยมขนาดพอคำ พักไว้\n" +
            "ตั้งหม้อต้มน้ำบนไฟกลางจนเดือด ใส่คนอร์ซุปหมูก้อนต้มสักครู่พอละลาย ใส่หัวหอมใหญ่ และมะเขือเทศต้มพอสุก แล้วจึงใส่ไข่ที่เตรียมไว้ต้มพอเดือด ยกลงจากเตา จัดใส่ถ้วย โรยหน้าด้วยต้นหอม ผักชี และกระเทียมเจียวพร้อมเสิร์ฟ\n","ส่วนประกอบ\n" +
            "กระดูกหมูหั่นชิ้นพอคำ 300 กรัม\n" +
            "ข่าอ่อนหั่นแว่นบาง 7 แว่น\n" +
            "ตะไคร้หั่นท่อนยาว 1 นิ้ว 1 ต้น\n" +
            "ใบมะกรูดฉีก 5 ใบ\n" +
            "รากผักชี 3 ราก\n" +
            "ผักชีฝรั่งซอย 2 ช้อนโต๊ะ\n" +
            "ผักชีซอย 1 ช้อนโต๊ะ\n" +
            "ต้นหอมซอย 1 ช้อนโต๊ะ\n" +
            "น้ำมันพืช 1 ช้อนโต๊ะ\n" +
            "น้ำเปล่า 1.2 ลิตร\n" +
            "คนอร์ซุปหมูก้อน 1 ก้อน\n" +
            "เครื่องน้ำพริกแกง\n" +
            "พริกแห้ง 7 เม็ด\n" +
            "พริกขี้หนูแห้ง 4 เม็ด\n" +
            "หอมแดง 3 หัว\n" +
            "กระเทียม 20 กลีบ\n" +
            "ตะไคร้ซอย 1 ช้อนโต๊ะ\n" +
            "ข่าแก่ซอย 1 ช้อนโต๊ะ\n" +
            "เกลือ 1 ช้อนชา\n" +
            "กะปิ ½ ช้อนโต๊ะ\n" +
            "วิธีทำ\n" +
            "นำเกลือป่นกับพริกแห้งมาโขลกให้เข้ากัน ใส่กระเทียม หอมแดง ข่า ตะไคร้ และกะปิลงไป พร้อมโขลกรวมกันให้ละเอียด พักไว้\n" +
            "นำพริกแกงที่ได้ไปผัดกับน้ำมันให้หอม ใส่กระดูกหมูลงไป ผัดให้เข้ากันพอสุก\n" +
            "ใส่น้ำ ข่า ตะไคร้ และคนอร์ซุปหมูก้อนลงไป หมั่นคน ต้มต่อสักพักจนกระดูกหมูเปื่อย\n" +
            "ใส่ใบมะกรูดลงไปให้หอม ตักใส่ถ้วยโรยหน้าด้วยผักชี ผักชีฝรั่ง และต้นหอมซอยพร้อมรับประทานได้\n","ส่วนประกอบ\n" +
            "สะโพกไก่เลาะกระดูกหั่นชิ้นพอคำ 300 กรัม\n" +
            "เห็ดนางฟ้าฉีก 120 กรัม\n" +
            "หัวกะทิ 3/4 ถ้วยตวง\n" +
            "น้ำ 1 ½ ถ้วยตวง\n" +
            "ข่าหั่นแว่น 6-7 แว่น\n" +
            "ตะไคร้หั่นแฉลบ 1 ต้น\n" +
            "ใบมะกรูดฉีก 3-4 ใบ\n" +
            "คนอร์ซุปไก่ก้อน 1 ก้อน\n" +
            "น้ำมะนาว 2 ช้อนโต๊ะ\n" +
            "น้ำปลา 2 ช้อนชา\n" +
            "ผักชีฝรั่งหั่นท่อน 1 ซม. 1 ต้นเล็ก\n" +
            "พริกขี้หนูแดงบุบ 2-3 เม็ด\n" +
            "***หรือใช้คนอร์สูตรสำเร็จต้มข่า 1 ซองแทนเครื่องปรุงโดยไม่ต้องปรุงรสเพิ่ม***\n" +
            "วิธีทำ\n" +
            "ตั้งหม้อต้มน้ำบนไฟกลางจนเดือด ใส่ไก่ลงไปต้มประมาณ 5 นาที หรือจนไก่สุกนุ่ม เติมหัวกะทิลงไป\n" +
            "ใส่คนอร์ซุปไก่ก้อนลงไป คนให้ละลาย ใส่เห็ด ข่า ตะไคร้ ใบมะกรูดลงไป ต้มต่อจนสุก\n" +
            "ปรุงรสด้วยน้ำปลา และน้ำมะนาว ปิดไฟ โรยหน้าด้วยใบผักชี และพริกขี้หนู จัดใส่ชามพร้อมเสิร์ฟ\n" +
            "วิธีทำจากคนอร์สูตรสำเร็จต้มข่า\n" +
            "ตั้งหม้อต้มน้ำบนไฟกลางจนเดือด ใส่ปีกบนไก่ลงต้มประมาณ 5 นาที หรือจนไก่สุกนุ่ม เติมหัวกะทิ\n" +
            "ใส่คนอร์สูตรสำเร็จต้มข่า คนให้ละลาย ใส่เห็ด ข่า ตะไคร้ ใบมะกรูด ต้มต่อจนสุก\n" +
            "โรยหน้าด้วยใบผักชี และพริกขี้หนู จัดใส่ชามพร้อมเสิร์ฟ\n","ส่วนประกอบ\n" +
            "สะโพกหมูหั่นชิ้นพอดีคำ 500 กรัม\n" +
            "เห็ดหอมแห้งแช่น้ำ 8 ดอก\n" +
            "เครื่องยาจีน สำหรับตุ๋นหมู 1 ห่อ\n" +
            "คนอร์ซุปหมูก้อน 2 ก้อน\n" +
            "ซีอิ๊วขาว 1-2 ช้อนโต๊ะ\n" +
            "น้ำเปล่า 5 ถ้วยตวง\n" +
            "ใบผักชี และพริกไทยป่น สำหรับโรยหน้า\n" +
            "วิธีทำ\n" +
            "\n" +
            "ล้างสิ่งสกปรกจากชุดเครื่องยาจีนสะเด็ดน้ำ พักไว้\n" +
            "ตั้งหม้อต้มน้ำบนไฟพอเดือด ใส่หมูลงต้ม ในตอนแรกน้ำจะขุ่น คอยช้อนฟองออก เบาไฟลง หมั่นช้อนฟองออกอย่างต่อเนื่อง น้ำซุปจะค่อยๆ ใสขึ้น\n" +
            "ใส่คนอร์ซุปหมูก้อนลงไป คนให้ละลาย พอน้ำซุปเริ่มใส ให้ใส่เครื่องยาจีน และเห็ดหอมลงไป\n" +
            "ปรุงรสด้วยซีอิ๊วขาวตุ๋นจนหมูนุ่ม ต้มประมาณ 45 นาที ตักใส่ถ้วยโรยหน้าด้วยพริกไทยป่นพร้อมเสิร์ฟ\n","ส่วนประกอบ\n" +
            "เต้าเจี้ยวขาว (200 กรัม) 1 ถ้วยตวง\n" +
            "เนื้อกุ้งสับ (100 กรัม) ½ ถ้วยตวง\n" +
            "เนื้อหมูติดมันสับ (100 กรัม) ½ ถ้วยตวง\n" +
            "หัวกะทิ (375 กรัม) 1 ½ ถ้วยตวง\n" +
            "หอมแดงซอย (100 กรัม) ½ ถ้วยตวง\n" +
            "(แบ่งหอมแดงซอยเป็น 2 ส่วน ส่วนแรกสำหรับโขลกกับเต้าเจี้ยว อีกส่วนใส่ลงในเต้าเจี้ยวหลน)\n" +
            "พริกหยวกสีเขียวหั่นท่อน 1 นิ้ว 4 เม็ด\n" +
            "พริกชี้ฟ้าหั่นท่อน 1 นิ้ว 4 เม็ด\n" +
            "น้ำตาลปีบ 6 ช้อนโต๊ะ\n" +
            "น้ำมะขามเปียก 2 ช้อนโต๊ะ\n" +
            "คนอร์อร่อยชัวร์ 2 ช้อนชา\n" +
            "\n" +
            "วิธีทำ\n" +
            "\n" +
            "ล้างเต้าเจี้ยวให้สะอาดแล้วบีบให้แห้ง นำไปโขลกจนละเอียดกับหัวหอม เสร็จแล้วตักออก พักไว้\n" +
            "โขลกหมูบด และเนื้อกุ้งให้เข้ากัน แล้วใส่เต้าเจี้ยวขาวที่พักไว้ลงโขลกผสมกัน (ขั้นตอนนี้สำคัญมาก เพราะถ้าโขลกหมูบดและกุ้งบดละเอียดเหนียวแล้วจะทำให้เต้าเจี้ยวหลนอร่อย)\n" +
            "นำหัวกะทิ ใส่ในหม้อ ใส่เครื่องที่โขลกลงไป ใช้ไฟปานกลางคอยคนเรื่อยๆ ไม่ให้ติดก้นหม้อ ค่อยๆ เคี่ยวจนส่วนผสมสุกข้น ใส่หัวหอมที่เหลือ พริกหยวก และพริกชี้ฟ้าลงไป เคี่ยวต่อพอให้พริกเริ่มนิ่ม\n" +
            "ปรุงรสด้วยคนอร์อร่อยชัวร์ น้ำตาลปีบ และน้ำมะขามเปียก ชิมรสตามชอบ ตักใส่ถ้วยพร้อมเสิร์ฟ รับประทานคู่กับแตงกวา ผักกาดหอม หรือข้าวตัง\n" +
            "หมายเหตุ ถ้าชอบรสหวานสามารถเพิ่มน้ำตาลปีบได้ตามชอบ\n","ส่วนประกอบ\n" +
            "ปลาดุกขนาด (500 กรัม) 1 ตัว\n" +
            "คนอร์อร่อยชัวร์ 1 ช้อนชา\n" +
            "เกล็ดขนมปัง ½ ถ้วย\n" +
            "ส่วนผสมน้ำยำ\n" +
            "น้ำปลา 2 ช้อนโต๊ะ\n" +
            "คนอร์อร่อยชัวร์ 2 ช้อนชา\n" +
            "น้ำมะนาว 5 ช้อนโต๊ะ\n" +
            "น้ำตาลทรายหรือน้ำตาลปีบ 5 ช้อนโต๊ะ\n" +
            "พริกขี้หนูสวนบุบ 10–15 เม็ด\n" +
            "เติมหัวหอมแดงซอย ¼ ถ้วย\n" +
            "มะม่วงดิบ(เปรี้ยว)ซอย 1 ลูกหรือ 1 ถ้วยตวง\n" +
            "ขึ้นฉ่าย ½ ถ้วยตวง\n" +
            "ถั่วลิสงหรือเม็ดมะม่วงหิมพาน ¼ ถ้วยตวง\n" +
            "วิธีทำ\n" +
            "ล้างปลาดุกให้สะอาดบั้งแล้วทาด้วยคนอร์อร่อยชัวร์ให้ทั่วนำปลาดุกไปย่างจนสุก แล้วแกะเอาแต่เนื้อปลาจากนั้นนำมาสับรวมกันกับเกล็ดขนมปัง\n" +
            "ตั้งกระทะบนไฟปานกลาง ใส่น้ำมันรอจนร้อน ใส่ปลาดุกที่เตรียมไว้ลงไปเพื่อให้เนื้อปลาฟูน่ารับประทาน ควรรีบคนให้เนื้อปลากระจายตัวไม่เช่นนั้นเนื้อปลาจะจับตัวเป็นก้อนตักขึ้นสะเด็ดน้ำมัน ทำน้ำยำโดยการผสมเครื่องปรุงสำหรับผสมน้ำยำทั้งหมดเข้าด้วยกัน (ยกเว้นขึ้นฉ่ายและถั่วลิสง)เวลารับประทานให้ราดน้ำยำลงบนปลาดุกฟูที่ทอดไว้โรยถั่วลิสงทอดและขึ้นฉ่าย เพื่อความอร่อยมากยิ่งขึ้นควรรับประทานคู่กับผักกาดหอม\n","ส่วนประกอบ\n" +
            "ไก่สับ 200 กรัม\n" +
            "พริกป่น (25 กรัม) 2 ช้อนโต๊ะ\n" +
            "ข้าวคั่ว (25 กรัม) 2 ช้อนโต๊ะ\n" +
            "คนอร์อร่อยชัวร์ (10 กรัม) 2 ช้อนชา\n" +
            "น้ำมะนาว(30 กรัม) ประมาณ 2 ช้อนโต๊ะ\n" +
            "หอมแดงซอย 3 หัว (25 กรัม) 1 ½ ช้อนโต๊ะ\n" +
            "ต้มหอมซอย 2 ต้น (6 กรัม) 1 ½ ช้อนโต๊ะ\n" +
            "ผักชีฝรั่งซอย 1 ต้น (6 กรัม) 1 ½ ช้อนโต๊ะ\n" +
            "น้ำเปล่า (25 กรัม) 2 ช้อนโต๊ะ\n" +
            "ใบสะระแหน่สำหรับโรยหน้าตามชอบประมาณ ¼ ถ้วยตวง\n" +
            "ผักสด เช่นแตงกวา ถั่วฝักยาว กะหล่ำปลี ใบโหระพาตามชอบ โดยประมาณ\n" +
            "วิธีทำ\n" +
            "\n" +
            "ตั้งหม้อสำหรับรวนบนไฟปานกลาง ใส่ไก่สับลงไป เติมน้ำเปล่า แล้วรวนไก่จนสุก\n" +
            "ปรุงรสชาติด้วยคนอร์อร่อยชัวร์ ยกออกจากเตา แล้วจึงใส่น้ำมะนาว พริกป่น ข้าวคั่ว หอมแดงซอย ต้นหอม และผักชีฝรั่ง ผสมให้เข้ากัน\n" +
            "ตักใส่จาน โรยหน้าด้วยใบสะระแหน่พร้อมเสิร์ฟ ควรรับประทานคู่กันกับผักสด\n" +
            "หมายเหตุ ความเผ็ดขึ้นอยู่กับพริกป่น บางครั้งพริกป่นอาจเผ็ดมากให้แบ่งใส่ครึ่งหนึ่งแล้วชิมรสดูก่อน\n","ส่วนประกอบ\n" +
            "ปลาทูนึ่งตัวใหญ่ 2 ตัว\n" +
            "พริกเขียวพริกหนุ่ม 8 เม็ด\n" +
            "หอมแดง 6 หัว\n" +
            "กระเทียม 10 กลีบใหญ่\n" +
            "คนอร์อร่อยชัวร์รสไก่ 2 ช้อนชา\n" +
            "เกลือป่น ½ ช้อนชา\n" +
            "น้ำปลา 2 ช้อนชา\n" +
            "น้ำต้มสุก 2 ช้อนโต๊ะ\n" +
            "มะนาว 2 ช้อนโต๊ะ ใส่หรือไม่ใส่ก็ได้เพื่อเพิ่มรสเปรี้ยวสำหรับคนที่ชอบรสเปรี้ยว\n" +
            "วิธีทำ\n" +
            "ย่างหอม กระเทียม พริก รวมทั้งปลาทูพักไว้\n" +
            "แกะปลาทูที่ย่างแล้วเอาแต่เนื้อใส่ หอม กระเทียม พริกย่าง ลงตำในครก เหยาะเกลือเล็กน้อยทำให้ตำง่ายขึ้น ตำจนส่วนผสมเข้ากันดี\n" +
            "เติมคนอร์อร่อยชัวร์รสไก่ น้ำมะนาว น้ำปลาเติมน้ำต้มสุกหรือน้ำซุป ชิมรสตามชอบตักใส่ถ้วย รับประทานกับผักลวก หรือผักสดตามชอบ\n"};
    public void onBackPressed() {
        super.onBackPressed();
        Intent Menurecipeform = new Intent(this, MenurecipeActivity.class);
        startActivity(Menurecipeform);
        finish(); //ปิดหน้าปัจจุบัน
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipefood);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view,int i, long l) {
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

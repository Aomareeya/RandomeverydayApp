package com.example.randomeveryday;
import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<SliderItems> dataList;

    //ประกาศตัวแปรอาร์เรย์ เพื่อเก็บไฟล์เสียง ไฟล์ข้อความ ไฟล์ลิงค์เว็บ ตามจำนวนการเลื่อนข้อมูลที่ต้องการ
//เปลี่ยนข้อมูลได้ตามต้องการหรือเพิ่มได้ตามต้องการ
    Integer[] sound = {R.raw.bitcoin, R.raw.bnb, R.raw.stellar, R.raw.tezos};
    String[] name = {"bitcoin", "bnb", "stellar", "tezos"};

    public MyAdapter(List<SliderItems> dataList, Context context) {
        this.dataList = dataList;

    }
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item, parent, false);
        return new ViewHolder(view);
    }


    public int getItemCount() {
        return dataList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView ShowName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            ShowName = itemView.findViewById(R.id.txtname);
        }
    }

    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(dataList.get(position).getImage());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.ShowName.setText(name[holder.getAdapterPosition()]);

            }
        });


    }
}

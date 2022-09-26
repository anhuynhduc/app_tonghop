package com.example.firstproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import android.widget.ImageView;

public class list_view extends AppCompatActivity {

    ListView listView;

    String arrname[] = {"Huỳnh Đức An", "Võ Lê Nhật Huy", "Huỳnh Ngọc Đạt", "Đỗ Thị Minh Thư", "Hoàng Yến Nhi", "Võ Kim Yến"};

    String arrmessage[] = {"Hi", "Hello", "How are You", "Hello,How are You", "I am fine", "hi,what about you"};

    int arrimage[] = {R.drawable.user1, R.drawable.user2, R.drawable.user3, R.drawable.user4, R.drawable.user5, R.drawable.user6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = findViewById(R.id.listview);
        myadapter adapter = new myadapter(this, arrname, arrmessage, arrimage);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(list_view.this,user_profile.class);
                intent.putExtra("name",arrname[position]);
                intent.putExtra("message",arrmessage[position]);
                intent.putExtra("image",arrimage[position]);
                startActivity(intent);

            }
        });


    }

    class myadapter extends ArrayAdapter<String> {

        Context context;
        String rname[];
        String rmsg[];
        int rimg[];

        public myadapter( Context context, String[] rname, String[] rmsg, int[] rimg) {
            super(context,R.layout.row,R.id.imageView,rname);

            this.rname = rname;
            this.rmsg = rmsg;
            this.rimg = rimg;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater inflater=(LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view=inflater.inflate(R.layout.row,parent,false);

            ImageView img=view.findViewById(R.id.imageView);
            TextView username=view.findViewById(R.id.name);
            TextView usermessage=view.findViewById(R.id.message);

            username.setText(rname[position]);
            usermessage.setText(rmsg[position]);
            img.setImageResource(rimg[position]);

            return view;
        }
    }

}

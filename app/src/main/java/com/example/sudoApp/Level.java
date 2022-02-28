package com.example.sudoApp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

public class Level extends AppCompatActivity {
    String name[] ={"Easy","Simple","Medium","Hard","Expert"};
    Integer[] imageArray1={R.mipmap.ic_launcher_play,R.mipmap.ic_launcher_play,R.mipmap.ic_launcher_play,
            R.mipmap.ic_launcher_play,R.mipmap.ic_launcher_play};
    Integer[] imageArray2={R.drawable.sudo,R.drawable.sudo,R.drawable.sudo,R.drawable.sudo,R.drawable.sudo};
    ListView listView ;
    LinearLayout l1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        //int x = getIntent().getIntExtra(" KEY",0);
        Intent x = getIntent();
        int y = x.getIntExtra("KEY",Color.WHITE);
        l1 = findViewById(R.id.level_layout);
        l1.setBackgroundColor(y);
        listView = findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(this,name,imageArray1,imageArray2);
        listView.setAdapter(listAdapter);
        Toolbar tool = findViewById(R.id.level_tool);
        tool.setTitle("Levels");
        tool.setTitleTextColor(Color.WHITE);
        setSupportActionBar(tool);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    Intent i = new Intent(Level.this,Easy.class);
                    startActivity(i);
                }
                if(position==1)
                {
                    Intent i = new Intent(Level.this,Simple.class);
                    startActivity(i);
                }
                if(position==2)
                {
                    Intent i = new Intent(Level.this,Medium.class);
                    startActivity(i);
                }
                if(position==3)
                {
                    Intent i = new Intent(Level.this,Hard.class);
                    startActivity(i);
                }
                if(position==4)
                {
                    Intent i = new Intent(Level.this,Expert.class);
                    startActivity(i);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent z = new Intent(Level.this,MainActivity.class);
        startActivity(z);
    }
}
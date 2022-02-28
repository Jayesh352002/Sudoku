package com.example.sudoApp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Settings extends AppCompatActivity {
    String name[] ={"How to Play","Themes","Colors","About App"};
    Integer[] imageArray1={R.mipmap.ic_launcher_arrow,R.mipmap.ic_launcher_arrow,R.mipmap.ic_launcher_arrow,
            R.mipmap.ic_launcher_arrow};
    Integer[] imageArray2={R.mipmap.ic_launcher_help,R.mipmap.ic_launcher_theme,R.mipmap.ic_launcher_color,
            R.mipmap.ic_launcher_about};
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        Toolbar tool = findViewById(R.id.level_tool);
        tool.setTitle("Settings");
        tool.setTitleTextColor(Color.WHITE);
        setSupportActionBar(tool);
        listView = findViewById(R.id.list);
        ListAdapter listAdapter = new ListAdapter(this,name,imageArray1,imageArray2);
        listView.setAdapter(listAdapter);
        try {
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    if(position==0)
                    {
                        Intent i = new Intent(Settings.this,HowToPlay.class);
                        startActivity(i);
                    }
                    if(position==1)
                    {
                        Intent i = new Intent(Settings.this,ThemeBack.class);
                        startActivity(i);
                    }
                    if(position==2)
                    {
                        Intent i = new Intent(Settings.this,Theme.class);
                        startActivity(i);
                    }
                    if(position==3)
                    {
                        Intent i = new Intent(Settings.this,AboutApp.class);
                        startActivity(i);
                    }
                }
            });
        }
        catch (ArrayIndexOutOfBoundsException e){}
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent z = new Intent(Settings.this,Level.class);
        startActivity(z);
    }
}
package com.example.sudoApp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

public class HowToPlay extends AppCompatActivity {
    ViewPager viewPager ;
    ViewPagerAdapter pagerAdapter ;
    int images[] = {R.drawable.how1,R.drawable.how2,R.drawable.how3,R.drawable.timer};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_to_play);
        viewPager = findViewById(R.id.view_pager);
        pagerAdapter = new ViewPagerAdapter(HowToPlay.this, images);
        viewPager.setAdapter(pagerAdapter);
        Toolbar tool = findViewById(R.id.level_tool);
        tool.setTitle("How To Play");
        tool.setTitleTextColor(Color.WHITE);
        setSupportActionBar(tool);


    }
}
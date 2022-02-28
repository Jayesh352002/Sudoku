package com.example.sudoApp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ThemeBack extends AppCompatActivity {
    int th ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme_back);
        Toolbar tool = findViewById(R.id.level_tool);
        tool.setTitle("Themes");
        tool.setTitleTextColor(Color.WHITE);
        setSupportActionBar(tool);
        MyListData obj = new MyListData("First",R.drawable.sudo1,"Apply");
        MyListData[] myListData = new MyListData[] {
                new MyListData("First", R.drawable.t1,"Apply"),
                new MyListData("Second", R.drawable.t2,"Apply"),
                new MyListData("Third", R.drawable.t3,"Apply"),
                new MyListData("Four", R.drawable.t4,"Apply"),
                new MyListData("Five", R.drawable.t5,"Apply"),
                new MyListData("Seven", R.drawable.t7,"Apply"),
                new MyListData("Eight", R.drawable.t8,"Apply"),
                new MyListData("Nine", R.drawable.t9,"Apply"),
                new MyListData("Ten", R.drawable.t10,"Apply"),
                new MyListData("Alert", R.drawable.t11,"Apply"),
        };
        th = obj.getImgId();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        MyListAdapter adapter = new MyListAdapter(this,myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(adapter);
    }
}
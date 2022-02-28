package com.example.sudoApp;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class AboutApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_app);
        Toolbar tool = findViewById(R.id.level_tool);
        tool.setTitle("About App");
        tool.setTitleTextColor(Color.WHITE);
        setSupportActionBar(tool);
    }
}
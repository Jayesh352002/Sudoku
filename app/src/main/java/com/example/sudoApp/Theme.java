package com.example.sudoApp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import yuku.ambilwarna.AmbilWarnaDialog;

public class Theme extends AppCompatActivity {
    Button b1 ;
    int def ;
    RelativeLayout r1 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        Toolbar tool = findViewById(R.id.level_tool);
        tool.setTitle("Colors");
        tool.setTitleTextColor(Color.WHITE);
        setSupportActionBar(tool);
        b1= findViewById(R.id.b1);
        r1 = findViewById(R.id.relative1);
        def = ContextCompat.getColor(Theme.this,R.color.design_default_color_primary);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AmbilWarnaDialog colorPicker = new AmbilWarnaDialog(Theme.this, def, new AmbilWarnaDialog.OnAmbilWarnaListener() {
                    @Override
                    public void onCancel(AmbilWarnaDialog dialog) {
                    }
                    @Override
                    public void onOk(AmbilWarnaDialog dialog, int color) {
                        def = color ;
                        r1.setBackgroundColor(def);
                        Intent x = new Intent(Theme.this,Level.class);
                        x.putExtra("KEY",def);
                        startActivity(x);
                    }

                });
                colorPicker.show();
            }
        });
    }
}
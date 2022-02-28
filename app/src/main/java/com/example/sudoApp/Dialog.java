package com.example.sudoApp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Dialog extends AppCompatActivity {
    Button b1 , b2 ;
    int x ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        b1 = findViewById(R.id.btn_one);
        b2 = findViewById(R.id.btn_two);
        x = getIntent().getIntExtra("data",0);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dialog.this,Level.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x==1)
                {
                    Intent i = new Intent(Dialog.this,Simple.class);
                    startActivity(i);
                }
                else if(x==2)
                {
                    Intent i = new Intent(Dialog.this,Medium.class);
                    startActivity(i);
                }
                else if(x==3)
                {
                    Intent i = new Intent(Dialog.this,Hard.class);
                    startActivity(i);
                }
                else if(x==4)
                {
                    Intent i = new Intent(Dialog.this,Expert.class);
                    startActivity(i);
                }
                else if(x==5)
                {
                    Intent i = new Intent(Dialog.this,Easy.class);
                    startActivity(i);
                }

            }
        });
    }
}
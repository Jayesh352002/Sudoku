package com.example.sudoApp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1 ;
    TextView t1 , t2 ;
    RelativeLayout r1 ;
    ImageView im , im1;
    private long pressedTime;
    int a1[] = new int[20];
    int count = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count++;
        Intent intent = new Intent(MainActivity.this, BackgroundSound1.class);
        startService(intent);
        int y = getIntent().getIntExtra("TH",Color.WHITE);
        im = findViewById(R.id.image1);
        im1 = findViewById(R.id.image2);
        r1 = findViewById(R.id.p1);
        t1 = findViewById(R.id.txt_head);
        t2 = findViewById(R.id.beta);
        r1.setBackgroundColor(Color.WHITE);
        if(count==1)
        {
            r1.setBackgroundColor(Color.WHITE);
        }
        else
        {
            r1.setBackgroundResource(a1[0]);
        }
        if(y==0)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t1);
            a1[0] = R.drawable.t1 ;
        }
        if(y==1)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t2);
            a1[0] = R.drawable.t2 ;
        }
        if(y==2)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t3);
            a1[0] = R.drawable.t1 ;
        }
        if(y==3)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t4);
            a1[0] = R.drawable.t1 ;
        }
        if(y==4)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t5);
            a1[0] = R.drawable.t1 ;
        }
        if(y==5)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t7);
            a1[0] = R.drawable.t1 ;
        }
        if(y==6)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t8);
            a1[0] = R.drawable.t1 ;
        }
        if(y==7)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t9);
            a1[0] = R.drawable.t1 ;
        }
        if(y==8)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t10);
            a1[0] = R.drawable.t1 ;
        }
        if(y==9)
        {
            t1.setVisibility(View.VISIBLE);
            im.setVisibility(View.INVISIBLE);
            im1.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
            r1.setBackgroundResource(R.drawable.t11);
            a1[0] = R.drawable.t1 ;
        }
        btn1 = findViewById(R.id.play);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Level.class);
                startActivity(i);
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        Intent intent = new Intent(MainActivity.this, BackgroundSound1.class);
        stopService(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = new Intent(MainActivity.this, BackgroundSound1.class);
        startService(intent);
    }

    @Override
    public void onBackPressed() {
        if (pressedTime + 2000 > System.currentTimeMillis()) {
            super.onBackPressed();
            finishAffinity();
            finish();
        } else {
            Toast.makeText(getBaseContext(), "Press back again to exit", Toast.LENGTH_SHORT).show();
        }
        pressedTime = System.currentTimeMillis();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        count++;
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
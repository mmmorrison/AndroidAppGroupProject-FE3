package com.example.aubreyford.androidappgroupproject_fe3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class DecideActivity extends AppCompatActivity {

    Button decide_back;
    Button decide_skip;
    ImageButton pic_a;
    ImageButton pic_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decide);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DecideNavListener();
        appendData();


    }


    private void DecideNavListener() {
        decide_back = (Button) findViewById(R.id.decide_back);
        decide_skip = (Button) findViewById(R.id.decide_skip );

        decide_back.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        decide_skip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


            }
        });
    }

    private void appendData(){
        pic_a = (ImageButton) findViewById(R.id.decide_pic_a);
        pic_a = (ImageButton) findViewById(R.id.decide_pic_a);


        pic_a.setImageResource(R.drawable.fashion_a);
        pic_a.setImageResource(R.drawable.fashion_b);
    }

}

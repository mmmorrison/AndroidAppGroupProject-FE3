package com.example.aubreyford.androidappgroupproject_fe3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NewSetActivity extends AppCompatActivity {

    private static Button PicButtonA;
    private static Button PicButtonB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TakePicA();
    }

    public void TakePicA(){
        PicButtonA = (Button) findViewById(R.id.picButton_A);

        PicButtonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent();

            }
        });
    }


    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

}

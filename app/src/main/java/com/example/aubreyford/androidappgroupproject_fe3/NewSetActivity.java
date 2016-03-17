package com.example.aubreyford.androidappgroupproject_fe3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.provider.MediaStore;
import android.graphics.Bitmap;

import android.widget.ImageButton;
import android.widget.ImageView;

public class NewSetActivity extends AppCompatActivity {

    private static Button PicButtonA;
    private static Button PicButtonB;
    private static ImageView picA;
    private static ImageView picB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TakePicA();
        TakePicB();
    }





    public void TakePicA(){
        PicButtonA = (Button) findViewById(R.id.picButton_A);

        PicButtonA.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent(1);

            }
        });
    }


    public void TakePicB(){
        PicButtonB = (Button) findViewById(R.id.picButton_B);

        PicButtonB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent(2);

            }
        });
    }



    private void dispatchTakePictureIntent(int REQUEST_IMAGE_CAPTURE) {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            picA = (ImageView) findViewById(R.id.pic_A);
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            picA.setImageBitmap(imageBitmap);
        }

        if (requestCode == 2 && resultCode == RESULT_OK) {
            picB = (ImageView) findViewById(R.id.pic_B);
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            picB.setImageBitmap(imageBitmap);
        }
    }

}

package com.example.aubreyford.androidappgroupproject_fe3;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.provider.MediaStore;
import android.graphics.Bitmap;
import android.util.Log;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class NewSetActivity extends AppCompatActivity {

    private static Button PicButtonA;
    private static Button PicButtonB;
//    private static ImageView picA;
//    private static ImageView picB;
    private static Button submitBtn;
    private static Button backBtn;
//    private static ImageView image_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_set);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TakePicA();
        TakePicB();
        Submit();
        Back();

    }




    public void Submit(){

        submitBtn = (Button) findViewById(R.id.new_submit);


                submitBtn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {


                        ImageView picA = (ImageView) findViewById(R.id.pic_A);
                        Bitmap bitmapA = ((BitmapDrawable) picA.getDrawable()).getBitmap();

                        ImageView picB = (ImageView) findViewById(R.id.pic_B);
                        Bitmap bitmapB = ((BitmapDrawable) picB.getDrawable()).getBitmap();


                        EditText titleObject = (EditText) findViewById(R.id.newTitle);
                        String title = titleObject.getText().toString();


                        Intent intent = new Intent(view.getContext(), index.class);
                        startActivity(intent);
//
//                        image_test = (ImageView) findViewById(R.id.imageTest);
//                        image_test.setImageBitmap(bitmapB);


                    }
                });
    }


    public void Back(){
        backBtn = (Button) findViewById(R.id.new_back);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), index.class);
                startActivity(intent);
            }
        });
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
            ImageView picA = (ImageView) findViewById(R.id.pic_A);
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            picA.setImageBitmap(imageBitmap);

        }

        if (requestCode == 2 && resultCode == RESULT_OK) {
            ImageView picB = (ImageView) findViewById(R.id.pic_B);
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            picB.setImageBitmap(imageBitmap);

        }
    }

}

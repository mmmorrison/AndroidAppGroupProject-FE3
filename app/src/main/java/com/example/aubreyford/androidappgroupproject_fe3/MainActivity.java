package com.example.aubreyford.androidappgroupproject_fe3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ImageButton;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static ImageButton index_nav;
    private static ImageButton decide_nav;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Typeface guldScript = Typeface.createFromAsset(getAssets(), "GuldScript_PersonalUseOnly.ttf");
        TextView appTitle = (TextView) findViewById(R.id.app_title);
        appTitle.setTypeface(guldScript);
        IndexNavListener();
        DecideNavListener();
    }


    


    public void IndexNavListener() {
            index_nav = (ImageButton) findViewById(R.id.fashion_b);

            index_nav.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(view.getContext(), index.class);
                            startActivity(intent);
                        }
            });
        }


    public void DecideNavListener() {
            decide_nav = (ImageButton) findViewById(R.id.fashion_a);

            decide_nav.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view){
//                            Intent intent = new Intent("com.example.aubreyford.androidappgroupproject_fe3.DecideActivity");
                            Intent intent = new Intent(view.getContext(), DecideActivity.class);
                            startActivity(intent);
                        }

            });
        }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

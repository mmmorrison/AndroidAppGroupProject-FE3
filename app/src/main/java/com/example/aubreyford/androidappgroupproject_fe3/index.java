package com.example.aubreyford.androidappgroupproject_fe3;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Button;

public class index extends AppCompatActivity {

    private static Button newQualm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        NewSetNavListener();
    }

    public void NewSetNavListener() {
        newQualm = (Button) findViewById(R.id.new_qualm);

        newQualm.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NewSetActivity.class);
                startActivity(intent);
            }
        });
    }

}

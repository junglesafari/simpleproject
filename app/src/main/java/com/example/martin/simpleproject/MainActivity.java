package com.example.martin.simpleproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick1(View view) {
        TextView t = (TextView) findViewById(R.id.ts1);
        Intent i = new Intent(MainActivity.this, story1.class);
        startActivity(i);
    }

    public void onClickI1(View view) {
        ImageView t = (ImageView) findViewById(R.id.is1);
        Intent i = new Intent(MainActivity.this, story1.class);
        startActivity(i);
    }
}

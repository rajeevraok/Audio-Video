package com.example.audiovideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void audio(View v){
        Intent i = new Intent(MainActivity.this,Audio.class);
        startActivity(i);
    }

    public void video(View v){
        Intent j = new Intent(MainActivity.this,Video.class);
        startActivity(j);
    }
}
package com.example.naylo.leftrightaudiotest;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button Test;
    MediaPlayer mySound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Test =(Button) findViewById(R.id.test);
        mySound = MediaPlayer.create(this, R.raw.leftright);
        Test.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mySound.start();
            }
        });
    }
}

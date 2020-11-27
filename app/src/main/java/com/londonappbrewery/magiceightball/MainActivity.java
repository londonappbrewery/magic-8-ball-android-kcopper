package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button ask = (Button) findViewById(R.id.button_ask);
        final ImageView eightBall = (ImageView) findViewById(R.id.image_eightball);
        final int[] ballArray = {R.mipmap.ball1,
                R.mipmap.ball2,
                R.mipmap.ball3,
                R.mipmap.ball4,
                R.mipmap.ball5};

        ask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random number = new Random();
                eightBall.setImageResource(ballArray[number.nextInt(5)]);

            }
        });


    }
}

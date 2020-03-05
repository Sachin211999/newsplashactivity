package com.example.sachu.splashactivity;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CountDownTimer countDownTimer = new CountDownTimer(3000,100) {
            @Override
            public void onTick(long l) {
                Toast.makeText(MainActivity.this,"App is starting",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(MainActivity.this,Second.class);
                startActivity(intent);
                finish();
            }
        };countDownTimer.start();

    }
}

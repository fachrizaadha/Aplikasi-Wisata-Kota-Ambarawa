package com.example.aplikasiwisataambarawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ProgressBar;

import com.example.aplikasiwisataambarawa.R;

public class splashscreen extends AppCompatActivity {

    private static final int SPLASH_TIME = 4 * 1000;//set waktu 4 detik
    ProgressBar prg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);


        prg = findViewById(R.id.progressBar);//Tampilan progress bar
        final boolean b = new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new
                        Intent(splashscreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_TIME);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        },SPLASH_TIME);
    }
}

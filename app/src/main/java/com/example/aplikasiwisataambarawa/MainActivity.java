package com.example.aplikasiwisataambarawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button wisata, kuliner,keluar,tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wisata  =  findViewById(R.id.btn_wisata);
        kuliner =  findViewById(R.id.btn_kuliner);
        tentang =  findViewById(R.id.btn_tentang);
        keluar  =  findViewById(R.id.btn_keluar);

        wisata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplication(),wisata.class);
                startActivity(i);
            }
        });

        kuliner = findViewById(R.id.btn_kuliner);
        kuliner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),kuliner.class);
                startActivity(i);
            }
        });
        tentang = findViewById(R.id.btn_tentang);
        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplication(),tentang.class);
                startActivity(i);
            }
        });

        keluar =  findViewById(R.id.btn_keluar);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveTaskToBack(true);
                finish();
                System.exit(0);
            }
        });
    }
}

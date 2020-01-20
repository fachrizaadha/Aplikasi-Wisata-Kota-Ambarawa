package com.example.aplikasiwisataambarawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasiwisataambarawa.R;

public class kuliner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuliner);

        //Menginialisasi dan memanggil widget button pada file Layout

        ImageView kuliner1 = findViewById(R.id.kuliner1);
        ImageView kuliner2 = findViewById(R.id.kuliner2);
        ImageView kuliner3 = findViewById(R.id.kuliner3);
        ImageView kuliner4 = findViewById(R.id.kuliner4);

        kuliner1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(kuliner.this, tahuserasi.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        kuliner2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(kuliner.this, serabingampin.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        kuliner3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(kuliner.this, evacoffee.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        kuliner4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(kuliner.this, pecelmbokkami.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
    }
}

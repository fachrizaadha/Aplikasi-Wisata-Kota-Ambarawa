package com.example.aplikasiwisataambarawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.aplikasiwisataambarawa.R;

public class wisata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wisata);

        //Menginialisasi dan memanggil widget button pada file Layout

        ImageView wisata1 = findViewById(R.id.wisata1);
        ImageView wisata2 = findViewById(R.id.wisata2);
        ImageView wisata3 = findViewById(R.id.wisata3);
        ImageView wisata4 = findViewById(R.id.wisata4);
        ImageView wisata5 =  findViewById(R.id.wisata5);
        ImageView wisata6 =  findViewById(R.id.wisata6);
        ImageView wisata7 =  findViewById(R.id.wisata7);
        ImageView wisata8 =  findViewById(R.id.wisata8);
        ImageView wisata9 =  findViewById(R.id.wisata9);
        ImageView wisata10 = findViewById(R.id.wisata10);
        ImageView wisata11 = findViewById(R.id.wisata11);
        ImageView wisata12 = findViewById(R.id.wisata12);
        ImageView wisata13 = findViewById(R.id.wisata13);

        wisata1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, museumpalagan.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        wisata2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, museumkaambarawa.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        wisata3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, airterjunsemirang.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        wisata4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, rawapening.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        wisata5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, tamanbungacelosia.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        wisata6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, bentengpendem.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        wisata7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, alunalun.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        wisata8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, elingbening.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        wisata9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, sidomukti.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        wisata10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, goarong.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        wisata11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, kampungbejalen.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });
        wisata12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, goamariakerep.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });

        wisata13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Todo Auto Generated method stub
                Intent pindah = new Intent(wisata.this, lerengkelir.class);
                startActivity(pindah);
                //menghubungkan antar activity dengan intent
            }
        });


    }
}

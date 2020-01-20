package com.example.aplikasiwisataambarawa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class alunalun extends AppCompatActivity {

    /*Deklarasi variable*/
    Button btn_alun;
    final String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
    final Uri[] gmmIntentUri1 = new Uri[1];
    final Intent[] mapIntent1 = new Intent[1];
    final String alun = "-7.257707,110.4170172"; // koordinat Alun Alun Ambarawa
    /*Deklarasi variable*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunalun);

        btn_alun = findViewById(R.id.btn_alun);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_alun.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri1[0] = Uri.parse("google.navigation:q=" + alun);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent1[0] = new Intent(Intent.ACTION_VIEW, gmmIntentUri1[0]);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent1[0].setPackage(goolgeMap);

                if (mapIntent1[0].resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent1[0]);
                } else {
                    Toast.makeText(alunalun.this, "Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

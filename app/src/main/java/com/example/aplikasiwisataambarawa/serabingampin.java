package com.example.aplikasiwisataambarawa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.example.aplikasiwisataambarawa.R;

public class serabingampin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serabingampin);

        /*Deklarasi variable*/
        Button btn_serabi;
        final String goolgeMap = "com.google.android.apps.maps"; // identitas package aplikasi google masps android
        final Uri[] gmmIntentUri1 = new Uri[1];
        final Intent[] mapIntent1 = new Intent[1];
        final String serabi= "-7.2635855,110.3857548"; // koordinat Serabi Ngampin
        /*Deklarasi variable*/

        // menyamakan variable pada layout activity_main.xml

        btn_serabi = findViewById(R.id.btn_serabi);

        // tombol untuk menjalankan navigasi goolge maps intents
        btn_serabi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // Buat Uri dari intent string. Gunakan hasilnya untuk membuat Intent.
                gmmIntentUri1[0] = Uri.parse("google.navigation:q=" + serabi);

                // Buat Uri dari intent gmmIntentUri. Set action => ACTION_VIEW
                mapIntent1[0] = new Intent(Intent.ACTION_VIEW, gmmIntentUri1[0]);

                // Set package Google Maps untuk tujuan aplikasi yang di Intent yaitu google maps
                mapIntent1[0].setPackage(goolgeMap);

                if (mapIntent1[0].resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent1[0]);
                } else {
                    Toast.makeText( serabingampin.this ,"Google Maps Belum Terinstal. Install Terlebih dahulu.",
                            Toast.LENGTH_LONG).show();
                }
            }

        });

    }
}


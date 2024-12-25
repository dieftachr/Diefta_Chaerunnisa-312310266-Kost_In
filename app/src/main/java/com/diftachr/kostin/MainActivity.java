package com.diftachr.kostin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Username ke profil
        TextView profil = findViewById(R.id.profil);

        // alr hv an acc to sign up
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman login
                Intent intent = new Intent(MainActivity.this, profilActivity.class);
                startActivity(intent);
            }
        });

        //go to lin profil
        LinearLayout linear_profil = findViewById(R.id.linear_profil);

        // Set OnClickListener
        linear_profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, profilActivity.class);
                startActivity(intent);
            }
        });

        //go to lin catering
        LinearLayout linear_catering = findViewById(R.id.linear_catering);

        // Set OnClickListener
        linear_catering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, cateringActivity.class);
                startActivity(intent);
            }
        });

        //go to lin msg
        LinearLayout linear_msg = findViewById(R.id.linear_msg);

        // Set OnClickListener
        linear_msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, massageActivity.class);
                startActivity(intent);
            }
        });
        //go to lin laundry
        LinearLayout linear_lndr = findViewById(R.id.linear_lndr);

        // Set OnClickListener
        linear_lndr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, laundryActivity.class);
                startActivity(intent);
            }
        });
        //go to lin cleaning srvc
        LinearLayout linear_cs = findViewById(R.id.linear_cs);

        // Set OnClickListener
        linear_cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, cleaningsrvcActivity.class);
                startActivity(intent);
            }
        });
        //go to lin mtn
        LinearLayout linear_mtn = findViewById(R.id.linear_mtn);

        // Set OnClickListener
        linear_mtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, maintenanceActivity.class);
                startActivity(intent);
            }
        });
        //go to lin room
        LinearLayout linear_room = findViewById(R.id.linear_room);

        // Set OnClickListener
        linear_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman profil
                Intent intent = new Intent(MainActivity.this, roomActivity.class);
                startActivity(intent);
            }
        });
    }
}
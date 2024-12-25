package com.diftachr.kostin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class roomActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        //KEMBALI KE HALAMAN SBLMNYA
        ImageView back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke halaman sebelumnya
                onBackPressed();
            }
        });

    }
}
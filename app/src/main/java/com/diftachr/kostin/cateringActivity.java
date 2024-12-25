package com.diftachr.kostin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.Toast;

public class cateringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catering);

        //KEMBALI KE HALAMAN SBLMNYA
        ImageView back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke halaman sebelumnya
                onBackPressed();
            }
        });

        //inisiasi btn order mkn
        Button button1 = findViewById(R.id.order_mkn1);
        Button button2 = findViewById(R.id.order_mkn2);
        Button button3 = findViewById(R.id.order_mkn3);
        Button button4 = findViewById(R.id.order_mkn4);
        // Set listener yang sama untuk semua button
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.order_mkn1:
                        // Aksi untuk button 1
                        Toast.makeText(cateringActivity.this, "Berhasil Order Menu 1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.order_mkn2:
                        // Aksi untuk button 2
                        Toast.makeText(cateringActivity.this, "Berhasil Order Menu 2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.order_mkn3:
                        // Aksi untuk button 3
                        Toast.makeText(cateringActivity.this, "Berhasil Order Menu 3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.order_mkn4:
                        // Aksi untuk button 4
                        Toast.makeText(cateringActivity.this, "Berhasil Order Menu 4", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        };
        // Pasang listener ke setiap button
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
    }
}
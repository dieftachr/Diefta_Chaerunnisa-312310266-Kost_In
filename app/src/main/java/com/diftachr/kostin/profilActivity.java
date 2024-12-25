package com.diftachr.kostin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;
import android.widget.ImageView;
//buat alert logout
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;




public class profilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        //KEMBALI KE HALAMAN SBLMNYA
        ImageView back_btn = findViewById(R.id.back_btn);

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Kembali ke halaman sebelumnya
                onBackPressed();
            }
        });

        // Edit profil
        Button btn_edit_acc = findViewById(R.id.btn_edit_acc);

        btn_edit_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke halaman edit profil
                Intent intent = new Intent(profilActivity.this, EditprofilActivity.class);
                startActivity(intent);
            }
        });

        //ini buat logout
        Button logoutButton = findViewById(R.id.logout);

        logoutButton.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Konfirmasi Logout");
            builder.setMessage("Apakah Anda yakin ingin logout?");

            // Tombol "Ya"
            builder.setPositiveButton("Ya", (dialog, which) -> {
                // Clear data di SharedPreferences
                SharedPreferences sharedPreferences = getSharedPreferences("UserPrefs", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.clear();
                editor.apply();

                // Redirect ke halaman login
                Intent intent = new Intent(this, SignInActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish(); // Tutup activity saat ini
            });

            // Tombol "Tidak"
            builder.setNegativeButton("Tidak", (dialog, which) -> dialog.dismiss());

            // Tampilkan dialog
            builder.show();
        });

    }
}
package com.diftachr.kostin;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        //inisialisasi view
        View decorView = getWindow().getDecorView();
        //hide the statusbar
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        //hide Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //pindah ke sign up
        TextView textCreateNewAccount = findViewById(R.id.textCreateNewAccount);
        textCreateNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        //pindah ke home
        Button btnSignIn = findViewById(R.id.btnSignIn);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
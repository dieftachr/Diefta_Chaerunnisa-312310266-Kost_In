package com.diftachr.kostin;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // PINDAH ALR HV AN ACC KE SIGN IN
        // Inisialisasi
        TextView textHaveAcc = findViewById(R.id.textHaveAcc);

        // alr hv an acc to sign up
        textHaveAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Berpindah ke halaman login
                Intent intent = new Intent(SignupActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        // DR SIGN UP KE SIGN IN
        Button btnSignUp = findViewById(R.id.btnSignUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent untuk berpindah ke halaman Sign In
                Intent intent = new Intent(SignupActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

    }
}
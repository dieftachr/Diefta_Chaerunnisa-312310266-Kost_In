package com.diftachr.kostin;

import android.content.Intent;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        //inisialisasi view
        View decorView = getWindow().getDecorView();
        //hide the statusbar
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);
        //hide Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashscreenActivity.this, SignInActivity.class));
                finish();
            }
        }, 2000);
    }
}
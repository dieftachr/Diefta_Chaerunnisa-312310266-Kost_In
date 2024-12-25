package com.diftachr.kostin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditprofilActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 1;
    private ImageView profileImageView;
    private EditText nameEditText, addressEditText, phoneEditText, emailEditText;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofil);

        profileImageView = findViewById(R.id.profileImageView);
        nameEditText = findViewById(R.id.nameEditText);
        addressEditText = findViewById(R.id.addressEditText);
        phoneEditText = findViewById(R.id.phoneEditText);
        emailEditText = findViewById(R.id.emailEditText);
        saveButton = findViewById(R.id.saveButton);

        profileImageView.setOnClickListener(v -> openGallery());

        saveButton.setOnClickListener(v -> saveProfile());
    }

    private void openGallery() {
        Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        startActivityForResult(intent, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedImage = data.getData();
            profileImageView.setImageURI(selectedImage);
        }
    }

    private void saveProfile() {
        String name = nameEditText.getText().toString().trim();
        String address = addressEditText.getText().toString().trim();
        String phone = phoneEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();

        if (name.isEmpty() || address.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        // Simpan data ke database atau server di sini
        Toast.makeText(this, "Profile updated successfully!", Toast.LENGTH_SHORT).show();
        finish();
    }
}

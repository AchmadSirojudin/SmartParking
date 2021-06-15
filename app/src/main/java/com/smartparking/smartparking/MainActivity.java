package com.smartparking.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button tbMasuk, tbDaftar; // memvuat variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbMasuk = findViewById(R.id.btnMasuk); // Menginisialisasi ID untuk Button
        tbDaftar = findViewById(R.id.btnDaftar);

        // tombol masuk
        tbMasuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
            }
        }); // Memberikan Listener pada Button

        // tombol daftar
        tbDaftar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                Intent i = new Intent(MainActivity.this, DaftarActivity.class);
                startActivity(i);
            }
        });
    }
}
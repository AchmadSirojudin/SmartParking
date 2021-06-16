package com.smartparking.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DaftarActivity extends AppCompatActivity {

    private TextView reg;
    private Button daftar;// memvuat variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        reg = findViewById(R.id.txtLog);
        daftar = findViewById(R.id.btnReg);

        // tombol masuk
        reg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(DaftarActivity.this, LoginActivity.class);
                startActivity(i);
            }
        }); // Memberikan Listener pada Button

        daftar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(DaftarActivity.this, PinActivity.class);
                startActivity(i);
            }
        });
    }
}
package com.smartparking.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView reg = (TextView) findViewById(R.id.txtReg);
        Button masuk = (Button) findViewById(R.id.btnMasukHome);

        // tombol daftar
        reg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, DaftarActivity.class);
                startActivity(i);
            }
        }); // Memberikan Listener pada Button

        masuk.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                Intent i = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });
    }
}
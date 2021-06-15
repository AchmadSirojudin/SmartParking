package com.smartparking.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BarcodeActivity extends AppCompatActivity {


    private Button print, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barcode);

//        print = findViewById(R.id.btnCetak);
//        back = findViewById(R.id.btnKembaliKB);

//        print.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v2) {
//                Intent i = new Intent(BarcodeActivity.this, Cetak.class);
//                startActivity(i);
//            }
//        });

//        back.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v2) {
//                Intent i = new Intent(BarcodeActivity.this, HomeActivity.class);
//                startActivity(i);
//            }
//        });
    }
}
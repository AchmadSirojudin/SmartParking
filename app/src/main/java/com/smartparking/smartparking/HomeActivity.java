package com.smartparking.smartparking;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    private ImageView kb, is, r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Menginisialisasi ID untuk Button
        kb = findViewById(R.id.btnBarcode);
        is = findViewById(R.id.btnIsiSaldo);
        r = findViewById(R.id.btnRiwayat);

        // Memberikan Listener pada Button
        /*
        kb.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ii = new Intent(HomeActivity.this, BarcodeActivity.class);
                startActivity(ii);
            }
        });

        is.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                Intent i = new Intent(HomeActivity.this, IsiSaldoActivity.class);
                startActivity(i);
            }
        });

        r.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v3) {
                Intent i = new Intent(HomeActivity.this, RiwayatActivity.class);
                startActivity(i);
            }
        });
        */

    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
        builder.setMessage("Apakah anda yakin ingin keluar?");
        builder.setCancelable(true);
        builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
    }
}
package com.smartparking.smartparking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class KameraActivity extends AppCompatActivity {

    private Button ambilFoto;
    private ImageView hasilFoto;
    private Uri file;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamera);
//
//        ambilFoto = findViewById(R.id.ambilFoto);
//        hasilFoto = findViewById(R.id.hasilFoto);
//
//        ambilFoto.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                ambilFoto();
//            }
//        });
//
//        if (ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//            ambilFoto.setEnabled(false);
//            ActivityCompat.requestPermissions(this, new String[] {
//                    Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE
//            }, 0);
//        }
//    }
//
//    public void onRequestPermissionsResult(int requestCode, String[] permissons, int[] grantResult) {
//        if(requestCode == 0) {
//            if (grantResult.length > 0 && grantResult[0] == PackageManager.PERMISSION_GRANTED &&
//                    grantResult[1] == PackageManager.PERMISSION_GRANTED) {
//                ambilFoto.setEnabled(true);
//            }
//        }
//    }
//
//    public void ambilFoto() {
//        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//        file = Uri.fromFile(getOutputMediaFile());
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, file);
//
//        startActivityForResult(intent, 100);
//    }
//
//    public void onActivityResult(int requestCode) {
//
    }
}
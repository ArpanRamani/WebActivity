package com.example.webactivity;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class HospitalDasboard extends AppCompatActivity {

    ImageView imgBtn;
    CircleImageView imgDental, imgHart, imgEye, imgNidl, imgEar, imgBones,imgDp;
    AppCompatButton btnAppoiment;
    int SELECT_PICTURE=100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_dasboard);
        initView();
    }

    private void initView() {

        imgDp = findViewById(R.id.imgDp);
        imgDental = findViewById(R.id.imgDental);
        imgHart = findViewById(R.id.imgHart);
        imgEye = findViewById(R.id.imgEye);
        imgNidl = findViewById(R.id.imgNidl);
        imgEar = findViewById(R.id.imgEar);
        imgBones = findViewById(R.id.imgBones);
        imgBtn = findViewById(R.id.imgBtn);
        btnAppoiment = findViewById(R.id.btnAppoiment);

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, MenuPageActivity.class);
                startActivity(intent);

            }
        });

        imgDental.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        imgHart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        imgEye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        imgNidl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        imgEar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        imgBones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        btnAppoiment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HospitalDasboard.this, AppoimentHospital.class);
                startActivity(intent);

            }
        });

        imgDp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imageChooser();

            }
        });


    }

    private void imageChooser() {

        Intent i = new Intent();
        i.setType("image/*");
        i.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(i,"Select picture"),SELECT_PICTURE);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Log.e("TAG", "onActivityResult: "+requestCode +" = "+resultCode+" = "+data+" = ");

        if (requestCode == 100  && resultCode == SELECT_PICTURE)
        {
            Uri selectedImageUri = data.getData();
            if (null != selectedImageUri){
                imgDp . setImageURI(selectedImageUri);
            }

        }


    }
}
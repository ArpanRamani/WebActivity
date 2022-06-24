package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class AppoimentHospital extends AppCompatActivity {

    RelativeLayout ReHospitalHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoiment_hospital);
        
        initView();
    }

    private void initView() {

        ReHospitalHome = findViewById(R.id.ReHospitalHome);

        ReHospitalHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(AppoimentHospital.this,HospitalDasboard.class);
                startActivity(intent);

            }
        });

    }
}
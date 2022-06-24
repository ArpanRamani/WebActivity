package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class HospitalActivity extends AppCompatActivity {

    AppCompatButton btnReHospital;
    EditText editName, editEmail, editCall;
    String Name, Email, Call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital);

        initView();

    }

    private void initView() {

        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editCall = findViewById(R.id.editCall);
        btnReHospital = findViewById(R.id.btnReHospital);


        btnReHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Name = editName.getText().toString();
                Email = editEmail.getText().toString();
                Call = editCall.getText().toString();

                if (Name.isEmpty()) {
                    Toast.makeText(HospitalActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                } else if (Email.isEmpty()) {
                    Toast.makeText(HospitalActivity.this, "Enter your Email address", Toast.LENGTH_SHORT).show();
                } else if (Call.isEmpty()) {
                    Toast.makeText(HospitalActivity.this, "Enter your contact number", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(HospitalActivity.this, HospitalDasboard.class);
                    startActivity(intent);

                }

            }
        });
    }


}
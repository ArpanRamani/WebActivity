package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ReSingIn extends AppCompatActivity {

    AppCompatButton btnRegistrationS;
    EditText edtEmail, edtPassWord;
    String email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_sing_in);

        initView();

    }

    private void initView() {

        edtEmail = findViewById(R.id.edtEmail);
        edtPassWord = findViewById(R.id.edtPassWord);
        btnRegistrationS = findViewById(R.id.btnRegistrationS);


        btnRegistrationS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email = edtEmail.getText().toString();
                pass = edtPassWord.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(ReSingIn.this, "Enter your email address", Toast.LENGTH_SHORT).show();
                } else if (pass.isEmpty()) {
                    Toast.makeText(ReSingIn.this, "Enter your pass word ", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ReSingIn.this, ReDasboardActivity.class);
                    startActivity(intent);

                }

            }
        });

    }
}
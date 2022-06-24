package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RestaurantsActivity extends AppCompatActivity {

    AppCompatButton btnLogin;
    TextView txtSignIn;
    EditText editEmail, editPassWord,editName;
    String email, passWord,name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        initView();

    }

    private void initView() {

        btnLogin = findViewById(R.id.btnLogin);
        txtSignIn = findViewById(R.id.txtSignIn);
        editName = findViewById(R.id.editName);
        editEmail = findViewById(R.id.editEmail);
        editPassWord = findViewById(R.id.editPassWord);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                name = editName.getText().toString();
                email = editEmail.getText().toString();
                passWord = editPassWord.getText().toString();

                if (name.isEmpty()){
                    Toast.makeText(RestaurantsActivity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                }
                else if (email.isEmpty()) {
                    Toast.makeText(RestaurantsActivity.this, "Enter your email address", Toast.LENGTH_SHORT).show();
                }
                else if (passWord.isEmpty()) {
                    Toast.makeText(RestaurantsActivity.this, "Enter your passWord ", Toast.LENGTH_SHORT).show();
                }
                else if(passWord.length() >=4 && passWord.length() <=8){}

                else {
                    Intent intent = new Intent(RestaurantsActivity.this, ReDasboardActivity.class);
                    intent.putExtra("name",name);
                    intent.putExtra("email",email);
                    startActivity(intent);

                }
            }
        });

        txtSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RestaurantsActivity.this, ReSingIn.class);
                startActivity(intent);
            }
        });

    }
}
package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MenuPageActivity extends AppCompatActivity {

    LinearLayout LHome,lLogOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page);

        initView();

    }

    private void initView() {

        LHome = findViewById(R.id.LHome);
        lLogOut = findViewById(R.id.lLogOut);

        LHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MenuPageActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });

        lLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }


}
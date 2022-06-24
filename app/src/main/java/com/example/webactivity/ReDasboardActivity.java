package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class ReDasboardActivity extends AppCompatActivity {

    RelativeLayout reBurger,rePizza,raMonginis,raIceCream;
    ImageView imgMenu;
    String []  url = new String[4];
    String email, passWord,name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_dasboard);

        initView();

    }

    private void initView() {

        reBurger = findViewById(R.id.reBurger);
        rePizza = findViewById(R.id.rePizza);
        raMonginis = findViewById(R.id.raMonginis);
        raIceCream = findViewById(R.id.raIceCream);
        imgMenu = findViewById(R.id.imgMenu);



        url [0] = "https://online.kfc.co.in/";
        url [1] = "https://lapinozpizza.in/";
        url [2] = "http://www.monginisstoredealership.com/";
        url [3] = "https://amul.com/products/icecream.php";

        reBurger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReDasboardActivity.this,UrlActivity.class);
                intent.putExtra("link",url[0]);
                startActivity(intent);
            }
        });

        rePizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReDasboardActivity.this,UrlActivity.class);
                intent.putExtra("link",url[1]);
                startActivity(intent);
            }
        });

        raMonginis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReDasboardActivity.this,UrlActivity.class);
                intent.putExtra("link",url[2]);
                startActivity(intent);
            }
        });

        raIceCream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReDasboardActivity.this,UrlActivity.class);
                intent.putExtra("link",url[3]);
                startActivity(intent);
            }
        });

        imgMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ReDasboardActivity.this,MenuPageActivity.class);
                startActivity(intent);
            }
        });



    }
}
package com.example.webactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CarActivity extends AppCompatActivity {

    Button btnBmw,btnAudi,btnFord,btnMercedes,btnThar,btnKia;
    String []  url = new String[6];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        initView();

    }

    private void initView() {

        btnBmw = findViewById(R.id.btnBmw);
        btnAudi = findViewById(R.id.btnAudi);
        btnFord = findViewById(R.id.btnFord);
        btnMercedes = findViewById(R.id.btnMercedes);
        btnThar = findViewById(R.id.btnThar);
        btnKia = findViewById(R.id.btnKia);

        url[0] = "https://www.carwale.com/bmw-cars/x4-2019-2022/xdrive30d-m-sport-x/";
        url[1] = "https://www.carwale.com/audi-cars/a8-l/";
        url[2] = "https://www.carwale.com/ford-cars/mustang/";
        url[3] = "https://www.cardekho.com/carmodels/Mercedes-Benz/Mercedes-Benz_C-Class";
        url[4] = "https://www.carwale.com/mahindra-cars/thar/";
        url[5] = "https://www.carwale.com/kia-cars/ev6/";





        btnBmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this,UrlActivity.class);
                intent.putExtra("link",url[0]);
                startActivity(intent);

            }
        });

        btnAudi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this,UrlActivity.class);
                intent.putExtra("link",url[1]);
                startActivity(intent);

            }
        });

        btnFord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this,UrlActivity.class);
                intent.putExtra("link",url[2]);
                startActivity(intent);

            }
        });

        btnMercedes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this,UrlActivity.class);
                intent.putExtra("link",url[3]);
                startActivity(intent);

            }
        });

        btnThar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this,UrlActivity.class);
                intent.putExtra("link",url[4]);
                startActivity(intent);

            }
        });

        btnKia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CarActivity.this,UrlActivity.class);
                intent.putExtra("link",url[5]);
                startActivity(intent);

            }
        });


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.menu,menu);
//        return  true;
//    }
//
//    @Override
//    public  boolean onOptionsItemSelected(MenuItem item){
//        int id = item.getItemId();
//
//        if (id == R.id.share){
//            Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();
//        }
//
//        else  if (id == R.id.about){Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();}
//
//        else  if (id == R.id.exit){Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();}
//
//        else  if (id == R.id.search){Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();}
//
//        else  if (id == R.id.setting){Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();}
//
//        return  true;
//    }
}
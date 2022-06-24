package com.example.webactivity;

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
public class MainActivity extends AppCompatActivity {

    Button btnCar,btnRestaurants,btnHospital,btnShop;


//    private Toolbar supportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        initView();
    }

    private void initView() {

        btnCar = findViewById(R.id.btnCar);
        btnRestaurants = findViewById(R.id.btnRestaurants);
        btnHospital = findViewById(R.id.btnHospital);
        btnShop = findViewById(R.id.btnShop);

        btnCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,CarActivity.class);
                startActivity(intent);
            }
        });

        btnRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,RestaurantsActivity.class);
                startActivity(intent);
            }
        });

        btnHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,HospitalActivity.class);
                startActivity(intent);
            }
        });

        btnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,ShopActivity.class);
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
//       else  if (id == R.id.about){Toast.makeText(this, "Click", Toast.LENGTH_SHORT).show();}
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
package com.example.uas_iqbalardiansyah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cvAdd, cvAdd1, cvAdd2, cvAdd3, cvAdd4, cvAdd5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvAdd = (CardView)findViewById(R.id.cvAdd);

        cvAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pertemuan 8", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MapsActivity.class));
            }
        });

        cvAdd1 = (CardView)findViewById(R.id.cvAdd1);

        cvAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pertemuan 9", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity2.class));
            }
        });

        cvAdd2 = (CardView)findViewById(R.id.cvAdd2);

        cvAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pertemuan 10", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), CarsActivity.class));
            }
        });

        cvAdd3 = (CardView)findViewById(R.id.cvAdd3);

        cvAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pertemuan 11", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity3.class));
            }
        });

        cvAdd4 = (CardView)findViewById(R.id.cvAdd4);

        cvAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pertemuan 12", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity4.class));
            }
        });

        cvAdd5 = (CardView)findViewById(R.id.cvAdd5);

        cvAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pertemuan 13", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(), MainActivity5.class));
            }
        });
    }
}
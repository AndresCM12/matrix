package com.example.matrix_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import spencerstudios.com.bungeelib.Bungee;

public class ayuda extends AppCompatActivity {
 Button btnVolver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayuda);

        btnVolver = findViewById(R.id.btnArrow2);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent volver = new Intent(ayuda.this, MainActivity.class);
                startActivity(volver);
                Bungee.slideDown(ayuda.this);
            }
        });
    }


}
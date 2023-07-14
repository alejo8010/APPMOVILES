package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    Button btn_guardarsesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        btn_guardarsesion = findViewById(R.id.btn_guardarsesion);


        btn_guardarsesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity4.this, MainActivity4.class);
                startActivity(intent);

            }

        });
    }
}
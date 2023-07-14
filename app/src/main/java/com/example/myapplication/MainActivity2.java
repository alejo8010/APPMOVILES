package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView txt_resultado;
    Button btn_horario;
    Button btn_sesiones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        btn_horario = findViewById(R.id.btn_horario);
        btn_sesiones = findViewById(R.id.btn_sesiones);


        txt_resultado = findViewById(R.id.txt_resultado);

        Bundle recepcion = getIntent().getExtras();
        String datos = recepcion.getString("info");


        txt_resultado.setText(datos);

        btn_horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);

                Toast.makeText(MainActivity2.this, "HORARIO CREADO", Toast.LENGTH_SHORT).show();
            }
        });
        btn_sesiones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(intent);

                Toast.makeText(MainActivity2.this, "SESION CREADA", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mymenu, menu);
        return true;
    }


        @Override
        public boolean onOptionsItemSelected(@NonNull MenuItem item) {
            int id = item.getItemId();

            if (id == R.id.icono2) {
                finish();
                return true;
            }
            return super.onOptionsItemSelected(item);
        }
}


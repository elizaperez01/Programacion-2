package com.example.bloque1actividad1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.QuickContactBadge;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText elname;
    EditText ellastname;

    Button Boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        elname = (EditText) findViewById(R.id.editNombre);

        ellastname = (EditText) findViewById(R.id.editApellido);

        Boton = (Button) findViewById(R.id.Boton);

        Boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento = new Intent(MainActivity.this, MainActivity2.class);

                String elNombre = elname.getText().toString();
                String elApellido = ellastname.getText().toString();


                intento.putExtra("nombre",elNombre);
                intento.putExtra("apellido",elApellido);

                startActivity(intento);
            }
        });


    }}
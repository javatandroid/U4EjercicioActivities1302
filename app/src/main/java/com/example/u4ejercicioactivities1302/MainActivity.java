package com.example.u4ejercicioactivities1302;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    static final String EXTRA_NOMBRE ="NOMBRE";
    EditText etNombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.etNombre);
    }

    public void irSegundaActivity(View view){
        String nombre = etNombre.getText().toString();
        //Navegar a la siguiente Activity
        Intent i = new Intent(getApplicationContext(), SegundaActivity.class);
        startActivity(i);
        i.putExtra(EXTRA_NOMBRE,nombre);
        startActivity(i);
    }

    public void Ejercicio1 (View view){
        Intent i = new Intent(getApplicationContext(), Ejercicio1Activity.class);
        startActivity(i);
    }
}


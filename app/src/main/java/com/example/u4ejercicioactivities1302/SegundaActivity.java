package com.example.u4ejercicioactivities1302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Bundle b = getIntent().getExtras();

        if(b!=null){
            String nombre = b.getString(MainActivity.EXTRA_NOMBRE);

            Toast.makeText(getApplicationContext(),"Nombre recogido "+nombre, Toast.LENGTH_SHORT).show();
        }
    }
}

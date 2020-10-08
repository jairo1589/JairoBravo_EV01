package com.example.jairobravo_ev01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText txt_nombre, txt_contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_nombre = (EditText)findViewById(R.id.nombre);
        txt_contraseña = (EditText)findViewById(R.id.contraseña);

    }

    public void iniciar(View view){

        String nombre = txt_nombre.getText().toString();
        String contraseña = txt_contraseña.getText().toString();

        if(nombre.equalsIgnoreCase("android") && contraseña.equalsIgnoreCase("123"))
        {
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
            finish();
        }else if(nombre.equalsIgnoreCase("Android") && contraseña.equalsIgnoreCase("123"))
        {
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
            finish();
        }else{

            Toast.makeText(this, "Login incorrecto", Toast.LENGTH_SHORT).show();
        }

    }
}
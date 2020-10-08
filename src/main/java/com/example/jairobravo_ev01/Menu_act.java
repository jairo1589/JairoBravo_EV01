package com.example.jairobravo_ev01;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu_act extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_act);
    }


    public void clientes(View view)
    {

        Intent i = new Intent(this, Clientes_act.class);
        startActivity(i);
        onPause();

    }

    public void productos(View view)
    {

        Intent i = new Intent(this, Product_act.class);
        startActivity(i);

        onPause();

    }

    public void informacion(View view)
    {

        Intent i = new Intent(this, Info_act.class);
        startActivity(i);

        onPause();

    }

    public void comentarios(View view)
    {

        Intent i = new Intent(this, Commentary_act.class);
        startActivity(i);

        onPause();

    }




}
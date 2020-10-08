package com.example.jairobravo_ev01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class Commentary_act extends AppCompatActivity {

    private ProgressBar progress;
    private Spinner spinner;
    private RatingBar estrellas;
    private int progreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentary_act);
        spinner = (Spinner)findViewById(R.id.spinner);
        progress = (ProgressBar)findViewById(R.id.barra);
        estrellas = (RatingBar)findViewById(R.id.estrellas);

        Timer t = new Timer();

        TimerTask tt = new TimerTask() {
            @Override
            public void run() {

                progreso++;
                progress.setProgress(progreso);
            }
        };

        long period = 100;
        long delay = 0;

        t.schedule(tt, delay, period);

        String[] productos = {"Seleccionar producto","Televisor", "Horno", "Refrigerador", "Lavadora"};


        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, productos);
        spinner.setAdapter(adapt);
    }

    public void calificar (View view)
    {
        estrellas.setRating(3);
    }
}
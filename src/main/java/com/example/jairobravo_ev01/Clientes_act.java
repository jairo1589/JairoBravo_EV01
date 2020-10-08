package com.example.jairobravo_ev01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Clientes_act extends AppCompatActivity {

    private Spinner spn_spinner;
    private TextView txt_mensaje;
    private Button btn_calcular;
    private EditText txt_producto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);

        spn_spinner = (Spinner)findViewById(R.id.spinner);
        txt_mensaje = (TextView)findViewById(R.id.mensaje);
        btn_calcular = (Button)findViewById(R.id.calcular);
        txt_producto = (EditText)findViewById(R.id.producto);

        String[] personas = {"Seleccionar persona","Mario", "Constanza", "Fernanda"};

        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, personas);
        spn_spinner.setAdapter(adapt);
    }

    public void Calcular (View view)
    {
        String nombre = (String) spn_spinner.getSelectedItem();
        String producto = txt_producto.getText().toString();
        String mensaje = txt_mensaje.getText().toString();

        if (nombre.equals("Mario"))
        {
            if(producto !=("horno") && producto !=("espejo") && producto !=("sillas"))
            {
                Toast.makeText(this, "Ingrese el producto correctamente", Toast.LENGTH_SHORT).show();
            }

            if(producto.equals("horno"))
            {
                int saldo_restante = 500000 - 45000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }

            if(producto.equals("espejo"))
            {
                int saldo_restante = 500000 - 100000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }

            if(producto.equals("sillas"))
            {
                int saldo_restante = 500000 - 80000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }
        }

        if (nombre.equals("Constanza"))
        {
            if(producto !=("horno") && producto !=("espejo") && producto !=("sillas"))
            {
                Toast.makeText(this, "Ingrese el producto correctamente", Toast.LENGTH_SHORT).show();
            }

            if(producto.equals("horno"))
            {
                int saldo_restante = 320000 - 45000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }

            if(producto.equals("espejo"))
            {
                int saldo_restante = 320000 - 100000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }

            if(producto.equals("sillas"))
            {
                int saldo_restante = 320000 - 80000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }
        }

        if (nombre.equals("Fernanda"))
        {
            if(producto !=("horno") && producto !=("espejo") && producto !=("sillas"))
            {
                Toast.makeText(this, "Ingrese el producto correctamente", Toast.LENGTH_SHORT).show();
            }

            if(producto.equals("horno"))
            {
                int saldo_restante = 120000 - 45000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }

            if(producto.equals("espejo"))
            {
                int saldo_restante = 120000 - 100000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }

            if(producto.equals("sillas"))
            {
                int saldo_restante = 120000 - 80000;
                txt_mensaje.setText("Su saldo es: " + saldo_restante + "pesos.");
            }
        }

    }
}
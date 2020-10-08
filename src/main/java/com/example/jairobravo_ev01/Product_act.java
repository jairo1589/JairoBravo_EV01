package com.example.jairobravo_ev01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Product_act extends AppCompatActivity {

    private EditText txt_nombre, txt_monto;
    private CheckBox chk_envio, chk_retiro, chk_gratis;
    private Button btt_calcular;
    private TextView txt_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_act);
        txt_nombre = (EditText)findViewById(R.id.nombre);
        txt_monto = (EditText)findViewById(R.id.monto);
        chk_envio = (CheckBox)findViewById(R.id.domicilio);
        chk_retiro = (CheckBox)findViewById(R.id.retiro);
        chk_gratis = (CheckBox)findViewById(R.id.gratis);
        btt_calcular = (Button)findViewById(R.id.calcular);
        txt_mensaje = (TextView)findViewById(R.id.mensaje);
    }

    public void calcular(View view)
    {
        String pagado = "El producto ha sido pagado";
        String nombre = txt_nombre.getText().toString();
        String monto = txt_monto.getText().toString();
        int envio = 0;

        if(nombre.equalsIgnoreCase("televisor"))
        {
            if(chk_envio.isChecked())
            {
                envio = 14500 + 129000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }

            if(chk_retiro.isChecked())
            {
                envio = 0 + 129000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }

            if(chk_gratis.isChecked())
            {
                envio = 0 + 129000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }




        }

        if(nombre.equalsIgnoreCase("microondas"))
        {
            if(chk_envio.isChecked())
            {
                envio = 5500 + 50000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }

            if(chk_retiro.isChecked())
            {
                envio = 0 + 50000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }

            if(chk_gratis.isChecked())
            {
                envio = 0 + 50000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }


        }
        if(nombre.equalsIgnoreCase("lavadora"))
        {
            if(chk_envio.isChecked())
            {
                envio = 25000 + 100000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }

            if(chk_retiro.isChecked())
            {
                envio = 0 + 100000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }

            if(chk_gratis.isChecked())
            {
                envio = 0 + 100000;
                int precio = Integer.parseInt(monto);
                int deuda = envio - precio;
                String deudafinal = String.valueOf(deuda);
                if (deuda == 0)
                {
                    txt_mensaje.setText(pagado);
                }else if (deuda < 0) {
                    int saldo = deuda * -1;
                    txt_mensaje.setText(pagado);
                    Toast.makeText(this, "Le queda un saldo a favor de: " + saldo + ".", Toast.LENGTH_SHORT).show();
                }else{

                    txt_mensaje.setText("Usted tiene una deuda de: " + deudafinal + " " + "pesos.");

                }
            }


        }
    }
}
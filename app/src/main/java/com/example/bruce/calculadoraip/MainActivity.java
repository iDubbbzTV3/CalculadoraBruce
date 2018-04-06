package com.example.bruce.calculadoraip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText ipadress,subnet,totalips,ip,broadcast,netid, mask, bitsred, bitshost;
    private Redes red = new Redes();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ipadress =  findViewById(R.id.editText);
        subnet = findViewById(R.id.editText2);
        totalips = findViewById(R.id.editText5);
        ip = findViewById(R.id.editText6);
        broadcast = findViewById(R.id.editText4);
        netid = findViewById(R.id.editText3);
        mask = findViewById(R.id.editText9);
        bitsred = findViewById(R.id.editText8);
        bitshost = findViewById(R.id.editText7);
    }


    public void red(View v) {
        String ipad= ipadress.getText().toString();
        String Ssubnet = subnet.getText().toString();
         // Se valida si la ip es valida y ademas si la mascara se encuentra entre 0 y 32
            String[] datos = red.IP(ipad,Ssubnet);
            netid.setText(datos[2]);
            broadcast.setText(datos[4]);
            totalips.setText(datos[0]);
            ip.setText(datos[1]);
            mask.setText(datos[3]);
            bitsred.setText(datos[6]);
            bitshost.setText(datos[5]);

    }
}

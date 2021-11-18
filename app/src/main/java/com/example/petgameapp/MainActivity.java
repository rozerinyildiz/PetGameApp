package com.example.petgameapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tv;
    TextView tvKarakterOzellikleri;
    int sayac = 0;

    Button btnSaldir;
    Button btnYemekYe;
    Button btnUyu;
    karakter k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.message);
        tvKarakterOzellikleri = (TextView) findViewById(R.id.karakterOzellikleri);

        btnSaldir = (Button) findViewById(R.id.saldir) ;
        btnYemekYe = (Button) findViewById(R.id.yemekye);
        btnUyu = (Button) findViewById(R.id.uyu);

        btnSaldir.setOnClickListener(this);
        btnYemekYe.setOnClickListener(this);
        btnUyu.setOnClickListener(this);
       /* btnUyu.setOnClickListener(new View.OnClickListener() { // ikinci yöntem basılınca
            @Override
            public void onClick(View view) {
                tv.setText("uyu" + sayac++);
            }
        });

        */
        k = new karakter();
        k.hareketSayisi = 10;
        k.kilo = 10;
        k.saldiriGucu = 100;
        tv.setText("Oyuna hoş geldiniz! Lütfen bir eylem seçin.");
        tvKarakterOzellikleri.setText(k.toString());
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == btnSaldir.getId()){ // birinci yöntem
            tv.setText(k.savas());
        }else if(view.getId() == btnYemekYe.getId()){
            tv.setText(k.yemek());
        }else if(view.getId() == btnUyu.getId()){
            tv.setText(k.uyumak());
        }
        tvKarakterOzellikleri.setText(k.toString());
    }
}
package com.id.it.pradita.uas;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Doa extends AppCompatActivity {
    ImageButton lanjut,home,Tidur1, Tidur2,makan;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa);
        lanjut = (ImageButton) findViewById(R.id.lanjut);
        lanjut.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent lanjut = new Intent(Doa.this,Doa2.class);
                                         startActivity(lanjut);

                                     }
                                 }
        );

        home = (ImageButton) findViewById(R.id.home3);
        home.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent home = new Intent(Doa.this,menu.class);
                                           startActivity(home);

                                       }
                                   }
        );
        Tidur1 = (ImageButton) findViewById(R.id.tidur);
        Tidur1.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent Tidur1 = new Intent(Doa.this,SebelumTidur.class);
                                         startActivity(Tidur1);

                                     }
                                 }
        );
        Tidur2 = (ImageButton)findViewById(R.id.tidur1);
        Tidur2.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent Tidur2 = new Intent(Doa.this,sesudahtidur.class);
                                          startActivity(Tidur2);

                                      }
                                  }
        );
        makan = (ImageButton)findViewById(R.id.makan);
        makan.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent makan = new Intent(Doa.this,sebelummakan.class);
                                          startActivity(makan);

                                      }
                                  }
        );

    }
}

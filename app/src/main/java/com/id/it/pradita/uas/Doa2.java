package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Doa2 extends AppCompatActivity {
    ImageButton lanjut,kembali1,home;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa2);
        lanjut = (ImageButton) findViewById(R.id.lanjut1);
        lanjut.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent lanjut = new Intent(Doa2.this,Doa3.class);
                                          startActivity(lanjut);

                                      }
                                  }
        );
        kembali1 = (ImageButton) findViewById(R.id.kembali1);
        kembali1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent kembali1 = new Intent(Doa2.this,Doa.class);
                                           startActivity(kembali1);

                                       }
                                   }
        );
        home = (ImageButton) findViewById(R.id.home1);
        home.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent home = new Intent(Doa2.this,menu.class);
                                           startActivity(home);

                                       }
                                   }
        );
    }
}

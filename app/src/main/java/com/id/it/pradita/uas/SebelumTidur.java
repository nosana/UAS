package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SebelumTidur extends AppCompatActivity {
    ImageButton close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebelum_tidur);
        close = (ImageButton) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent close= new Intent(SebelumTidur.this,Doa.class);
                                          startActivity(close);

                                      }
                                  }
        );
    }

}

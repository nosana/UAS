package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SebelumTidur extends AppCompatActivity {
    Button boo,close,video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebelum_tidur);
        close = (Button) findViewById(R.id.kembali);
        close.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent close= new Intent(SebelumTidur.this,Doa.class);
                                          startActivity(close);

                                      }
                                  }
        );
        Button boo = (Button) findViewById(R.id.latin);
        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arab = new Intent(SebelumTidur.this,Latin.class);
                startActivity(arab);
            }
        });
        Button video = (Button) findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(SebelumTidur.this,video.class);
                startActivity(video);
            }
        });
    }

}

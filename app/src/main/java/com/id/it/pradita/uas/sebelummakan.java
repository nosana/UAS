package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sebelummakan extends AppCompatActivity {
    ImageButton close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sebelummakan);
        Button close = findViewById(R.id.kembaliA);
        close.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent close= new Intent(sebelummakan.this,Doa.class);
                                         startActivity(close);

                                     }
                                 }
        );

        Button boo = (Button) findViewById(R.id.latin3);
        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arab = new Intent(sebelummakan.this,latin3.class);
                startActivity(arab);
            }
        });
        Button video = (Button) findViewById(R.id.video3);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(sebelummakan.this,video3.class);
                startActivity(video);
            }
        });
    }
}

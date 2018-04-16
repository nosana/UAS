package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Latin1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latin1);
        Button close = (Button) findViewById(R.id.kembaliA);
        close.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent close= new Intent(Latin1.this,Doa.class);
                                         startActivity(close);

                                     }
                                 }
        );
        Button boo1 = (Button) findViewById(R.id.arab1);
        boo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arab = new Intent(Latin1.this,sesudahtidur.class);
                startActivity(arab);
            }
        });
        Button video = (Button) findViewById(R.id.video1);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(Latin1.this,video1.class);
                startActivity(video);
            }
        });
    }
}

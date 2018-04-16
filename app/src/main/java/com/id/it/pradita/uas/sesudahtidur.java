package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sesudahtidur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesudahtidur);
        Button close = (Button) findViewById(R.id.kembali);
        close.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent close= new Intent(sesudahtidur.this,Doa.class);
                                         startActivity(close);

                                     }
                                 }
        );
        Button boo = (Button) findViewById(R.id.latin);
        boo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent arab = new Intent(sesudahtidur.this,Latin1.class);
                startActivity(arab);
            }
        });
        Button video = (Button) findViewById(R.id.video);
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent video = new Intent(sesudahtidur.this,video1.class);
                startActivity(video);
            }
        });
    }
}

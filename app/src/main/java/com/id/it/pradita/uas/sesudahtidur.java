package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class sesudahtidur extends AppCompatActivity {
    ImageButton close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesudahtidur);
        close = (ImageButton) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent close= new Intent(sesudahtidur.this,Doa.class);
                                         startActivity(close);

                                     }
                                 }
        );
    }
}

package com.id.it.pradita.uas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Doa3 extends AppCompatActivity {
    ImageButton home, kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa3);

        home = (ImageButton) findViewById(R.id.home2);
        home.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent home = new Intent(Doa3.this,menu.class);
                                        startActivity(home);

                                    }
                                }
        );
        kembali = (ImageButton) findViewById(R.id.kembali1);
        kembali.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent home = new Intent(Doa3.this,Doa2.class);
                                        startActivity(home);

                                    }
                                }
        );
    }
}

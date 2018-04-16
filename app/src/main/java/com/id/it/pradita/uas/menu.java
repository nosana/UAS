package com.id.it.pradita.uas;

import android.annotation.SuppressLint;
import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class menu extends AppCompatActivity {

    ImageButton info,quiz;
    Button mulai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        mulai = (Button) findViewById(R.id.mulai_1);
        mulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mulai = new Intent(menu.this,Doa.class);
                startActivity(mulai);

            }
        }
        );
        info = findViewById(R.id.infor);
        info.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
            Intent info = new Intent(menu.this,informasi.class);
            startActivity(info);

        }
    }
        );
        quiz = (ImageButton) findViewById(R.id.quiz);
        quiz.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent quiz = new Intent(menu.this,quis.class);
                                        startActivity(quiz);

                                    }
                                }
        );

    }

    }


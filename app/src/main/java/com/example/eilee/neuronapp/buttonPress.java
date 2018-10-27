package com.example.eilee.neuronapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class buttonPress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_press);

        Button axonBtn = (Button) findViewById(R.id.button2);

        axonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buttonPress.this, axon.class);
                startActivity(intent);
            }
        });

        Button synapseBtn = (Button) findViewById(R.id.button5);

        synapseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buttonPress.this, synapse.class);
                startActivity(intent);
            }
        });

        Button nucBtn = (Button) findViewById(R.id.button3);

        nucBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buttonPress.this, nucleus.class);
                startActivity(intent);
            }
        });

        Button denBtn = (Button) findViewById(R.id.button4);

        denBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buttonPress.this, den.class);
                startActivity(intent);
            }
        });
    }
}

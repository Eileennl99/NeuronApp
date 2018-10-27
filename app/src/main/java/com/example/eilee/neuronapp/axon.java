package com.example.eilee.neuronapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class axon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_axon);
        Button axonBtn=findViewById(R.id.button);
        final TypeWriter tw = (TypeWriter) findViewById(R.id.tv);

        axonBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tw.setText("");
                tw.setCharacterDelay(150);
                // for some reason this method cuts off the last character so I added an extra e
                tw.animateText("I'm the greatest neuron of all timeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
            }
        });
    }
}

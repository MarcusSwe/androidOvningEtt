package com.example.ovningett;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        TextView helloText = findViewById(R.id.omegaTest);

        Button button = findViewById(R.id.button);

        Button buttonGoToCompass = findViewById(R.id.button2);

        String xtest = getResources().getString(R.string.app_name);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String testo = (String) helloText.getText();
                if (testo.equals("zzzzz")) {
                    helloText.setText(xtest);
                } else {
                    helloText.setText("zzzzz");
                }
            }
        });

        buttonGoToCompass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent (MainActivity.this, MainActivity2.class));
            }
        });

    }
}
package com.example.app.f0m2app01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnClickMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClickMe = findViewById(R.id.btnClickMe);

        btnClickMe.setOnClickListener(view -> {
            if (btnClickMe.getText().toString() != "Soy Azul"){
                btnClickMe.setBackgroundColor(Color.parseColor("#6495ED"));
                btnClickMe.setText("Soy Azul");
            } else {
                btnClickMe.setBackgroundColor(Color.parseColor("#FF0000"));
                btnClickMe.setText("Soy Rojo");
            }
        });
    }
}
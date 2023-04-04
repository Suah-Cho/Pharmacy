package com.example.pharmacyinven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button button1 = findViewById(R.id.loginbutton);
        button1.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MapActivity.class);
            startActivity(intent);
        });

        Button button2 = findViewById(R.id.signin);
        button2.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), JoinActivity.class);
            startActivity(intent);
        });
    }


}
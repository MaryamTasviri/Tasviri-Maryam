package com.example.malam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class third_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_activity);

        TextView textViewN = findViewById(R.id.name);
        TextView textViewA = findViewById(R.id.age);
        TextView textViewE = findViewById(R.id.email);
        TextView textViewP = findViewById(R.id.phone);

        Intent intent = getIntent();
        String name, age, email, phone;
        name = intent.getStringExtra("Name");
        age = intent.getStringExtra("Age");
        email = intent.getStringExtra("Email");
        phone = intent.getStringExtra("Phone");

        textViewN.setText(name);
        textViewA.setText(age);
        textViewE.setText(email);
        textViewP.setText(phone);




    }
}

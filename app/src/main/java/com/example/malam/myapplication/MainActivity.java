package com.example.malam.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("yessss!!");

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                EditText name, age, email, phone;
                name = findViewById(R.id.name);
                age = findViewById(R.id.age);
                email = findViewById(R.id.email);
                phone = findViewById(R.id.phone);

                intent.putExtra("Name",name.getText().toString() );
                intent.putExtra("Age",age.getText().toString() );
                intent.putExtra("Email",email.getText().toString() );
                intent.putExtra("Phone",phone.getText().toString() );

                startActivity(intent);

            }
        });
    }




}

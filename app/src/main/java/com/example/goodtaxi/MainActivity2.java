package com.example.goodtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        EditText text1 = (EditText) findViewById(R.id.editTextTextEmailAddress4);
        EditText text2 = (EditText) findViewById(R.id.editTextTextPassword);
        EditText text3 = (EditText) findViewById(R.id.editText3);
        Button button1 = (Button) findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("") || text2.getText().toString().equals("") || text3.getText().toString().equals("")) {
                    Toast.makeText(MainActivity2.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent j = new Intent(MainActivity2.this, MainActivity.class);
                    startActivity(j);
                }
            }
        });

    }
}
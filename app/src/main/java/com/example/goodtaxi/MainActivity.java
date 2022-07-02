package com.example.goodtaxi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text1 = (EditText) findViewById(R.id.editTextTextEmailAddress4);
        TextView textView1 = (TextView) findViewById(R.id.textView2);
        EditText text2 = (EditText) findViewById(R.id.editTextTextPassword);
        Button button1 = (Button) findViewById(R.id.button2);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(j);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString().equals("") || text2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
                } else {
                    Intent j = new Intent(MainActivity.this, MainActivity3.class);
                    startActivity(j);
                }
            }
        });


    }
}

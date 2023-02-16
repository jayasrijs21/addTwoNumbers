package com.example.addtwonumbers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView solution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        solution = (TextView) findViewById(R.id.tvsol);
       int str = getIntent().getIntExtra("value" , 0);
       // Intent intent = getIntent();
        //String str = intent.getStringExtra("value");

       solution.setText("Answer is: " + str);
    }
}
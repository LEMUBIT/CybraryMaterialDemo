package com.lemubit.lemuel.cybrarymaterialdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String message = getIntent().getStringExtra("theMessage");

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}

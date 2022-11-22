package com.example.first_revise_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = findViewById(R.id.text);

        Intent intent = getIntent();
        String out = intent.getStringExtra("message");
        text.setText(out);
//        Toast.makeText(this, out, Toast.LENGTH_SHORT).show();
    }
}
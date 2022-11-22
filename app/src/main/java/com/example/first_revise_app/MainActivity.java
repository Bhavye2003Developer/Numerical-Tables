package com.example.first_revise_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText number = findViewById(R.id.number);
        EditText range = findViewById(R.id.range);
        Button button = findViewById(R.id.button);
        Button nextButton = findViewById(R.id.next_button);
        ImageView img = findViewById(R.id.imageView2);
        TextView output = findViewById(R.id.textView2);
//        int num = Integer.getInteger(number.toString());

        final int[] num = {0,0};
        final String[] text = {""};
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num[0] = Integer.parseInt(String.valueOf(number.getText()));
                num[1] = Integer.parseInt(String.valueOf(range.getText()));
                for (int i=1; i<=num[1]; i++){
                    text[0] +=String.valueOf(number.getText()) + " x " + Integer.toString(i) + " = " + num[0] * i + "\n";
                }
                img.setVisibility(view.INVISIBLE);
                output.setText(text[0]);
                number.setText("");
                range.setText("");
                Toast.makeText(MainActivity.this, "Thanks for using my app", Toast.LENGTH_SHORT).show();
                    }
                });
                nextButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
                        intent.putExtra("message",text[0]);
                        startActivity(intent);

                        startActivity(intent);
                    }
                });
    }
}
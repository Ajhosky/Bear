package com.example.bear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_layout);



        String[] arraySpinner = new String[] {
                "piwo1", "piwo2", "piwo3", "piwo4", "piwo5", "piwo6", "piwo7"
        };
        TextView textView = findViewById(R.id.textView);
        Button btn = findViewById(R.id.button);
        Spinner s = (Spinner) findViewById(R.id.spinner);

        btn.setOnClickListener(new View.OnClickListener() {

            String chosenBeer = "";
            public void onClick(View v) {
                chosenBeer = s.getSelectedItem().toString();
                textView.setText(chosenBeer);
            }
        });
    }
}
package com.example.firstlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.firstlab.text.TextFunction;

public class MainActivity extends AppCompatActivity {

    //TODO Add new method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText();

        for (int count = 0; count < 10; count++) {
            Log.d("MainActivity","counter" + count);
        }
    }

    private void displayText() {
        TextView tx = findViewById(R.id.newest);
        TextFunction tf = new TextFunction();
        tx.setText(tf.getValue());
    }
}
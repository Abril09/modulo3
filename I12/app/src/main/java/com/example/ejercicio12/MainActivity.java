package com.example.ejercicio12;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView editTextDate;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editTextDate = findViewById(R.id.editTextDate);
        this.textView2 = findViewById(R.id.textView2);
    }
    public void edad(View view){
        int fecha = Integer.parseInt(editTextDate.getText().toString());
        int operacion = 2020 - fecha;
        textView2.setText(String.valueOf(operacion));
    }
}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText valueA;
    private EditText valueB;
    private EditText valueResult;
    private RadioGroup rbOperation;
    private Map<Integer,Operaciones> operations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.valueA = findViewById(R.id.editTextNumber);
        this.valueB = findViewById(R.id.editTextNumber2);
        this.valueResult = findViewById(R.id.editTextNumber3);
        this.rbOperation = findViewById(R.id.radioGroup);
        this.operations = new LinkedHashMap<Integer,Operaciones>();
        this.setOPeration();
    }
    private void setOPeration(){
        this.operations.put(R.id.sumar,Integer::sum);
        this.operations.put(R.id.restar,(int x, int y)-> x-y);
        this.operations.put(R.id.multiplicar,(int x, int y)-> x*y);
        this.operations.put(R.id.dividir,(int x, int y)-> x/y);
        this.operations.put(R.id.mod,(int x, int y)-> x % y);
        this.operations.put(R.id.potencia,(int x, int y)-> (int)Math.pow(x,y));
    }

    public void onClickButton(View view) {
        int num1 = Integer.parseInt(valueA.getText().toString());
        int num2 =  Integer.parseInt(valueB.getText().toString());
        valueResult.setText(
                String.valueOf(
                        this.GetOperations(this.rbOperation.getCheckedRadioButtonId()).run(num1,num2)
                ));
    }

    private  Operaciones GetOperations(Integer id){
        return this.operations.get(id);
    }

}

package com.example.individual11;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import com.jakewharton.threetenabp.AndroidThreeTen;
import org.threeten.bp.LocalDate;
import org.threeten.bp.Period;
import org.threeten.bp.format.DateTimeFormatter;


public class MainActivity extends AppCompatActivity {

    private EditText calendarText;
    private TextView textView2;
    private CalendarView calendar;
    private LocalDate now;
    private LocalDate  calendarDate;

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidThreeTen.init(this);
        this.calendar = findViewById(R.id.calendarView2);
        this.calendarText = findViewById(R.id.editTextDate);
        this.textView2 = findViewById(R.id.textView2);
        this.calendar.setVisibility(View.GONE);
        this.now= LocalDate.now();
        this.calendar.setOnDateChangeListener((CalendarView view, int year, int month, int dayOfMonth)->{
            this.calendarDate =  LocalDate.of(year,month,dayOfMonth);
            this.calendarText.setText(this.calendarDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString());
            this.calendar.setVisibility(View.GONE);
        });
    }


    public void onClickCalendar(View view){
        if (this.calendar.getVisibility() == View.GONE) {
            this.calendar.setVisibility(View.VISIBLE);
        } else {
            this.calendar.setVisibility(View.GONE);
        }
    }

    public void onclickButton(View view){
        int fecha =Period.between(this.calendarDate,this.now).getYears();
        this.textView2.setText(String.valueOf(fecha));

    }
}
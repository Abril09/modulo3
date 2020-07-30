package com.example.individual10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity  {
    Canvas c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.c= new Canvas(this);
        ConstraintLayout relativeLayout =findViewById(R.id.contenedor);
        relativeLayout.addView(c);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.c.corx=event.getX();
        this.c.cory= event.getY();
        this.c.invalidate();
        return true;
    }
}
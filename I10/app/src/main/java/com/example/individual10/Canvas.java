package com.example.individual10;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Canvas extends View {
    float corx=100;
    float cory =100;
    public Canvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(android.graphics.Canvas canvas) {
        canvas.drawRGB(255, 255, 0);
        Paint pincel1 = new Paint();
        pincel1.setARGB(255, 255, 0, 0);
        pincel1.setStrokeWidth(4);
        pincel1.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(corx, cory, 50, pincel1);
    }
}

package com.tiger.mediaquality;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FaceView extends View {
    private Paint mPaint;
    private int mColor = Color.parseColor("#42ed45");
    private ArrayList<RectF> mFaces;

    public FaceView(Context context) {
        super(context);
        init();
    }

    public FaceView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public FaceView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(mColor);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 1f, getContext().getResources().getDisplayMetrics()));
        mPaint.setAntiAlias(true);
    }

    public void setFaces(ArrayList<RectF> faces) {
        mFaces = faces;
        this.postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        TextPaint tp = new TextPaint();
        tp.setTextSize(50);
        canvas.drawText("FaceView",(float)100.0,(float)100.0, tp);
        canvas.drawRect(600, 600, 1000, 1000, mPaint);
        if (mFaces != null) {
            for (RectF face : mFaces) {
                canvas.drawRect(face, mPaint);
            }
        }
    }
}

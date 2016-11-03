package com.example.administrator.day01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by qianhaohong on 2016/11/1.
 */
public class MyImg extends View{
    private Paint mPaint;
    private int mColor;
    private float mRadius;
    private int mWidth;
    private int mHeight;
    private float bRadius;

    public MyImg(Context context) {
        this(context,null);
    }

    public MyImg(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyImg(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mRadius=80;
        bRadius=120;
        mColor= Color.WHITE;
        mPaint=new Paint();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(200,200,bRadius,mPaint);
        mPaint.setColor(mColor);
        canvas.drawCircle(200,200,mRadius,mPaint);
        mPaint.setColor(Color.RED);
        String  str="12";
        Rect rect=new Rect();
        mPaint.getTextBounds(str,0,str.length(),rect);
        canvas.drawText(str,200-rect.width()/2,200+rect.height()/2,mPaint);



    }
}

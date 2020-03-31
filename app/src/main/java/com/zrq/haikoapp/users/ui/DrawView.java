package com.zrq.haikoapp.users.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

/*
此类是自定义绘制视图
主要绘制小球跟着手指动
 */
public class DrawView extends View {

    private  float currentX = 40;
    private  float currentY = 50;
    Integer sum = 15;
    //创建画笔
    Paint p = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    public DrawView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //设置画笔颜色
        p.setColor(Color.RED);

        //绘制一个小圆（作为小球）
        canvas.drawCircle(currentX,currentY,sum,p);
        Log.i("绘制","小球");
    }

    //为该组件触碰事件重写事件处理
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        //修改X,Y的值
        currentX = event.getX();
        currentY = event.getY();
        sum++;

        //通知当前组件重新绘制自己
        invalidate();
        //返回true表明该方法已经处理事件
        return true;
    }
}

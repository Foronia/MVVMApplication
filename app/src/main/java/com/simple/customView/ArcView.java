package com.simple.customView;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by qijie07 on 2017/1/4.
 */

public class ArcView extends View {

    public static final int[] SWEEP_GRADIENT_COLORS = new int[]{Color.YELLOW, Color.TRANSPARENT};
    private float tableWidth;
    private Paint mPaint;
    private Path mPath;
    private RectF mTableRectF;
    //把路径分成虚线段的
    private DashPathEffect dashPathEffect;
    private RadialGradient radialGradient;
    private int mCurrentDegree = 0;

    public ArcView(Context context, AttributeSet attrs) {
        super(context);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setDither(true);
        mPaint.setColor(Color.BLACK);
        mPath = new Path();
        startAnimator();
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float size = Math.min(w, h) ;
        //油表的位置方框
        mTableRectF = new RectF(0, 0, size, size);
        mPath.reset();
        //在油表路径中增加一个从起始弧度
        mPath.addArc(mTableRectF, 60, 240);
        //计算路径的长度
        PathMeasure pathMeasure = new PathMeasure(mPath, false);
        float length = pathMeasure.getLength();
        float step = length / 20;
        dashPathEffect = new DashPathEffect(new float[]{step / 2, step / 2}, 0);

        float radius = size / 2;
        tableWidth = size;
//        radialGradient = new RadialGradient(radius-radius/2, radius, size, SWEEP_GRADIENT_COLORS, null, Shader.TileMode.REPEAT);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        radialGradient = new RadialGradient(tableWidth/2-tableWidth/4*(10+mCurrentDegree)/10, tableWidth/2, tableWidth, SWEEP_GRADIENT_COLORS, null, Shader.TileMode.REPEAT);
        float dx = (getWidth() - mTableRectF.width()) / 2;
        float dy = (getHeight() - mTableRectF.height()) / 2;
        //把油表的方框平移到正中间
        canvas.translate(dx, dy);
        canvas.save();
        //旋转画布
        canvas.rotate(90, mTableRectF.width() / 2, mTableRectF.height() / 2);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(tableWidth);
        mPaint.setPathEffect(dashPathEffect);
        mPaint.setShader(radialGradient);
        mPaint.setAlpha(150);
        canvas.drawPath(mPath, mPaint);
        canvas.restore();
    }

    public void startAnimator() {
        ValueAnimator animator = ValueAnimator.ofFloat(0, 10);
        animator.setDuration(3000);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.RESTART);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                mCurrentDegree = (int) (0 + (Float) animation.getAnimatedValue());
                invalidate();
            }
        });
        animator.start();
    }

}

package com.leiholmes.androidinterviewreview.touchevent;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * Description:
 * author         xulei
 * Date           2017/12/19
 */

public class MyViewGroup extends FrameLayout {
    public static final String TAG = "ViewGroup";

    public MyViewGroup(@NonNull Context context) {
        super(context);
    }

    public MyViewGroup(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public MyViewGroup(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent");
        return super.onTouchEvent(event);
    }

//    @Override
//    public boolean dispatchTouchEvent(MotionEvent ev) {
//        Log.e(TAG, "dispatchTouchEvent：返回true拦截");
//        //Dispatch拦截
//        return true;
//    }

//    @Override
//    public boolean onInterceptTouchEvent(MotionEvent ev) {
//        Log.e(TAG, "onInterceptTouchEvent:返回true拦截事件");
//        //Intercept拦截
//        return true;
//    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            Log.e(TAG, "onTouchEvent：ACTION_DOWN：返回true消费");
//        } else if (event.getAction() == MotionEvent.ACTION_UP) {
//            Log.e(TAG, "onTouchEvent：ACTION_UP：返回true消费");
//        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
//            Log.e(TAG, "onTouchEvent：ACTION_MOVE：返回true消费");
//        }
//        //处理拦截
//        return true;
//    }
}

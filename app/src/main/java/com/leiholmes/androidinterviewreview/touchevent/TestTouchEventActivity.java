package com.leiholmes.androidinterviewreview.touchevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

import com.leiholmes.androidinterviewreview.R;

public class TestTouchEventActivity extends AppCompatActivity {
    public static final String TAG = "Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_touch_event);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent");
        return super.onTouchEvent(event);
    }

//    @Override
//    public boolean onTouchEvent(MotionEvent event) {
//        if (event.getAction() == MotionEvent.ACTION_DOWN) {
//            Log.e(TAG, "onTouchEvent：ACTION_DOWN");
//        } else if (event.getAction() == MotionEvent.ACTION_UP) {
//            Log.e(TAG, "onTouchEvent：ACTION_UP");
//        } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
//            Log.e(TAG, "onTouchEvent：ACTION_MOVE");
//        }
//        return super.onTouchEvent(event);
//    }

}

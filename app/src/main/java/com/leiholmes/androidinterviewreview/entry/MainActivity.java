package com.leiholmes.androidinterviewreview.entry;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.leiholmes.androidinterviewreview.R;
import com.leiholmes.androidinterviewreview.lifecycle.ActivityA;
import com.leiholmes.androidinterviewreview.touchevent.TestTouchEventActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btn_life_cycle, R.id.btn_touch_event})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_life_cycle: //生命周期
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.btn_touch_event: //Touch事件分发与消费
                startActivity(new Intent(this, TestTouchEventActivity.class));
                break;
        }
    }
}

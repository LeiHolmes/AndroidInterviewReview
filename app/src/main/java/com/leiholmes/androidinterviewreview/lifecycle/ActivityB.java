package com.leiholmes.androidinterviewreview.lifecycle;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.leiholmes.androidinterviewreview.R;

public class ActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentB receiveFragment = new FragmentB();
        fragmentManager.beginTransaction().add(R.id.fl_reveive_container, receiveFragment).commit();
    }
}

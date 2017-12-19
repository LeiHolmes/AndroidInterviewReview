package com.leiholmes.androidinterviewreview.lifecycle;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.leiholmes.androidinterviewreview.R;

public class FragmentB extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e("test_fragment", "B:onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("test_fragment", "B:onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("test_fragment", "B:onCreateView");
        View view = inflater.inflate(R.layout.fragment_b, null);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("test_fragment", "B:onViewCreated");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Log.e("test_fragment", "B:onActivityCreated");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("test_fragment", "B:onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("test_fragment", "B:onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("test_fragment", "B:onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("test_fragment", "B:onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("test_fragment", "B:onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("test_fragment", "B:onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("test_fragment", "B:onDetach");
    }
}

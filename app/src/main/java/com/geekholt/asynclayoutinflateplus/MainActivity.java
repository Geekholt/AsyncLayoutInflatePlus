package com.geekholt.asynclayoutinflateplus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView txtMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final AsyncLayoutInflatePlus asyncLayoutInflatePlus = new AsyncLayoutInflatePlus(this);
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(1) onInflateFinished: " + view);
                setContentView(view);
                txtMain = findViewById(R.id.txt_main);
                txtMain.setText("Hello World");
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(2) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(3) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(4) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(5) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(6) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(7) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(8) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(9) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(10) onInflateFinished: " + view);
            }
        });

        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(11) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(12) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(13) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(14) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(15) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(16) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(17) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(18) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(19) onInflateFinished: " + view);
            }
        });
        asyncLayoutInflatePlus.inflate(R.layout.activity_main, null, new AsyncLayoutInflatePlus.OnInflateFinishedListener() {
            @Override
            public void onInflateFinished(@NonNull View view, int resid, @Nullable ViewGroup parent) {
                Log.i(TAG, "(20) onInflateFinished: " + view);
            }
        });
    }
}

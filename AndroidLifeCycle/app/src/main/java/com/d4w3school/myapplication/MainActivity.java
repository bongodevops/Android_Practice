package com.d4w3school.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

   public String TAG = "mainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG , "onCreate: ");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG , "onStart: ");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG , "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG , "onPause: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG , "onStop: ");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG , "onRestart: ");
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG , "onDestroy: ");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG , "onSaveInstanceState: ");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG , "onRestoreInstanceState: ");
    }
}
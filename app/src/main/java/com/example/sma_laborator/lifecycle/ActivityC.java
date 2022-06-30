package com.example.sma_laborator.lifecycle;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.sma_laborator.R;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
    }
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart C");
    }
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume C");
    }
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause C");
    }
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart C");
    }
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop C");
    }
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy C");
    }
    public void clicked(View view) {
        switch (view.getId()) {
            case R.id.buttonA:
                startActivity(new Intent(this, ActivityA.class));
                break;
            case R.id.buttonB:
                startActivity(new Intent(this, ActivityB.class));
                break;
            case R.id.buttonC:
                startActivity(new Intent(this, ActivityC.class));
                break;
        }
    }
}
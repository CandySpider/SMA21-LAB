package com.example.sma_laborator.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.sma_laborator.R;

public class MainIntentActivity extends AppCompatActivity {
    private Button googleButton;
    private Button googleMsaButton;
    private Button telephoneButton;
    private Button telephoneMsaButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_intent);
        googleButton = (Button) findViewById(R.id.googleButton);
        googleMsaButton = (Button) findViewById(R.id.googleMsaButton);
        telephoneButton = (Button) findViewById(R.id.telephoneButton);
        telephoneMsaButton = (Button) findViewById(R.id.telephoneMsaButton);

        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("http://www.google.com"));
                myIntent.setClass(getApplicationContext(),IntentFilterActivity.class);
                startActivity(myIntent);


            }
        });
        googleMsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent();
                myIntent.setAction("MSA.LAUNCH");
                myIntent.setData(Uri.parse("http://www.google.com"));
                myIntent.setClass(getApplicationContext(),IntentFilterActivity.class);
                startActivity(myIntent);
            }
        });
        telephoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent();
                myIntent.setAction(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("tel:00401213456"));
                myIntent.setClass(getApplicationContext(),IntentFilterActivity.class);
                startActivity(myIntent);
            }
        });
        telephoneMsaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent();
                myIntent.setAction("MSA.LAUNCH");
                myIntent.setData(Uri.parse("tel:00401213456"));
                myIntent.setClass(getApplicationContext(),IntentFilterActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
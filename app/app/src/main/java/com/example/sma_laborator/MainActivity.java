package com.example.sma_laborator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private EditText eName;
      private Button bClick;
      private TextView tName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         eName = (EditText) findViewById(R.id.eName);
        bClick = (Button) findViewById(R.id.bClick);
        tName = (TextView) findViewById(R.id.tName);

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);


        bClick.setOnClickListener(new View.OnClickListener ()
                                                   {public void onClick(View v){

                                                       myAlert.setMessage("Hello " + eName.getText() + "!");
                                                       DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                                                           @Override
                                                           public void onClick(DialogInterface dialogInterface, int i) {
                                                               Context context = getApplicationContext();
                                                               CharSequence text = "Bye toast!";
                                                               int duration = Toast.LENGTH_SHORT;

                                                               Toast toast = Toast.makeText(context, text, duration);
                                                               toast.show();

                                                           }
                                                       } ;

                                                       DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                                                           @Override
                                                           public void onClick(DialogInterface dialogInterface, int i) {
                                                               Context context = getApplicationContext();
                                                               CharSequence text = "Hello toast!";
                                                               int duration = Toast.LENGTH_SHORT;

                                                               Toast toast = Toast.makeText(context, text, duration);
                                                               toast.show();

                                                           }
                                                       } ;
                                                       myAlert.setNegativeButton("Negative",onClickListener);
                                                       myAlert.setPositiveButton("Positive",onClickListener2);
                                                       myAlert.show();




                                                       tName.setText("Hello " + eName.getText() + "!");
                                                       }
                                                   });
    }



}
package com.example.sma_laborator;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
      private EditText eName;
      private Button bClick;
      private TextView tName;
      private Button bShare;
      private Button bSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         eName = (EditText) findViewById(R.id.eName);
        bClick = (Button) findViewById(R.id.bClick);
        tName = (TextView) findViewById(R.id.tName);

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);

      //
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

        //

        Spinner spinner = (Spinner) findViewById(R.id.colors_spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.colors_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

         spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
             @Override
             public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                  String nice = spinner.getItemAtPosition(i).toString();
                  System.out.println("works");
                   switch (nice) {
                       case "Blue":
                           bClick.setBackgroundColor(Color.BLUE);
                           break;
                       case "Red":
                           System.out.println("red");
                           bClick.setBackgroundColor(Color.RED);
                           break;
                       case "Yellow":
                           bClick.setBackgroundColor(Color.YELLOW);
                           break;
                       case "Green":
                           bClick.setBackgroundColor(Color.GREEN);
                           break;
                       case "Black":
                           bClick.setBackgroundColor(Color.BLACK);
                           break;
                       case "Pink":
                           bClick.setBackgroundColor(Color.rgb(255,192,203));
                           break;
                       case "Purple":
                           bClick.setBackgroundColor(Color.rgb(230,230,250));
                           break;
                       default:
                           break;
                   }
             }

             @Override
             public void onNothingSelected(AdapterView<?> adapterView) {

             }
         });

    }
    public void clicked(View v){

    }


}
package com.example.dalton.drunkguard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private Button getTime;
    private TimePicker timepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //This is how the time for DrunkGuard to start is selected
    public void pickTime(){
        getTime =  (Button) findViewById(R.id.button);
        timepicker = (TimePicker) findViewById(R.id.timePicker);

        getTime.setOnClickListener(new View.OnClickListener(){
           public void onCLick(View v){

           }
        }
        );
    }
}

package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWakeUpObject = findViewById(R.id.button_leftwakeUp);
        Button buttonExploreObject = findViewById(R.id.button_rightExplore);
        //
        buttonWakeUpObject.setOnClickListener(this);
        buttonExploreObject.setOnClickListener(this);
    } // end of onCreate method
    public void onClick(View v)
    {
        if(v.getId() == R.id.button_leftwakeUp)
        {
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, ExploreActivity.class);
            startActivity(i);
        }
    }
} // end of MainActivity class

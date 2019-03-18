package com.example.palmdigital.chooseyourownadventure_01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        Button buttonLeftYes = findViewById(R.id.buttonLeftYes);
        Button buttonRightHeckYes = findViewById(R.id.buttonRightHeckYes);

        buttonLeftYes.setOnClickListener(this);
        buttonRightHeckYes.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonLeftYes)
        {
            Intent i = new Intent(this, AfterYesActivities.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, AfterYesActivities.class);
            startActivity(i);
        }
    }
}

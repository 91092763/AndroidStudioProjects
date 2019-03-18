package com.example.palmdigital.buttontolog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButtonObject1 = (Button)findViewById(R.id.button1);

        myButtonObject1.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        Log.i("info", "Hi there!");
    }
}

package com.example.palmdigital.buttontotextview01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        TextView tvObject1 = findViewById(R.id.textView1);
        String text = tvObject1.getText().toString();

        if(text == "On")
            tvObject1.setText("Off");
        else // It must be off
        tvObject1.setText("On");
    }
}

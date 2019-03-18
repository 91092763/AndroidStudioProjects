package com.example.palmdigital.madlibspizza_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        EditText etAdjective1 = findViewById(R.id.etAdjective1);
        String adjective1Str = etAdjective1.getText().toString();

        EditText etNationality = findViewById(R.id.etNationality);
        String nationalitlyStr = etNationality.getText().toString();

        String story = "Pizza was invented by a(n)";
        story = story + adjective1Str;
        story = story + " " + nationalitlyStr;

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }

} // end of class

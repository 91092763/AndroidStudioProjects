package com.example.palmdigital.edittest01;

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

        Button buttonGetName = findViewById(R.id.buttonGetName);
        buttonGetName.setOnClickListener(this);
    } // end of onCreate method
    public void onClick(View view)
    {
        EditText firstNameObject = findViewById(R.id.etFName);
        String firstStr = firstNameObject.getText().toString();

        EditText lastNameObject = findViewById(R.id.etLName);
        String lastStr = lastNameObject.getText().toString();

        String fullName = firstStr + " " + lastStr;

        TextView tvOutput = findViewById(R.id.tvOutput);
        tvOutput.setText(fullName);
    }
} // end of class

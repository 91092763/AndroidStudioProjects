package com.example.palmdigital.simplecalc__v02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // member variables (class-wide variables)
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    double result;
    char operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        textViewNum1Display = findViewById(R.id.tvnum1Display);
        textViewNum2Display = findViewById(R.id.tvnum2Display);
        textViewOutput = findViewById(R.id.textView_Output);
        // create a reference to the XMl UI TextViewx
        // create a reference to the ImageView XML UI elements
        ImageView imageView1 = findViewById(R.id.imageView1);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        //
        ImageView imageView_1 = findViewById(R.id.imageView_1);
        ImageView imageView_2 = findViewById(R.id.imageView_2);
        ImageView imageView_3 = findViewById(R.id.imageView_3);
        ImageView imageView_4 = findViewById(R.id.imageView_4);
        ImageView imageView_5 = findViewById(R.id.imageView_5);
        ImageView imageView_6 = findViewById(R.id.imageView_6);
        ImageView imageViewEqual = findViewById(R.id.imageView_equal);
        ImageView imageViewPlus = findViewById(R.id.imageView_plus);
        ImageView imageViewSubtract = findViewById(R.id.imageView_subtract);
        // setting imageview objects to be clickableX
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView_1.setOnClickListener(this);
        imageView_2.setOnClickListener(this);
        imageView_3.setOnClickListener(this);
        imageView_4.setOnClickListener(this);
        imageView_5.setOnClickListener(this);
        imageView_6.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);
        imageViewPlus.setOnClickListener(this);
        imageViewSubtract.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v.getId() == R.id.imageView1)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if(v.getId() == R.id.imageView2)
        {
            textViewNum1Display.setText("2");
            num1 = 2;
        }
        else if(v.getId() == R.id.imageView3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if(v.getId() == R.id.imageView4)
        {
            textViewNum1Display.setText("4");
            num1 = 4;
        }
        else if(v.getId() == R.id.imageView5)
        {
            textViewNum1Display.setText("5");
            num1 = 5;
        }
        else if(v.getId() == R.id.imageView6)
        {
            textViewNum1Display.setText("6");
            num1 = 6;
        }
        else if(v.getId() == R.id.imageView_1)
        {
            textViewNum2Display.setText("1");
            num2 = 1;
        }
        else if(v.getId() == R.id.imageView_2)
        {
            textViewNum2Display.setText("2");
            num2 = 2;
        }
        else if(v.getId() == R.id.imageView_3)
        {
            textViewNum2Display.setText("3");
            num2 = 3;
        }
        else if(v.getId() == R.id.imageView_4)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if(v.getId() == R.id.imageView_5)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if(v.getId() == R.id.imageView_6)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if(v.getId() == R.id.imageView_plus)
        {
            operation = '+';
        }
        else if(v.getId() == R.id.imageView_subtract)
        {
            operation = '-';
        }
        else if (v.getId() == R.id.imageView_equal)
        {
            if (operation == '+')
            {
                result = num1 + num2;
            }
            else if (operation == '-')
            {
                result = num1 - num2;
            }
            textViewOutput.setText("" + result);
        }
    }
}
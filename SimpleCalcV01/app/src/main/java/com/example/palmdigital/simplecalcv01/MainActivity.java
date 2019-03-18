package com.example.palmdigital.simplecalcv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    // member variables (class-wide variables)
    TextView textViewNum1Display;
    TextView textViewNum2Display;
    TextView textViewOutput;
    int num1;
    int num2;
    int sum;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewNum1Display = findViewById(R.id.tvnum1Display);
        textViewNum2Display = findViewById(R.id.tvnum2Display);
        textViewOutput = findViewById(R.id.textView_Output);
        // create a reference to the XML UI TextView
        TextView textViewNum1Display = findViewById(R.id.tvnum1Display);
        TextView textViewNum2Display = findViewById(R.id.tvnum2Display);
        // create a reference to the ImageView XML UI elements
        ImageView imageView1 = findViewById(R.id.imageView);
        ImageView imageView2 = findViewById(R.id.imageView2);
        ImageView imageView3 = findViewById(R.id.imageView3);
        ImageView imageView4 = findViewById(R.id.imageView4);
        ImageView imageView5 = findViewById(R.id.imageView5);
        ImageView imageView6 = findViewById(R.id.imageView6);
        ImageView imageViewEqual = findViewById(R.id.imageView_equals);

        // setting imageview objects to be clickableX
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageViewEqual.setOnClickListener(this);
    } //] end of onCreate( )

    public void onClick (View v)
    {
        if (v.getId() == R.id.imageView)
        {
            textViewNum1Display.setText("1");
            num1 = 1;
        }
        else if (v.getId() == R.id.imageView2)
        {
            textViewNum1Display.setText("2");;
            num1 = 2;
        }
        else if (v.getId() == R.id.imageView3)
        {
            textViewNum1Display.setText("3");
            num1 = 3;
        }
        else if (v.getId() == R.id.imageView4)
        {
            textViewNum2Display.setText("4");
            num2 = 4;
        }
        else if (v.getId() == R.id.imageView5)
        {
            textViewNum2Display.setText("5");
            num2 = 5;
        }
        else if (v.getId() == R.id.imageView6)
        {
            textViewNum2Display.setText("6");
            num2 = 6;
        }
        else if (v.getId() == R.id.imageView_equals)
        {
            sum = num1+ num2;
             textViewOutput.setText("" + sum);
        }
    }
}
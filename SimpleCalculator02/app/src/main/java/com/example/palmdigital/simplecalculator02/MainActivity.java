package com.example.palmdigital.simplecalculator02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView topOutput;
    TextView midOutput;
    TextView answerOutput;
   ImageButton plus;
   ImageButton minus;
   int firstAddend;
   int secondAddend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topOutput = findViewById(R.id.tv_top_num_output);
        midOutput = findViewById(R.id.tv_mid_num_output);
       answerOutput = findViewById(R.id.tv_answer);

        ImageButton num0 = findViewById(R.id.ib_num0);
        ImageButton num1 = findViewById(R.id.ib_num1);
        ImageButton num2 = findViewById(R.id.ib_num2);
        ImageButton num3 = findViewById(R.id.ib_num3);
        ImageButton num4 = findViewById(R.id.ib_num4);
        ImageButton num5 = findViewById(R.id.ib_num5);
        ImageButton num6 = findViewById(R.id.ib_num6);
        ImageButton num7 = findViewById(R.id.ib_num7);
        ImageButton num8 = findViewById(R.id.ib_num8);
        ImageButton num9 = findViewById(R.id.ib_num9);
       plus = findViewById(R.id.ib_plus);
         minus = findViewById(R.id.ib_minus);
        ImageButton num0_2 = findViewById(R.id.ib_num0_2);
        ImageButton num1_2 = findViewById(R.id.ib_num1_2);
        ImageButton num2_2 = findViewById(R.id.ib_num2_2);
        ImageButton num3_2 = findViewById(R.id.ib_num3_2);
        ImageButton num4_2 = findViewById(R.id.ib_num4_2);
        ImageButton num5_2 = findViewById(R.id.ib_num5_2);
        ImageButton num6_2 = findViewById(R.id.ib_num6_2);
        ImageButton num7_2 = findViewById(R.id.ib_num7_2);
        ImageButton num8_2 = findViewById(R.id.ib_num8_2);
        ImageButton num9_2 = findViewById(R.id.ib_num9_2);
//
        num0.setOnClickListener(this);
        num1.setOnClickListener(this);
        num2.setOnClickListener(this);
        num3.setOnClickListener(this);
        num4.setOnClickListener(this);
        num5.setOnClickListener(this);
        num6.setOnClickListener(this);
        num7.setOnClickListener(this);
        num8.setOnClickListener(this);
        num9.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        num0_2.setOnClickListener(this);
        num1_2.setOnClickListener(this);
        num2_2.setOnClickListener(this);
        num3_2.setOnClickListener(this);
        num4_2.setOnClickListener(this);
        num5_2.setOnClickListener(this);
        num6_2.setOnClickListener(this);
        num7_2.setOnClickListener(this);
        num8_2.setOnClickListener(this);
        num9_2.setOnClickListener(this);
    }
    public void onClick(View view) {
        if(view.getId() == R.id.ib_num0) {
            firstAddend = 0;
            topOutput.setText("0");
        }
        else if(view.getId() == R.id.ib_num1) {
            firstAddend = 1;
            topOutput.setText("1");
        }
        else if(view.getId() == R.id.ib_num2) {
            firstAddend = 2;
            topOutput.setText("2");
        }
        else  if(view.getId() == R.id.ib_num3) {
            firstAddend = 3;
            topOutput.setText("3");
        }
        else if(view.getId() == R.id.ib_num4) {
            firstAddend = 4;
            topOutput.setText("4");
        }
        else if(view.getId() == R.id.ib_num5) {
            firstAddend = 5;
            topOutput.setText("5");
        }
        else if(view.getId() == R.id.ib_num6) {
            firstAddend = 6;
            topOutput.setText("6");
        }
        else if(view.getId() == R.id.ib_num7) {
            firstAddend = 7;
            topOutput.setText("7");
        }
        else if(view.getId() == R.id.ib_num8) {
            firstAddend = 8;
            topOutput.setText("8");
        }
        else if(view.getId() == R.id.ib_num9) {
            firstAddend = 9;
            topOutput.setText("9");
        }
        else if(view.getId() == R.id.ib_num0_2) {
            secondAddend = 0;
            midOutput.setText("0");
        }
        else if(view.getId() == R.id.ib_num1_2) {
            secondAddend = 1;
            midOutput.setText("1");
        }
        else if(view.getId() == R.id.ib_num2_2) {
            secondAddend = 2;
            midOutput.setText("2");
        }
        else if(view.getId() == R.id.ib_num3_2) {
            secondAddend = 3;
            midOutput.setText("3");
        }
        else if(view.getId() == R.id.ib_num4_2) {
            secondAddend = 4;
            midOutput.setText("4");
        }
        else if(view.getId() == R.id.ib_num5_2) {
            secondAddend = 5;
            midOutput.setText("5");
        }
        else if(view.getId() == R.id.ib_num6_2) {
            secondAddend = 6;
            midOutput.setText("6");
        }
        else if(view.getId() == R.id.ib_num7_2) {
            secondAddend = 7;
            midOutput.setText("7");
        }
        else if(view.getId() == R.id.ib_num8_2) {
            secondAddend = 8;
            midOutput.setText("8");
        }
        else if(view.getId() == R.id.ib_num9_2) {
            secondAddend = 9;
            midOutput.setText("9");
        }
        int sum = firstAddend + secondAddend;
        int difference = firstAddend - secondAddend;
         String answerStr = " " + sum;
         String answerStr2 = " " + difference;

        if (view.getId() == R.id.ib_plus)
        {
            answerOutput.setText(answerStr);
        }
        else if (view.getId() == R.id.ib_minus)
        {
            answerOutput.setText(answerStr2);
        }
    }


}//end of class


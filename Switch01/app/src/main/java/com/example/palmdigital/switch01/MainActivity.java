package com.example.palmdigital.switch01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    public TextView tvObject1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch switchObject1 = findViewById(R.id.switch1);
        switchObject1.setOnClickListener(this);

        TextView tvObject1 = findViewById(R.id.textView1);

    } // End of onCreate method

    public void onClick (View v)
    {
        if(v.getId() ==  R.id.switch1)
        {

            if(tvText == "Off")
                tvObject1.setText("On");
            else
                tvObject1.setText("Off");

        }
    }

} // End of class

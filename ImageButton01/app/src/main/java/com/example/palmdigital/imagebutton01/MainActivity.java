package com.example.palmdigital.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton stopsignButton = findViewById(R.id.ib_stopsign);
        ImageButton arrowsButton = findViewById(R.id.ib_arrows);
        ImageButton chromeButton = findViewById(R.id.ib_chrome);
        TextView clickableText = findViewById(R.id.tv_click);
        stopsignButton.setOnClickListener(this);
        arrowsButton.setOnClickListener(this);
        chromeButton.setOnClickListener(this);
        clickableText.setOnClickListener(this);
    } // end of onCreate
    public void onClick(View view){
        if(view.getId() == R.id.ib_stopsign)
        {
            Toast.makeText(this, "You clicked on a stopsign", Toast.LENGTH_SHORT).show();
        }
       else if(view.getId() == R.id.ib_arrows)
        {
            Toast.makeText(this, "You clicked on some arrows", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.ib_chrome) {
            Toast.makeText(this, "You clicked on chrome", Toast.LENGTH_SHORT).show();
        }
        else if(view.getId() == R.id.tv_click) {
            Toast.makeText(this, "Why are you clicking on words", Toast.LENGTH_SHORT).show();
        }
    }

}//end of class

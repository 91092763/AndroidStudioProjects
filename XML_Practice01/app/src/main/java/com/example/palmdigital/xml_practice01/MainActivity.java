package com.example.palmdigital.xml_practice01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("info" , "Hello Everybody");
        int a = 10;
        String b = "Alan Turing";
        boolean c = true;

        Log.i("info", "a = " + a);
        Log.i("info", "b = " + b);
        Log.i("info", "c = " + c);

        a++;
        a = a + 10;
        Log.i("info", "a = " + a);
        b = b + " was smarter than the average bear.";
    }
}

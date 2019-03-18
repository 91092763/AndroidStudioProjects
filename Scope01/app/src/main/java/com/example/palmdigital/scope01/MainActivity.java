package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int myInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // declare a local variable
        // dateType variableMa,e; <--- local Variable Declaration

        // examples of primitive types and declarations
        int myInt; // int is a  Java primitive type
        double myDouble; // double is a Java primitive type
        char myChar = 'A';
        float myFloat;
        boolean myBool;
        long myLong;
        byte myByte;
        // Not primitive, are classes
        String myString;
        Integer myInt2;
        Float myFloat2;
        Double myDouble2;
        // assign values to these variables
        myString = "This is an awesome string";
        myInt = 5;
        myInt = awesomeMethod(myInt);
        Log.i("info","myInt = " + myInt);
        myDouble = 5.6;
        myFloat = 5.7f;
        myBool = true;
        myBool = false;

        TextView tv_Num1Display = findViewById(R.id.tv_top);
        TextView tv_Num2Display;

        ImageView iv_stuff;
        Button button;

        awesomeMethod2();
    } // end of onCreate

    public int awesomeMethod (int input)
    {
        myInt = 10;
        awesomeMethod2();
        return input + 5;
    }

    public void awesomeMethod2()
    {
        myInt = 42;
        System.out.println("myInt =" + 3.14159);
    }

} // end of MainActivity class

package com.example.palmdigital.madlibpuppylove;

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
    public void onClick(View view)
    {
        EditText etColor = findViewById(R.id.etColor);
        String et1Color = etColor.getText().toString();

        EditText etBodyPart = findViewById(R.id.etBodyPart);
        String et1BodyPart = etBodyPart.getText().toString();

        EditText etNoun1 = findViewById(R.id.etNoun1);
        String eTNoun1 = etNoun1.getText().toString();

        EditText etVerb1 = findViewById(R.id.etVerb);
        String eTVerb1 = etVerb1.getText().toString();

        EditText etAdjective1 = findViewById(R.id.etAdjective1);
        String eTAdjective1 = etAdjective1.getText().toString();

        EditText etAdjective2 = findViewById(R.id.etAdjective2);
        String eTAdjective2 = etAdjective2.getText().toString();

        EditText etVerbs = findViewById(R.id.etVerbs);
        String eTVerbs = etVerbs.getText().toString();

        EditText etNoun2 = findViewById(R.id.etNoun2);
        String eTNoun2 = etNoun2.getText().toString();

        EditText etNoun3 = findViewById(R.id.etNoun3);
        String eTNoun3 = etNoun3.getText().toString();

        String story = "Today I saw him again. When he looks at me with those ";
        story = story  + et1Color + " eyes, it makes my";
        story = story + " " + et1BodyPart + " go pitterpat, and feel as it I have";
        story = story + " " + eTNoun1 + " in my stomach. When he scrunches his nose, I want to";
        story = story + " " + eTVerb1 + " him softly. He is so";
        story = story + " " + eTAdjective1 + " and";
        story = story + " " + eTAdjective2 + ". Tomorrow he will be mine. For now he";
        story = story + " " + eTVerbs + " in the store";
        story = story + " " + eTNoun2 + " looking at me.";
        story = story + " " + eTNoun3 + " love is hard to resist!";

        TextView output = findViewById(R.id.tvStory);
        output.setText(story);
    }
}
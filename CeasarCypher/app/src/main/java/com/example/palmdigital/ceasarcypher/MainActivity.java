package com.example.palmdigital.ceasarcypher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.buttonEncrypt);
        button.setOnClickListener(this);
        //
        Button button2 = findViewById(R.id.buttonDecrypt);
        button2.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        EditText etText = findViewById(R.id.etEncryptText);
        String et1Message = etText.getText().toString();
        int shift = 10;
        //
        TextView tv_output = findViewById(R.id.tvOutput);
        if (view.getId() == R.id.buttonDecrypt)
        {
            String encrypted = encrypt(et1Message, shift);
            tv_output.setText(encrypted);
        }
        //
    } // wns of onClick
    public String encrypt (String input, int shift)
    {

    String output = "";
    int alphabetSize = 26;
    char[] alphabet = new char[alphabetSize];
    alphabet[0] = 'A';
    alphabet[1] = 'B';
    alphabet[2] = 'C';
    alphabet[3] = 'D';
    alphabet[4] = 'E';
    alphabet[5] = 'F';
    alphabet[6] = 'G';
    alphabet[7] = 'H';
    alphabet[8] = 'I';
    alphabet[9] = 'J';
    alphabet[10] = 'K';
    alphabet[11] = 'L';
    alphabet[12] = 'M';
    alphabet[13] = 'N';
    alphabet[14] = 'O';
    alphabet[15] = 'P';
    alphabet[16] = 'Q';
    alphabet[17] = 'R';
    alphabet[18] = 'S';
    alphabet[19] = 'T';
    alphabet[20] = 'U';
    alphabet[21] = 'V';
    alphabet[22] = 'W';
    alphabet[23] = 'X';
    alphabet[24] = 'Y';
    alphabet[25] = 'Z';
    //
    input = input.toUpperCase();
    //
    for (int i = 0; i < input.length(); i++)
    {
        char thisChar = input.charAt(i);
        if (thisChar == ' ')
        {
            output += ' ';
        }
        else
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (thisChar == alphabet[j])
                {
                    int shiftedIndex = (j + shift) % alphabetSize;
                    System.out.println("The encrypted character is " + alphabet[shiftedIndex]);
                    output += alphabet[shiftedIndex];
                }
            }
        }
    }
    return output;
} // end of encrypt
} // end of Main Activity

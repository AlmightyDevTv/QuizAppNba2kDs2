package com.patterson.dsmith.quizappnba2kds;

import  android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button truebutton;
    Button falsebutton;
    TextView question;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (TextView) findViewById(R.id.question1);
        truebutton= (Button) findViewById(R.id.TrueButton);
        falsebutton = (Button) findViewById(R.id.FalseButton);






    }
}
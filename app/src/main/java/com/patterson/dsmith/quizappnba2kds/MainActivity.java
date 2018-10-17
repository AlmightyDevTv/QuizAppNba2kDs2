package com.patterson.dsmith.quizapp2kds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button truebutton;
    Button falsebutton;
    TextView question;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (TextView) findViewById(R.id.question1);
        truebutton= (Button) findViewById(R.id.button1);
        falsebutton = (Button) findViewById(R.id.button2);

        truebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
            }
        });


        falsebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"incorrect",Toast.LENGTH_SHORT).show();
            }
        });

    }

}

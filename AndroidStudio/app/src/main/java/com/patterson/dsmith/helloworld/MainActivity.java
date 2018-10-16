package com.patterson.dsmith.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class MainActivity extends AppCompatActivity {

    EditText editname;
    Button button;
    TextView helloName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editname = (EditText) findViewById(R.id.editname);
        button = (Button) findViewById(R.id.button);
        helloName = (TextView) findViewById(R.id.helloName);
    }
       public void getGreeting(View view){


           String firstName= editname.getText().toString();
           helloName.setText("hello" + " "  +   firstName);




        }

}

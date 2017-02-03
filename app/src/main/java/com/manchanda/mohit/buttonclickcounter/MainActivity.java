package com.manchanda.mohit.buttonclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText userInput;
    private Button button;
    private TextView textView;
    private int numTimesClicked = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userInput = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);
        textView.setText("");

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        numTimesClicked ++;
        String result = "\nThe Button got tapped " + numTimesClicked  + " time ";
        textView.append(result);
    }
}

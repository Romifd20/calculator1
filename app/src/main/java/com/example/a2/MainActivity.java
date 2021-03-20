package com.example.a2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    TextWatcher textWatcher;
    private EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onButtonClick(View v) {
        EditText e1 = (EditText) findViewById(R.id.editTextNumber);
        EditText e2 = (EditText) findViewById(R.id.editTextNumber2);
        TextView restText = (TextView) findViewById(R.id.parent);


        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int resSum = num1 + num2;
        restText.setText(Integer.toString(resSum));


    }
}





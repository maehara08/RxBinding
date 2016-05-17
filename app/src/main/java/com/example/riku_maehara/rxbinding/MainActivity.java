package com.example.riku_maehara.rxbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AutoCompleteTextView emailEditText=(AutoCompleteTextView)findViewById(R.id.email);
        EditText passwordText=(EditText)findViewById(R.id.password);
        Button signinButton=(Button)findViewById(R.id.signin_button);

    }
}

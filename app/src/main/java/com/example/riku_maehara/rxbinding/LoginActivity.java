package com.example.riku_maehara.rxbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    private  static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9-._/+?]+@[A-Za-z0-9-_]+.[A-Za-z0-9-._]+$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^[a-zA-Z0-9]{8,20}$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}

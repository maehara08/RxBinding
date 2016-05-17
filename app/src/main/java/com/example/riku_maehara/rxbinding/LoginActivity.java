package com.example.riku_maehara.rxbinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.jakewharton.rxbinding.widget.RxTextView;

import java.util.regex.Pattern;

import rx.Observable;
import rx.functions.Func1;

public class LoginActivity extends AppCompatActivity {
    private  static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9-._/+?]+@[A-Za-z0-9-_]+.[A-Za-z0-9-._]+$");
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("^[a-zA-Z0-9]{8,20}$");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        AutoCompleteTextView emailEditText=(AutoCompleteTextView)findViewById(R.id.email);
        EditText passwordText=(EditText)findViewById(R.id.password);
        Button signinButton=(Button)findViewById(R.id.signin_button);

        //Observable
    }
    /**
     * EditTextなどTextViewの入力の状態を正規表現のPatternと比較して、パターンをみたいしているかBooleanのObservableで結果を返すメソッド
     */
    private Observable<Boolean> observePatternTextChange(TextView textView ,final  Pattern pattern){
        return RxTextView.textChanges(textView)
                .map(new Func1<CharSequence, Boolean>() {
                    @Override
                    public Boolean call(CharSequence charSequence) {
                        return pattern.matcher(charSequence).find();
                    }
                });
    }
}

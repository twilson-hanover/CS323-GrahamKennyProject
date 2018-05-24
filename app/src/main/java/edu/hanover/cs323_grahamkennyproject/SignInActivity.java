package edu.hanover.cs323_grahamkennyproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    //Get the text from the EditText box and add it to the TextView
    public void onClickSignIn (View view) {
        EditText et = (EditText) findViewById(R.id.SignIn);
        TextView tv = (TextView) findViewById(R.id.Patrons);
        String origtv = tv.getText().toString();
        String newtv = origtv + et.getText().toString() + "\n";
        tv.setText(newtv);
        et.setText("");
    }
}

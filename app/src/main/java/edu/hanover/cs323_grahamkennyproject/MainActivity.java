package edu.hanover.cs323_grahamkennyproject;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSignIn (View view) {
        Intent intent = new Intent(MainActivity.this, SignInActivity.class);
    }
}
